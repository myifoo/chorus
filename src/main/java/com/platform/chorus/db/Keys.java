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
import com.platform.chorus.db.tables.records.ClassModelRecord;
import com.platform.chorus.db.tables.records.CollectorRecord;
import com.platform.chorus.db.tables.records.FieldModelRecord;
import com.platform.chorus.db.tables.records.ItemEntityRecord;
import com.platform.chorus.db.tables.records.ItemValueRecord;
import com.platform.chorus.db.tables.records.RelationRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ClassModelRecord, Integer> IDENTITY_CLASS_MODEL = Identities0.IDENTITY_CLASS_MODEL;
    public static final Identity<CollectorRecord, Integer> IDENTITY_COLLECTOR = Identities0.IDENTITY_COLLECTOR;
    public static final Identity<FieldModelRecord, Integer> IDENTITY_FIELD_MODEL = Identities0.IDENTITY_FIELD_MODEL;
    public static final Identity<ItemEntityRecord, Integer> IDENTITY_ITEM_ENTITY = Identities0.IDENTITY_ITEM_ENTITY;
    public static final Identity<ItemValueRecord, Integer> IDENTITY_ITEM_VALUE = Identities0.IDENTITY_ITEM_VALUE;
    public static final Identity<RelationRecord, Integer> IDENTITY_RELATION = Identities0.IDENTITY_RELATION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ClassModelRecord> CLASS_MODEL_PKEY = UniqueKeys0.CLASS_MODEL_PKEY;
    public static final UniqueKey<ClassModelRecord> CM_U_KEY = UniqueKeys0.CM_U_KEY;
    public static final UniqueKey<CollectorRecord> COLLECTOR_PKEY = UniqueKeys0.COLLECTOR_PKEY;
    public static final UniqueKey<CollectorRecord> CL_U_KEY = UniqueKeys0.CL_U_KEY;
    public static final UniqueKey<FieldModelRecord> FIELD_MODEL_PKEY = UniqueKeys0.FIELD_MODEL_PKEY;
    public static final UniqueKey<FieldModelRecord> FM_U_KEY = UniqueKeys0.FM_U_KEY;
    public static final UniqueKey<ItemEntityRecord> ITEM_ENTITY_PKEY = UniqueKeys0.ITEM_ENTITY_PKEY;
    public static final UniqueKey<ItemEntityRecord> IE_U_KEY = UniqueKeys0.IE_U_KEY;
    public static final UniqueKey<ItemValueRecord> ITEM_VALUE_PKEY = UniqueKeys0.ITEM_VALUE_PKEY;
    public static final UniqueKey<ItemValueRecord> IV_U_KEY = UniqueKeys0.IV_U_KEY;
    public static final UniqueKey<RelationRecord> RELATION_PKEY = UniqueKeys0.RELATION_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ClassModelRecord, Integer> IDENTITY_CLASS_MODEL = Internal.createIdentity(ClassModel.CLASS_MODEL, ClassModel.CLASS_MODEL.ID);
        public static Identity<CollectorRecord, Integer> IDENTITY_COLLECTOR = Internal.createIdentity(Collector.COLLECTOR, Collector.COLLECTOR.ID);
        public static Identity<FieldModelRecord, Integer> IDENTITY_FIELD_MODEL = Internal.createIdentity(FieldModel.FIELD_MODEL, FieldModel.FIELD_MODEL.ID);
        public static Identity<ItemEntityRecord, Integer> IDENTITY_ITEM_ENTITY = Internal.createIdentity(ItemEntity.ITEM_ENTITY, ItemEntity.ITEM_ENTITY.ID);
        public static Identity<ItemValueRecord, Integer> IDENTITY_ITEM_VALUE = Internal.createIdentity(ItemValue.ITEM_VALUE, ItemValue.ITEM_VALUE.ID);
        public static Identity<RelationRecord, Integer> IDENTITY_RELATION = Internal.createIdentity(Relation.RELATION, Relation.RELATION.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ClassModelRecord> CLASS_MODEL_PKEY = Internal.createUniqueKey(ClassModel.CLASS_MODEL, "class_model_pkey", ClassModel.CLASS_MODEL.ID);
        public static final UniqueKey<ClassModelRecord> CM_U_KEY = Internal.createUniqueKey(ClassModel.CLASS_MODEL, "cm_u_key", ClassModel.CLASS_MODEL.DOMAIN, ClassModel.CLASS_MODEL.NAME);
        public static final UniqueKey<CollectorRecord> COLLECTOR_PKEY = Internal.createUniqueKey(Collector.COLLECTOR, "collector_pkey", Collector.COLLECTOR.ID);
        public static final UniqueKey<CollectorRecord> CL_U_KEY = Internal.createUniqueKey(Collector.COLLECTOR, "cl_u_key", Collector.COLLECTOR.NAME);
        public static final UniqueKey<FieldModelRecord> FIELD_MODEL_PKEY = Internal.createUniqueKey(FieldModel.FIELD_MODEL, "field_model_pkey", FieldModel.FIELD_MODEL.ID);
        public static final UniqueKey<FieldModelRecord> FM_U_KEY = Internal.createUniqueKey(FieldModel.FIELD_MODEL, "fm_u_key", FieldModel.FIELD_MODEL.OWNER, FieldModel.FIELD_MODEL.NAME);
        public static final UniqueKey<ItemEntityRecord> ITEM_ENTITY_PKEY = Internal.createUniqueKey(ItemEntity.ITEM_ENTITY, "item_entity_pkey", ItemEntity.ITEM_ENTITY.ID);
        public static final UniqueKey<ItemEntityRecord> IE_U_KEY = Internal.createUniqueKey(ItemEntity.ITEM_ENTITY, "ie_u_key", ItemEntity.ITEM_ENTITY.TYPE, ItemEntity.ITEM_ENTITY.NAME);
        public static final UniqueKey<ItemValueRecord> ITEM_VALUE_PKEY = Internal.createUniqueKey(ItemValue.ITEM_VALUE, "item_value_pkey", ItemValue.ITEM_VALUE.ID);
        public static final UniqueKey<ItemValueRecord> IV_U_KEY = Internal.createUniqueKey(ItemValue.ITEM_VALUE, "iv_u_key", ItemValue.ITEM_VALUE.OWNER, ItemValue.ITEM_VALUE.NAME);
        public static final UniqueKey<RelationRecord> RELATION_PKEY = Internal.createUniqueKey(Relation.RELATION, "relation_pkey", Relation.RELATION.ID);
    }
}
