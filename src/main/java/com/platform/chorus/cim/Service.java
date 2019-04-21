package com.platform.chorus.cim;

/**
 * Create by A.T on 2019/4/10
 *
 *      configuration items manager
 */
public interface Service {
    String EXTEND = "extend";       // class model extend class model
    String REFERENCE = "reference"; // class model reference class model
    String INSTANCE = "instance";   // class model instance item entity
    String OWN = "own";             // class model contain field model
    String CONTAIN = "contain";     // item entity contain item entity
    String RETURN = "return";       // collector return data type
    String REQUIRE = "require";     // collector require data type

    default String buildCommonId(String path) {
        return String.join(":", path.split("\\."));
    }

    default String buildClassNodeId(String domain, String name) {
        return String.format("%s:%s:%s", "class", buildCommonId(domain), name);
    }

    default String buildClassNodeId(String classPath) {
        return String.format("%s:%s", "class", buildCommonId(classPath));
    }

    default String buildFieldNodeId(String owner, String name) {

        return String.format("%s:%s:%s", "field", buildCommonId(owner), name);
    }

    default String buildItemNodeId(String type, String name) {
        return String.format("%s:%s:%s", "item", buildCommonId(type), name);
    }
}
