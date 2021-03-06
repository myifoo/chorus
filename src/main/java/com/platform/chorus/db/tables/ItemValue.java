/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.db.tables;


import com.platform.chorus.db.Keys;
import com.platform.chorus.db.Public;
import com.platform.chorus.db.tables.records.ItemValueRecord;

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
public class ItemValue extends TableImpl<ItemValueRecord> {

    private static final long serialVersionUID = -674519964;

    /**
     * The reference instance of <code>public.item_value</code>
     */
    public static final ItemValue ITEM_VALUE = new ItemValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemValueRecord> getRecordType() {
        return ItemValueRecord.class;
    }

    /**
     * The column <code>public.item_value.id</code>.
     */
    public final TableField<ItemValueRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('item_value_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.item_value.owner</code>.
     */
    public final TableField<ItemValueRecord, Integer> OWNER = createField("owner", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.item_value.name</code>.
     */
    public final TableField<ItemValueRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.item_value.type</code>.
     */
    public final TableField<ItemValueRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.item_value.value</code>.
     */
    public final TableField<ItemValueRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.item_value</code> table reference
     */
    public ItemValue() {
        this(DSL.name("item_value"), null);
    }

    /**
     * Create an aliased <code>public.item_value</code> table reference
     */
    public ItemValue(String alias) {
        this(DSL.name(alias), ITEM_VALUE);
    }

    /**
     * Create an aliased <code>public.item_value</code> table reference
     */
    public ItemValue(Name alias) {
        this(alias, ITEM_VALUE);
    }

    private ItemValue(Name alias, Table<ItemValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private ItemValue(Name alias, Table<ItemValueRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ItemValueRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ITEM_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ItemValueRecord> getPrimaryKey() {
        return Keys.ITEM_VALUE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ItemValueRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemValueRecord>>asList(Keys.ITEM_VALUE_PKEY, Keys.IV_U_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemValue as(String alias) {
        return new ItemValue(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemValue as(Name alias) {
        return new ItemValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemValue rename(String name) {
        return new ItemValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemValue rename(Name name) {
        return new ItemValue(name, null);
    }
}
