/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.database.tables;


import com.platform.chorus.database.Keys;
import com.platform.chorus.database.Public;
import com.platform.chorus.database.tables.records.MetaClassRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class MetaClass extends TableImpl<MetaClassRecord> {

    private static final long serialVersionUID = 1112357544;

    /**
     * The reference instance of <code>public.meta_class</code>
     */
    public static final MetaClass META_CLASS = new MetaClass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetaClassRecord> getRecordType() {
        return MetaClassRecord.class;
    }

    /**
     * The column <code>public.meta_class.cid</code>.
     */
    public final TableField<MetaClassRecord, Integer> CID = createField("cid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('meta_classes_cid_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.meta_class.package</code>.
     */
    public final TableField<MetaClassRecord, String> PACKAGE = createField("package", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.meta_class.name</code>.
     */
    public final TableField<MetaClassRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.meta_class.extends</code>.
     */
    public final TableField<MetaClassRecord, Integer[]> EXTENDS = createField("extends", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

    /**
     * The column <code>public.meta_class.modifier</code>.
     */
    public final TableField<MetaClassRecord, String> MODIFIER = createField("modifier", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.meta_class.scope</code>.
     */
    public final TableField<MetaClassRecord, String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.meta_class.description</code>.
     */
    public final TableField<MetaClassRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.meta_class</code> table reference
     */
    public MetaClass() {
        this(DSL.name("meta_class"), null);
    }

    /**
     * Create an aliased <code>public.meta_class</code> table reference
     */
    public MetaClass(String alias) {
        this(DSL.name(alias), META_CLASS);
    }

    /**
     * Create an aliased <code>public.meta_class</code> table reference
     */
    public MetaClass(Name alias) {
        this(alias, META_CLASS);
    }

    private MetaClass(Name alias, Table<MetaClassRecord> aliased) {
        this(alias, aliased, null);
    }

    private MetaClass(Name alias, Table<MetaClassRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MetaClassRecord, Integer> getIdentity() {
        return Keys.IDENTITY_META_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MetaClassRecord> getPrimaryKey() {
        return Keys.META_CLASSES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MetaClassRecord>> getKeys() {
        return Arrays.<UniqueKey<MetaClassRecord>>asList(Keys.META_CLASSES_PKEY, Keys.CL_U_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetaClass as(String alias) {
        return new MetaClass(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetaClass as(Name alias) {
        return new MetaClass(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MetaClass rename(String name) {
        return new MetaClass(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MetaClass rename(Name name) {
        return new MetaClass(name, null);
    }
}
