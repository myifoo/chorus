package com.platform.chorus.web.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ClassMeta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
public class ClassMeta   {
  @JsonProperty("class")
  private ClassMember propertyClass = null;

  @JsonProperty("fields")
  @Valid
  private List<FieldMember> fields = null;

  @JsonProperty("methods")
  @Valid
  private List<MethodMember> methods = null;

  public ClassMeta propertyClass(ClassMember propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ClassMember getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(ClassMember propertyClass) {
    this.propertyClass = propertyClass;
  }

  public ClassMeta fields(List<FieldMember> fields) {
    this.fields = fields;
    return this;
  }

  public ClassMeta addFieldsItem(FieldMember fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldMember>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<FieldMember> getFields() {
    return fields;
  }

  public void setFields(List<FieldMember> fields) {
    this.fields = fields;
  }

  public ClassMeta methods(List<MethodMember> methods) {
    this.methods = methods;
    return this;
  }

  public ClassMeta addMethodsItem(MethodMember methodsItem) {
    if (this.methods == null) {
      this.methods = new ArrayList<MethodMember>();
    }
    this.methods.add(methodsItem);
    return this;
  }

  /**
   * Get methods
   * @return methods
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<MethodMember> getMethods() {
    return methods;
  }

  public void setMethods(List<MethodMember> methods) {
    this.methods = methods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassMeta classMeta = (ClassMeta) o;
    return Objects.equals(this.propertyClass, classMeta.propertyClass) &&
        Objects.equals(this.fields, classMeta.fields) &&
        Objects.equals(this.methods, classMeta.methods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, fields, methods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassMeta {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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
