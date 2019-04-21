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
public class FieldModel implements Serializable {

    private static final long serialVersionUID = -218305860;

    private Integer id;
    private String  owner;
    private String  name;
    private String  type;
    private String  label;
    private String  unit;
    private String  range;
    private String  default_;
    private String  format;
    private Boolean optional;
    private Boolean configurable;
    private Boolean collectible;
    private String  collector;
    private Integer interval;
    private String  description;

    public FieldModel() {}

    public FieldModel(FieldModel value) {
        this.id = value.id;
        this.owner = value.owner;
        this.name = value.name;
        this.type = value.type;
        this.label = value.label;
        this.unit = value.unit;
        this.range = value.range;
        this.default_ = value.default_;
        this.format = value.format;
        this.optional = value.optional;
        this.configurable = value.configurable;
        this.collectible = value.collectible;
        this.collector = value.collector;
        this.interval = value.interval;
        this.description = value.description;
    }

    public FieldModel(
        Integer id,
        String  owner,
        String  name,
        String  type,
        String  label,
        String  unit,
        String  range,
        String  default_,
        String  format,
        Boolean optional,
        Boolean configurable,
        Boolean collectible,
        String  collector,
        Integer interval,
        String  description
    ) {
        this.id = id;
        this.owner = owner;
        this.name = name;
        this.type = type;
        this.label = label;
        this.unit = unit;
        this.range = range;
        this.default_ = default_;
        this.format = format;
        this.optional = optional;
        this.configurable = configurable;
        this.collectible = collectible;
        this.collector = collector;
        this.interval = interval;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDefault() {
        return this.default_;
    }

    public void setDefault(String default_) {
        this.default_ = default_;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public Boolean getConfigurable() {
        return this.configurable;
    }

    public void setConfigurable(Boolean configurable) {
        this.configurable = configurable;
    }

    public Boolean getCollectible() {
        return this.collectible;
    }

    public void setCollectible(Boolean collectible) {
        this.collectible = collectible;
    }

    public String getCollector() {
        return this.collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public Integer getInterval() {
        return this.interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FieldModel (");

        sb.append(id);
        sb.append(", ").append(owner);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(label);
        sb.append(", ").append(unit);
        sb.append(", ").append(range);
        sb.append(", ").append(default_);
        sb.append(", ").append(format);
        sb.append(", ").append(optional);
        sb.append(", ").append(configurable);
        sb.append(", ").append(collectible);
        sb.append(", ").append(collector);
        sb.append(", ").append(interval);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
