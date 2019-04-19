/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.db;


import com.platform.chorus.db.tables.ClassModel;
import com.platform.chorus.db.tables.Collector;
import com.platform.chorus.db.tables.Entity;
import com.platform.chorus.db.tables.FieldModel;
import com.platform.chorus.db.tables.Relationship;
import com.platform.chorus.db.tables.Value;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.class_model</code>.
     */
    public static final ClassModel CLASS_MODEL = com.platform.chorus.db.tables.ClassModel.CLASS_MODEL;

    /**
     * The table <code>public.collector</code>.
     */
    public static final Collector COLLECTOR = com.platform.chorus.db.tables.Collector.COLLECTOR;

    /**
     * The table <code>public.entity</code>.
     */
    public static final Entity ENTITY = com.platform.chorus.db.tables.Entity.ENTITY;

    /**
     * The table <code>public.field_model</code>.
     */
    public static final FieldModel FIELD_MODEL = com.platform.chorus.db.tables.FieldModel.FIELD_MODEL;

    /**
     * The table <code>public.relationship</code>.
     */
    public static final Relationship RELATIONSHIP = com.platform.chorus.db.tables.Relationship.RELATIONSHIP;

    /**
     * The table <code>public.value</code>.
     */
    public static final Value VALUE = com.platform.chorus.db.tables.Value.VALUE;
}
