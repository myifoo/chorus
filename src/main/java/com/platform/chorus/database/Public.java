/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.database;


import com.platform.chorus.database.tables.ItemInstance;
import com.platform.chorus.database.tables.MetaClass;
import com.platform.chorus.database.tables.MetaField;
import com.platform.chorus.database.tables.MetaMethod;
import com.platform.chorus.database.tables.MetaRelation;

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

    private static final long serialVersionUID = 670583556;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.item_instance</code>.
     */
    public final ItemInstance ITEM_INSTANCE = com.platform.chorus.database.tables.ItemInstance.ITEM_INSTANCE;

    /**
     * The table <code>public.meta_class</code>.
     */
    public final MetaClass META_CLASS = com.platform.chorus.database.tables.MetaClass.META_CLASS;

    /**
     * The table <code>public.meta_field</code>.
     */
    public final MetaField META_FIELD = com.platform.chorus.database.tables.MetaField.META_FIELD;

    /**
     * The table <code>public.meta_method</code>.
     */
    public final MetaMethod META_METHOD = com.platform.chorus.database.tables.MetaMethod.META_METHOD;

    /**
     * The table <code>public.meta_relation</code>.
     */
    public final MetaRelation META_RELATION = com.platform.chorus.database.tables.MetaRelation.META_RELATION;

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
            ItemInstance.ITEM_INSTANCE,
            MetaClass.META_CLASS,
            MetaField.META_FIELD,
            MetaMethod.META_METHOD,
            MetaRelation.META_RELATION);
    }
}
