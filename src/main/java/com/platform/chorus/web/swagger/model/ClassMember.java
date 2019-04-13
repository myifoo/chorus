package com.platform.chorus.web.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ClassMember
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
public class ClassMember   {
  @JsonProperty("cid")
  private Integer cid = null;

  @JsonProperty("package")
  private String _package = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("modifier")
  private String modifier = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("description")
  private String description = null;

  public ClassMember cid(Integer cid) {
    this.cid = cid;
    return this;
  }

  /**
   * Get cid
   * @return cid
  **/
  @ApiModelProperty(value = "")

  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }

  public ClassMember _package(String _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
  **/
  @ApiModelProperty(value = "")

  public String getPackage() {
    return _package;
  }

  public void setPackage(String _package) {
    this._package = _package;
  }

  public ClassMember name(String name) {
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

  public ClassMember modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * Get modifier
   * @return modifier
  **/
  @ApiModelProperty(value = "")

  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public ClassMember scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public ClassMember description(String description) {
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
    ClassMember classMember = (ClassMember) o;
    return Objects.equals(this.cid, classMember.cid) &&
        Objects.equals(this._package, classMember._package) &&
        Objects.equals(this.name, classMember.name) &&
        Objects.equals(this.modifier, classMember.modifier) &&
        Objects.equals(this.scope, classMember.scope) &&
        Objects.equals(this.description, classMember.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, _package, name, modifier, scope, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassMember {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
