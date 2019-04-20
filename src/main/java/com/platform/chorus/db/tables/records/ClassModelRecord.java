/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.db.tables.records;


import com.platform.chorus.db.tables.ClassModel;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ClassModelRecord extends UpdatableRecordImpl<ClassModelRecord> implements Record8<Integer, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 2059359208;

    /**
     * Setter for <code>public.class_model.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.class_model.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.class_model.domain</code>.
     */
    public void setDomain(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.class_model.domain</code>.
     */
    public String getDomain() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.class_model.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.class_model.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.class_model.extend</code>.
     */
    public void setExtend(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.class_model.extend</code>.
     */
    public String getExtend() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.class_model.label</code>.
     */
    public void setLabel(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.class_model.label</code>.
     */
    public String getLabel() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.class_model.modifier</code>.
     */
    public void setModifier(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.class_model.modifier</code>.
     */
    public String getModifier() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.class_model.scope</code>.
     */
    public void setScope(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.class_model.scope</code>.
     */
    public String getScope() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.class_model.description</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.class_model.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ClassModel.CLASS_MODEL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ClassModel.CLASS_MODEL.DOMAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ClassModel.CLASS_MODEL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ClassModel.CLASS_MODEL.EXTEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ClassModel.CLASS_MODEL.LABEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ClassModel.CLASS_MODEL.MODIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ClassModel.CLASS_MODEL.SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ClassModel.CLASS_MODEL.DESCRIPTION;
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
        return getDomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getExtend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getModifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
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
        return getDomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getExtend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getModifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value2(String value) {
        setDomain(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value4(String value) {
        setExtend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value5(String value) {
        setLabel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value6(String value) {
        setModifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value7(String value) {
        setScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord value8(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassModelRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassModelRecord
     */
    public ClassModelRecord() {
        super(ClassModel.CLASS_MODEL);
    }

    /**
     * Create a detached, initialised ClassModelRecord
     */
    public ClassModelRecord(Integer id, String domain, String name, String extend, String label, String modifier, String scope, String description) {
        super(ClassModel.CLASS_MODEL);

        set(0, id);
        set(1, domain);
        set(2, name);
        set(3, extend);
        set(4, label);
        set(5, modifier);
        set(6, scope);
        set(7, description);
    }
}
