package com.platform.chorus.web.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ErrorResponseBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
public class ErrorResponseBody extends ResponseBody  {
  @JsonProperty("cause")
  private String cause = null;

  @JsonProperty("code")
  private Integer code = null;

  public ErrorResponseBody cause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(value = "")

  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public ErrorResponseBody code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseBody errorResponseBody = (ErrorResponseBody) o;
    return Objects.equals(this.cause, errorResponseBody.cause) &&
        Objects.equals(this.code, errorResponseBody.code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseBody {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
