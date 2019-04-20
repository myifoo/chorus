package com.platform.chorus.conf;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Neo4jConfiguration {
    @Value("${server.neo4j.url}")
    String url;

    @Value("${server.neo4j.username}")
    String username;

    @Value("${server.neo4j.password}")
    String password;


    @Bean
    Driver getDriver() {
        return GraphDatabase.driver(url, AuthTokens.basic(username, password));
    }
}
