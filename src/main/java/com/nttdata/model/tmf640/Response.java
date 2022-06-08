package com.nttdata.model.tmf640;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A response to a request
 */
@ApiModel(description = "A response to a request")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-25T14:06:01.043Z")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Response   {
  @JsonProperty("body")
  private String body = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("header")
  private List<HeaderItem> header = new ArrayList<HeaderItem>();

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public Response body(String body) {
    this.body = body;
    return this;
  }

  /**
   * The body of the response. For example for an HTTP response might contain HTML for rendering.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "The body of the response. For example for an HTTP response might contain HTML for rendering.")
  @NotNull


  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Response statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of the response. For example for an HTTP response would be codes such as 200, 400, etc.
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of the response. For example for an HTTP response would be codes such as 200, 400, etc.")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public Response header(List<HeaderItem> header) {
    this.header = header;
    return this;
  }

  public Response addHeaderItem(HeaderItem headerItem) {
    this.header.add(headerItem);
    return this;
  }

  /**
   * Items included in the header of the response. For example for an HTTP response might contain negotiated locale.
   * @return header
  **/
  @ApiModelProperty(required = true, value = "Items included in the header of the response. For example for an HTTP response might contain negotiated locale.")
  @NotNull

  public List<HeaderItem> getHeader() {
    return header;
  }

  public void setHeader(List<HeaderItem> header) {
    this.header = header;
  }

  public Response baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public Response schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public Response type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.body, response.body) &&
        Objects.equals(this.statusCode, response.statusCode) &&
        Objects.equals(this.header, response.header) &&
        Objects.equals(this.baseType, response.baseType) &&
        Objects.equals(this.schemaLocation, response.schemaLocation) &&
        Objects.equals(this.type, response.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, statusCode, header, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

