package com.jira.elasticsearch.dao;

import com.jira.elasticsearch.model.json.Issue;
import com.jira.elasticsearch.utils.JiraConstants;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import static com.jira.elasticsearch.utils.JiraConstants.*;

@Component
public class JiraDaoImpl implements JiraDao {


    public Issue getIssue(String issueId) throws IOException, JAXBException{

        URL url = new URL(JIRA_URL + issueId);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        JAXBContext jc = JAXBContext.newInstance(Issue.class);
        InputStream json = connection.getInputStream();

        String result = getStringFromInputStream(json).replaceAll("[^\\x20-\\x7e]", "");
        StringReader reader = new StringReader(result);
        Issue issue = (Issue) jc.createUnmarshaller().unmarshal(reader);
        return issue;
    }

    private static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();

    }

}
