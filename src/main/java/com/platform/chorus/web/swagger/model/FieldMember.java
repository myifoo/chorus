package com.platform.chorus.web.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * FieldMember
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
public class FieldMember   {
  @JsonProperty("fid")
  private Integer fid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("default")
  private String _default = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("range")
  private String range = null;

  @JsonProperty("optional")
  private Boolean optional = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("description")
  private String description = null;

  public FieldMember fid(Integer fid) {
    this.fid = fid;
    return this;
  }

  /**
   * Get fid
   * @return fid
  **/
  @ApiModelProperty(value = "")

  public Integer getFid() {
    return fid;
  }

  public void setFid(Integer fid) {
    this.fid = fid;
  }

  public FieldMember name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldMember type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FieldMember owner(Integer owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")

  public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public FieldMember _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")

  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public FieldMember unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public FieldMember range(String range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(value = "")

  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public FieldMember optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * Get optional
   * @return optional
  **/
  @ApiModelProperty(value = "")

  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public FieldMember format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public FieldMember description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMember fieldMember = (FieldMember) o;
    return Objects.equals(this.fid, fieldMember.fid) &&
        Objects.equals(this.name, fieldMember.name) &&
        Objects.equals(this.type, fieldMember.type) &&
        Objects.equals(this.owner, fieldMember.owner) &&
        Objects.equals(this._default, fieldMember._default) &&
        Objects.equals(this.unit, fieldMember.unit) &&
        Objects.equals(this.range, fieldMember.range) &&
        Objects.equals(this.optional, fieldMember.optional) &&
        Objects.equals(this.format, fieldMember.format) &&
        Objects.equals(this.description, fieldMember.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fid, name, type, owner, _default, unit, range, optional, format, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMember {\n");
    
    sb.append("    fid: ").append(toIndentedString(fid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
