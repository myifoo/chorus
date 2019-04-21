/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.db.tables.records;


import com.platform.chorus.db.tables.ItemEntity;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ItemEntityRecord extends UpdatableRecordImpl<ItemEntityRecord> implements Record7<Integer, String, String, String, String[], Integer[], String> {

    private static final long serialVersionUID = -1363323706;

    /**
     * Setter for <code>public.item_entity.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.item_entity.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.item_entity.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.item_entity.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.item_entity.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.item_entity.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.item_entity.creator</code>.
     */
    public void setCreator(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.item_entity.creator</code>.
     */
    public String getCreator() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.item_entity.tags</code>.
     */
    public void setTags(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.item_entity.tags</code>.
     */
    public String[] getTags() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>public.item_entity.contains</code>.
     */
    public void setContains(Integer... value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.item_entity.contains</code>.
     */
    public Integer[] getContains() {
        return (Integer[]) get(5);
    }

    /**
     * Setter for <code>public.item_entity.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.item_entity.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String[], Integer[], String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String[], Integer[], String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ItemEntity.ITEM_ENTITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ItemEntity.ITEM_ENTITY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ItemEntity.ITEM_ENTITY.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ItemEntity.ITEM_ENTITY.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return ItemEntity.ITEM_ENTITY.TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field6() {
        return ItemEntity.ITEM_ENTITY.CONTAINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ItemEntity.ITEM_ENTITY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component5() {
        return getTags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component6() {
        return getContains();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getTags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value6() {
        return getContains();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord value4(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord value5(String... value) {
        setTags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord value6(Integer... value) {
        setContains(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemEntityRecord values(Integer value1, String value2, String value3, String value4, String[] value5, Integer[] value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemEntityRecord
     */
    public ItemEntityRecord() {
        super(ItemEntity.ITEM_ENTITY);
    }

    /**
     * Create a detached, initialised ItemEntityRecord
     */
    public ItemEntityRecord(Integer id, String name, String type, String creator, String[] tags, Integer[] contains, String description) {
        super(ItemEntity.ITEM_ENTITY);

        set(0, id);
        set(1, name);
        set(2, type);
        set(3, creator);
        set(4, tags);
        set(5, contains);
        set(6, description);
    }
}
