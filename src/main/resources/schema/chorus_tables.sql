DROP TABLE public.type_model;
DROP TABLE public.field_model;
DROP TABLE public.collector;
DROP TABLE public.item_entity;
DROP TABLE public.item_value;
DROP TABLE public.relation


CREATE TABLE public.class_model
(
    id SERIAL PRIMARY KEY NOT NULL,                    -- type id
    domain character varying(200)  NOT NULL,
    name character varying(50)  NOT NULL,
    extend character varying(200),            -- parent type
    label character varying(20),
    modifier character varying(20) ,                    -- public, private, final, abstract, ...
    scope character varying(20) ,                       -- global, domain, local
    description text,
    CONSTRAINT cm_u_key UNIQUE ("domain", name)
);

CREATE TABLE public.field_model
(
    id SERIAL PRIMARY KEY NOT NULL,                    -- field id
    owner character varying(200) NOT NULL,             -- type domain + type name
    name character varying(50) NOT NULL,               -- field name
    label character varying(20),
    type character varying(200) NOT NULL,             -- this field's type domain + type name
    unit character varying(10),
    range character varying(100),
    "default" character varying(100),                  -- default value
    format character varying(100),
    optional boolean DEFAULT true,
    configurable boolean DEFAULT true,
    collectible boolean DEFAULT false,
    collector character varying(100),
    interval integer,
    description text,
    CONSTRAINT fm_u_key UNIQUE (owner, name)
);

CREATE TABLE public.collector
(
    name character varying(100) PRIMARY KEY NOT NULL,               -- method name
    result character varying(200),                      -- method result type = result type domain + result type name
    injects character varying(200)[],                   -- method argument type = argument type domain + argument type name
    argument character varying(100),                    -- dynamic argument
    description text
);


CREATE TABLE public.item_entity
(
    id SERIAL PRIMARY KEY NOT NULL,                     -- entity id
    name character varying(50),                         -- entity name, default is ${type name}_${id}
    type character varying(200),                        -- entity's type = domain + name
    creator character varying(50),
    tags character varying(50)[],                        -- tags
    contains integer[],                                   -- all sub entity id
    description text
);

CREATE TABLE public.item_value
(
    owner integer,                                      -- entity id
    name character varying(50),
    type character varying(50),                         -- primitive type: integer, long, float, double, boolean, string, list
    value text,
    CONSTRAINT iv_u_key UNIQUE (owner, name)
);

CREATE TABLE public.relation
(
    sid integer,
    tid integer,
    type integer                                       -- 1: type_A extend type_B
                                                        -- 2: type_B derive from type_A
                                                        -- 3: type_A reference type_C
                                                        -- 4: entity_a instance type_A
                                                        -- 5: entity_a has entity_c
);

