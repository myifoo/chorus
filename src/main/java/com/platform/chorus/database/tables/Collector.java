/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.database.tables;


import com.platform.chorus.database.Keys;
import com.platform.chorus.database.Public;
import com.platform.chorus.database.tables.records.CollectorRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Collector extends TableImpl<CollectorRecord> {

    private static final long serialVersionUID = -1026512748;

    /**
     * The reference instance of <code>public.collector</code>
     */
    public static final Collector COLLECTOR = new Collector();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollectorRecord> getRecordType() {
        return CollectorRecord.class;
    }

    /**
     * The column <code>public.collector.name</code>.
     */
    public final TableField<CollectorRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.collector.result</code>.
     */
    public final TableField<CollectorRecord, String> RESULT = createField("result", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.collector.injects</code>.
     */
    public final TableField<CollectorRecord, String[]> INJECTS = createField("injects", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.collector.argument</code>.
     */
    public final TableField<CollectorRecord, String> ARGUMENT = createField("argument", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.collector.description</code>.
     */
    public final TableField<CollectorRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.collector</code> table reference
     */
    public Collector() {
        this(DSL.name("collector"), null);
    }

    /**
     * Create an aliased <code>public.collector</code> table reference
     */
    public Collector(String alias) {
        this(DSL.name(alias), COLLECTOR);
    }

    /**
     * Create an aliased <code>public.collector</code> table reference
     */
    public Collector(Name alias) {
        this(alias, COLLECTOR);
    }

    private Collector(Name alias, Table<CollectorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Collector(Name alias, Table<CollectorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CollectorRecord> getPrimaryKey() {
        return Keys.COLLECTOR_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CollectorRecord>> getKeys() {
        return Arrays.<UniqueKey<CollectorRecord>>asList(Keys.COLLECTOR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collector as(String alias) {
        return new Collector(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collector as(Name alias) {
        return new Collector(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Collector rename(String name) {
        return new Collector(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Collector rename(Name name) {
        return new Collector(name, null);
    }
}
