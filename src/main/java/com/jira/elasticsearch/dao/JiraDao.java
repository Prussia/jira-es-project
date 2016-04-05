package com.jira.elasticsearch.dao;

import com.jira.elasticsearch.model.json.Issue;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface JiraDao  {

    Issue getIssue(String issueId) throws IOException, JAXBException;
}
