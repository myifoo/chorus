package com.platform.chorus.web.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Instance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
public class Instance   {
  @JsonProperty("oid")
  private Integer oid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("depends")
  @Valid
  private List<Integer> depends = null;

  public Instance oid(Integer oid) {
    this.oid = oid;
    return this;
  }

  /**
   * Get oid
   * @return oid
  **/
  @ApiModelProperty(value = "")

  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }

  public Instance name(String name) {
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

  public Instance type(String type) {
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

  public Instance content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Instance tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Instance addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Instance depends(List<Integer> depends) {
    this.depends = depends;
    return this;
  }

  public Instance addDependsItem(Integer dependsItem) {
    if (this.depends == null) {
      this.depends = new ArrayList<Integer>();
    }
    this.depends.add(dependsItem);
    return this;
  }

  /**
   * Get depends
   * @return depends
  **/
  @ApiModelProperty(value = "")

  public List<Integer> getDepends() {
    return depends;
  }

  public void setDepends(List<Integer> depends) {
    this.depends = depends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.oid, instance.oid) &&
        Objects.equals(this.name, instance.name) &&
        Objects.equals(this.type, instance.type) &&
        Objects.equals(this.content, instance.content) &&
        Objects.equals(this.tags, instance.tags) &&
        Objects.equals(this.depends, instance.depends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, name, type, content, tags, depends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    depends: ").append(toIndentedString(depends)).append("\n");
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
