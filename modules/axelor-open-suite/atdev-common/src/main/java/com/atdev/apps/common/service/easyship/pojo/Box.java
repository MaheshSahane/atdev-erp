package com.atdev.apps.common.service.easyship.pojo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "length", "width", "height"})
public class Box {

  @JsonProperty("name")
  private Object name;

  @JsonProperty("length")
  private String length;

  @JsonProperty("width")
  private String width;

  @JsonProperty("height")
  private String height;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("name")
  public Object getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(Object name) {
    this.name = name;
  }

  @JsonProperty("length")
  public String getLength() {
    return length;
  }

  @JsonProperty("length")
  public void setLength(String length) {
    this.length = length;
  }

  @JsonProperty("width")
  public String getWidth() {
    return width;
  }

  @JsonProperty("width")
  public void setWidth(String width) {
    this.width = width;
  }

  @JsonProperty("height")
  public String getHeight() {
    return height;
  }

  @JsonProperty("height")
  public void setHeight(String height) {
    this.height = height;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }
}
