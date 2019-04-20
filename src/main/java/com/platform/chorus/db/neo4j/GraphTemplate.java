package com.platform.chorus.db.neo4j;

import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.neo4j.driver.v1.Values.parameters;

@Component
public class GraphTemplate {
    final static Logger logger = LoggerFactory.getLogger(GraphTemplate.class);

    @Autowired
    Driver driver;

    public void run(String clause) {
        logger.debug("create graph : {}", clause);
        try (Session session = driver.session()) {
            session.writeTransaction((t)->t.run(clause));
        }
    }

    public void run(String clause, Value value) {
        logger.debug("create graph : {}", clause);
        try (Session session = driver.session()) {
            session.writeTransaction((t)->t.run(clause,
                    parameters("message", value)));
        }
    }

    public void run(String clause, Map<String, Object> parameters) {
        logger.debug("create graph : {}", clause);
        try (Session session = driver.session()) {
            session.writeTransaction((t)->t.run(clause,
                    parameters));
        }
    }

}
