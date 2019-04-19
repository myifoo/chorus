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
public class Relationship implements Serializable {

    private static final long serialVersionUID = -2114487678;

    private Integer sid;
    private Integer tid;
    private Integer type;

    public Relationship() {}

    public Relationship(Relationship value) {
        this.sid = value.sid;
        this.tid = value.tid;
        this.type = value.type;
    }

    public Relationship(
        Integer sid,
        Integer tid,
        Integer type
    ) {
        this.sid = sid;
        this.tid = tid;
        this.type = type;
    }

    public Integer getSid() {
        return this.sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return this.tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Relationship (");

        sb.append(sid);
        sb.append(", ").append(tid);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
