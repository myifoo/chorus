CREATE TABLE public.meta_classes
(
    cid SERIAL PRIMARY KEY NOT NULL,                    -- class id
    "package" character varying(100)  NOT NULL, 
    name character varying(50)  NOT NULL,
    extends integer[],                                  -- super class id
    modifier character varying(20) ,                    -- public, private, final, abstract, ...
    scope character varying(20) ,                       -- global, package, local
    description text , 
    CONSTRAINT cl_u_key UNIQUE ("package", name)
);

CREATE TABLE public.meta_fields
(
    fid SERIAL PRIMARY KEY NOT NULL,                    -- field id
    name character varying(20)  NOT NULL,               -- field name
    type character varying(100)  NOT NULL,              -- field type = class package + class name
    owner integer,                                      -- owner class id
    "default" text ,                                    -- default value
    unit character varying(10) ,        
    range text ,
    optional boolean DEFAULT true,
    format text ,
    description text,
    CONSTRAINT fd_u_key UNIQUE (owner, name)
);

CREATE TABLE public.meta_methods
(
    mid SERIAL PRIMARY KEY NOT NULL,                    -- method id
    name character varying(20)  NOT NULL,               -- method name
    result character varying(100),                      -- method result type = result class package + result class name
    argument character varying(100),                    -- method argument type = argument class package + argument class name
    owner integer,                                      -- owner class id
    description text,
    CONSTRAINT mt_u_key UNIQUE (owner, name)
);

CREATE TABLE public.meta_relations
(
    type character varying(20),                         -- extend, derive, has, can, produce, consume, ...
    sid integer,                                        -- source id
    tid integer,                                        -- target id
);

CREATE TABLE public.item_instances
(
    oid integer NOT NULL,                               -- object id
    type character varying(100) ,                       -- object's class = package + name
    content jsonb,      
    refs integer[],                                     -- reference object ids
    tags character varying(20)[],                       -- tags
    CONSTRAINT ci_p_key PRIMARY KEY (cid)
);

