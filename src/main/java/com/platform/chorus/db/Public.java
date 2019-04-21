/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.db;


import com.platform.chorus.db.tables.ClassModel;
import com.platform.chorus.db.tables.Collector;
import com.platform.chorus.db.tables.FieldModel;
import com.platform.chorus.db.tables.ItemEntity;
import com.platform.chorus.db.tables.ItemValue;
import com.platform.chorus.db.tables.Relation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 225584973;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.class_model</code>.
     */
    public final ClassModel CLASS_MODEL = com.platform.chorus.db.tables.ClassModel.CLASS_MODEL;

    /**
     * The table <code>public.collector</code>.
     */
    public final Collector COLLECTOR = com.platform.chorus.db.tables.Collector.COLLECTOR;

    /**
     * The table <code>public.field_model</code>.
     */
    public final FieldModel FIELD_MODEL = com.platform.chorus.db.tables.FieldModel.FIELD_MODEL;

    /**
     * The table <code>public.item_entity</code>.
     */
    public final ItemEntity ITEM_ENTITY = com.platform.chorus.db.tables.ItemEntity.ITEM_ENTITY;

    /**
     * The table <code>public.item_value</code>.
     */
    public final ItemValue ITEM_VALUE = com.platform.chorus.db.tables.ItemValue.ITEM_VALUE;

    /**
     * The table <code>public.relation</code>.
     */
    public final Relation RELATION = com.platform.chorus.db.tables.Relation.RELATION;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ClassModel.CLASS_MODEL,
            Collector.COLLECTOR,
            FieldModel.FIELD_MODEL,
            ItemEntity.ITEM_ENTITY,
            ItemValue.ITEM_VALUE,
            Relation.RELATION);
    }
}
