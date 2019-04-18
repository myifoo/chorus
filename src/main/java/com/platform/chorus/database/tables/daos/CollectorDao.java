/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.database.tables.daos;


import com.platform.chorus.database.tables.Collector;
import com.platform.chorus.database.tables.records.CollectorRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollectorDao extends DAOImpl<CollectorRecord, com.platform.chorus.database.tables.pojos.Collector, String> {

    /**
     * Create a new CollectorDao without any configuration
     */
    public CollectorDao() {
        super(Collector.COLLECTOR, com.platform.chorus.database.tables.pojos.Collector.class);
    }

    /**
     * Create a new CollectorDao with an attached configuration
     */
    public CollectorDao(Configuration configuration) {
        super(Collector.COLLECTOR, com.platform.chorus.database.tables.pojos.Collector.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.platform.chorus.database.tables.pojos.Collector object) {
        return object.getName();
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.Collector> fetchByName(String... values) {
        return fetch(Collector.COLLECTOR.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public com.platform.chorus.database.tables.pojos.Collector fetchOneByName(String value) {
        return fetchOne(Collector.COLLECTOR.NAME, value);
    }

    /**
     * Fetch records that have <code>result IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.Collector> fetchByResult(String... values) {
        return fetch(Collector.COLLECTOR.RESULT, values);
    }

    /**
     * Fetch records that have <code>injects IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.Collector> fetchByInjects(String[]... values) {
        return fetch(Collector.COLLECTOR.INJECTS, values);
    }

    /**
     * Fetch records that have <code>argument IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.Collector> fetchByArgument(String... values) {
        return fetch(Collector.COLLECTOR.ARGUMENT, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.Collector> fetchByDescription(String... values) {
        return fetch(Collector.COLLECTOR.DESCRIPTION, values);
    }
}
