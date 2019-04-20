/*
 * This file is generated by jOOQ.
*/
package com.platform.chorus.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class ClassModel implements Serializable {

    private static final long serialVersionUID = -1711125281;

    private Integer id;
    private String  domain;
    private String  name;
    private String  extend;
    private String  label;
    private String  modifier;
    private String  scope;
    private String  description;

    public ClassModel() {}

    public ClassModel(ClassModel value) {
        this.id = value.id;
        this.domain = value.domain;
        this.name = value.name;
        this.extend = value.extend;
        this.label = value.label;
        this.modifier = value.modifier;
        this.scope = value.scope;
        this.description = value.description;
    }

    public ClassModel(
        Integer id,
        String  domain,
        String  name,
        String  extend,
        String  label,
        String  modifier,
        String  scope,
        String  description
    ) {
        this.id = id;
        this.domain = domain;
        this.name = name;
        this.extend = extend;
        this.label = label;
        this.modifier = modifier;
        this.scope = scope;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getModifier() {
        return this.modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassModel (");

        sb.append(id);
        sb.append(", ").append(domain);
        sb.append(", ").append(name);
        sb.append(", ").append(extend);
        sb.append(", ").append(label);
        sb.append(", ").append(modifier);
        sb.append(", ").append(scope);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
