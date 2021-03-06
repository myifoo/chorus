/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.db.tables.daos;


import com.platform.chorus.db.tables.ClassModel;
import com.platform.chorus.db.tables.records.ClassModelRecord;

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
public class ClassModelDao extends DAOImpl<ClassModelRecord, com.platform.chorus.db.tables.pojos.ClassModel, Integer> {

    /**
     * Create a new ClassModelDao without any configuration
     */
    public ClassModelDao() {
        super(ClassModel.CLASS_MODEL, com.platform.chorus.db.tables.pojos.ClassModel.class);
    }

    /**
     * Create a new ClassModelDao with an attached configuration
     */
    public ClassModelDao(Configuration configuration) {
        super(ClassModel.CLASS_MODEL, com.platform.chorus.db.tables.pojos.ClassModel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.platform.chorus.db.tables.pojos.ClassModel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchById(Integer... values) {
        return fetch(ClassModel.CLASS_MODEL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.platform.chorus.db.tables.pojos.ClassModel fetchOneById(Integer value) {
        return fetchOne(ClassModel.CLASS_MODEL.ID, value);
    }

    /**
     * Fetch records that have <code>domain IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchByDomain(String... values) {
        return fetch(ClassModel.CLASS_MODEL.DOMAIN, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchByName(String... values) {
        return fetch(ClassModel.CLASS_MODEL.NAME, values);
    }

    /**
     * Fetch records that have <code>extend IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchByExtend(String... values) {
        return fetch(ClassModel.CLASS_MODEL.EXTEND, values);
    }

    /**
     * Fetch records that have <code>label IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchByLabel(String... values) {
        return fetch(ClassModel.CLASS_MODEL.LABEL, values);
    }

    /**
     * Fetch records that have <code>modifier IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchByModifier(String... values) {
        return fetch(ClassModel.CLASS_MODEL.MODIFIER, values);
    }

    /**
     * Fetch records that have <code>scope IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchByScope(String... values) {
        return fetch(ClassModel.CLASS_MODEL.SCOPE, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.platform.chorus.db.tables.pojos.ClassModel> fetchByDescription(String... values) {
        return fetch(ClassModel.CLASS_MODEL.DESCRIPTION, values);
    }
}
