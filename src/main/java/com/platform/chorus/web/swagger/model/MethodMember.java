package com.platform.chorus.web.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * MethodMember
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
public class MethodMember   {
  @JsonProperty("mid")
  private Integer mid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("result")
  private String result = null;

  @JsonProperty("argument")
  private String argument = null;

  @JsonProperty("owner")
  private Integer owner = null;

  @JsonProperty("description")
  private String description = null;

  public MethodMember mid(Integer mid) {
    this.mid = mid;
    return this;
  }

  /**
   * Get mid
   * @return mid
  **/
  @ApiModelProperty(value = "")

  public Integer getMid() {
    return mid;
  }

  public void setMid(Integer mid) {
    this.mid = mid;
  }

  public MethodMember name(String name) {
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

  public MethodMember result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public MethodMember argument(String argument) {
    this.argument = argument;
    return this;
  }

  /**
   * Get argument
   * @return argument
  **/
  @ApiModelProperty(value = "")

  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }

  public MethodMember owner(Integer owner) {
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

  public MethodMember description(String description) {
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
    MethodMember methodMember = (MethodMember) o;
    return Objects.equals(this.mid, methodMember.mid) &&
        Objects.equals(this.name, methodMember.name) &&
        Objects.equals(this.result, methodMember.result) &&
        Objects.equals(this.argument, methodMember.argument) &&
        Objects.equals(this.owner, methodMember.owner) &&
        Objects.equals(this.description, methodMember.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mid, name, result, argument, owner, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MethodMember {\n");
    
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
