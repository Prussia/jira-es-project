package com.jira.elasticsearch.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {com.jira.elasticsearch.configuration.ElasticsearchClientConfiguration.class})
@ComponentScan(basePackages = {"com.thenational.eu.bep.transaction.nba"})
public class GeneralConfiguration {

}
