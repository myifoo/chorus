/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.database.tables;


import com.platform.chorus.database.Keys;
import com.platform.chorus.database.Public;
import com.platform.chorus.database.tables.records.EntityRecord;

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
public class Entity extends TableImpl<EntityRecord> {

    private static final long serialVersionUID = 745114835;

    /**
     * The reference instance of <code>public.entity</code>
     */
    public static final Entity ENTITY = new Entity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityRecord> getRecordType() {
        return EntityRecord.class;
    }

    /**
     * The column <code>public.entity.id</code>.
     */
    public final TableField<EntityRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('entity_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.entity.name</code>.
     */
    public final TableField<EntityRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.entity.class</code>.
     */
    public final TableField<EntityRecord, String> CLASS = createField("class", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.entity.creator</code>.
     */
    public final TableField<EntityRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.entity.tags</code>.
     */
    public final TableField<EntityRecord, String[]> TAGS = createField("tags", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.entity.contains</code>.
     */
    public final TableField<EntityRecord, Integer[]> CONTAINS = createField("contains", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

    /**
     * The column <code>public.entity.description</code>.
     */
    public final TableField<EntityRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.entity</code> table reference
     */
    public Entity() {
        this(DSL.name("entity"), null);
    }

    /**
     * Create an aliased <code>public.entity</code> table reference
     */
    public Entity(String alias) {
        this(DSL.name(alias), ENTITY);
    }

    /**
     * Create an aliased <code>public.entity</code> table reference
     */
    public Entity(Name alias) {
        this(alias, ENTITY);
    }

    private Entity(Name alias, Table<EntityRecord> aliased) {
        this(alias, aliased, null);
    }

    private Entity(Name alias, Table<EntityRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EntityRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EntityRecord> getPrimaryKey() {
        return Keys.ENTITY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EntityRecord>> getKeys() {
        return Arrays.<UniqueKey<EntityRecord>>asList(Keys.ENTITY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Entity as(String alias) {
        return new Entity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Entity as(Name alias) {
        return new Entity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Entity rename(String name) {
        return new Entity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Entity rename(Name name) {
        return new Entity(name, null);
    }
}
