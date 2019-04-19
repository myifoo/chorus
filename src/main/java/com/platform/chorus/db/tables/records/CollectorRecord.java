/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.database.tables.records;


import com.platform.chorus.database.tables.Collector;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class CollectorRecord extends UpdatableRecordImpl<CollectorRecord> implements Record5<String, String, String[], String, String> {

    private static final long serialVersionUID = 329640571;

    /**
     * Setter for <code>public.collector.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.collector.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.collector.result</code>.
     */
    public void setResult(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.collector.result</code>.
     */
    public String getResult() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.collector.injects</code>.
     */
    public void setInjects(String... value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.collector.injects</code>.
     */
    public String[] getInjects() {
        return (String[]) get(2);
    }

    /**
     * Setter for <code>public.collector.argument</code>.
     */
    public void setArgument(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.collector.argument</code>.
     */
    public String getArgument() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.collector.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.collector.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String[], String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String[], String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Collector.COLLECTOR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Collector.COLLECTOR.RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field3() {
        return Collector.COLLECTOR.INJECTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Collector.COLLECTOR.ARGUMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Collector.COLLECTOR.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component3() {
        return getInjects();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getArgument();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value3() {
        return getInjects();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getArgument();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectorRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectorRecord value2(String value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectorRecord value3(String... value) {
        setInjects(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectorRecord value4(String value) {
        setArgument(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectorRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectorRecord values(String value1, String value2, String[] value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollectorRecord
     */
    public CollectorRecord() {
        super(Collector.COLLECTOR);
    }

    /**
     * Create a detached, initialised CollectorRecord
     */
    public CollectorRecord(String name, String result, String[] injects, String argument, String description) {
        super(Collector.COLLECTOR);

        set(0, name);
        set(1, result);
        set(2, injects);
        set(3, argument);
        set(4, description);
    }
}