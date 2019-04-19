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
public class Value implements Serializable {

    private static final long serialVersionUID = -490151639;

    private Integer owner;
    private String  type;
    private String  class_;
    private String  creator;
    private String  description;

    public Value() {}

    public Value(Value value) {
        this.owner = value.owner;
        this.type = value.type;
        this.class_ = value.class_;
        this.creator = value.creator;
        this.description = value.description;
    }

    public Value(
        Integer owner,
        String  type,
        String  class_,
        String  creator,
        String  description
    ) {
        this.owner = owner;
        this.type = type;
        this.class_ = class_;
        this.creator = creator;
        this.description = description;
    }

    public Integer getOwner() {
        return this.owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClass_() {
        return this.class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Value (");

        sb.append(owner);
        sb.append(", ").append(type);
        sb.append(", ").append(class_);
        sb.append(", ").append(creator);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
