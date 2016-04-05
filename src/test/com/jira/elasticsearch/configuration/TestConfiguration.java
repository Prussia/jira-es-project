package com.jira.elasticsearch.configuration;

import com.jira.elasticsearch.dao.JiraDao;
import com.jira.elasticsearch.dao.JiraDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jira.elasticsearch")
public class TestConfiguration {

    @Bean
    public JiraDao jiraDao(){return new JiraDaoImpl();}

}
