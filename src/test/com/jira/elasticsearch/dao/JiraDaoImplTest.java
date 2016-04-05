package com.jira.elasticsearch.dao;

import com.jira.elasticsearch.configuration.TestConfiguration;
import org.junit.Test;
import javax.inject.Inject;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = {TestConfiguration.class})
public class JiraDaoImplTest {

    @InjectMocks
    private JiraDaoImpl jiraDao;

    @Test
    public void testGetIssueFromJira() throws Exception{

        String issueId = "JRA-9";

        jiraDao.getIssue(issueId);

    }
}
