/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.database.tables.daos;


import com.platform.chorus.database.tables.FieldModel;
import com.platform.chorus.database.tables.records.FieldModelRecord;

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
public class FieldModelDao extends DAOImpl<FieldModelRecord, com.platform.chorus.database.tables.pojos.FieldModel, Integer> {

    /**
     * Create a new FieldModelDao without any configuration
     */
    public FieldModelDao() {
        super(FieldModel.FIELD_MODEL, com.platform.chorus.database.tables.pojos.FieldModel.class);
    }

    /**
     * Create a new FieldModelDao with an attached configuration
     */
    public FieldModelDao(Configuration configuration) {
        super(FieldModel.FIELD_MODEL, com.platform.chorus.database.tables.pojos.FieldModel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.platform.chorus.database.tables.pojos.FieldModel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchById(Integer... values) {
        return fetch(FieldModel.FIELD_MODEL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.platform.chorus.database.tables.pojos.FieldModel fetchOneById(Integer value) {
        return fetchOne(FieldModel.FIELD_MODEL.ID, value);
    }

    /**
     * Fetch records that have <code>owner IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByOwner(String... values) {
        return fetch(FieldModel.FIELD_MODEL.OWNER, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByName(String... values) {
        return fetch(FieldModel.FIELD_MODEL.NAME, values);
    }

    /**
     * Fetch records that have <code>label IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByLabel(String... values) {
        return fetch(FieldModel.FIELD_MODEL.LABEL, values);
    }

    /**
     * Fetch records that have <code>class IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByClass(String... values) {
        return fetch(FieldModel.FIELD_MODEL.CLASS, values);
    }

    /**
     * Fetch records that have <code>unit IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByUnit(String... values) {
        return fetch(FieldModel.FIELD_MODEL.UNIT, values);
    }

    /**
     * Fetch records that have <code>range IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByRange(String... values) {
        return fetch(FieldModel.FIELD_MODEL.RANGE, values);
    }

    /**
     * Fetch records that have <code>default IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByDefault(String... values) {
        return fetch(FieldModel.FIELD_MODEL.DEFAULT, values);
    }

    /**
     * Fetch records that have <code>format IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByFormat(String... values) {
        return fetch(FieldModel.FIELD_MODEL.FORMAT, values);
    }

    /**
     * Fetch records that have <code>optional IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByOptional(Boolean... values) {
        return fetch(FieldModel.FIELD_MODEL.OPTIONAL, values);
    }

    /**
     * Fetch records that have <code>configurable IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByConfigurable(Boolean... values) {
        return fetch(FieldModel.FIELD_MODEL.CONFIGURABLE, values);
    }

    /**
     * Fetch records that have <code>collectible IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByCollectible(Boolean... values) {
        return fetch(FieldModel.FIELD_MODEL.COLLECTIBLE, values);
    }

    /**
     * Fetch records that have <code>collector IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByCollector(String... values) {
        return fetch(FieldModel.FIELD_MODEL.COLLECTOR, values);
    }

    /**
     * Fetch records that have <code>interval IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByInterval(Integer... values) {
        return fetch(FieldModel.FIELD_MODEL.INTERVAL, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.platform.chorus.database.tables.pojos.FieldModel> fetchByDescription(String... values) {
        return fetch(FieldModel.FIELD_MODEL.DESCRIPTION, values);
    }
}