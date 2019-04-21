package com.platform.chorus.cim;

/**
 * Create by A.T on 2019/4/10
 *
 *      configuration items manager
 */
public interface Service {
    String EXTEND = "extend";
    String REFERENCE = "reference";
    String INSTANCE = "instance";
    String OWN = "own";

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
