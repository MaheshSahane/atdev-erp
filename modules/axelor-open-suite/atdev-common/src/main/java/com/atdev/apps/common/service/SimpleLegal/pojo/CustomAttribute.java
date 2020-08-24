package com.atdev.apps.common.service.SimpleLegal.pojo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "type",
  "attribute_group_sort",
  "attribute_group",
  "valid_values",
  "value",
  "name",
  "hash"
})
public class CustomAttribute {

  @JsonProperty("type")
  private String type;

  @JsonProperty("attribute_group_sort")
  private Integer attributeGroupSort;

  @JsonProperty("attribute_group")
  private String attributeGroup;

  @JsonProperty("valid_values")
  private String validValues;

  @JsonProperty("value")
  private String value;

  @JsonProperty("name")
  private String name;

  @JsonProperty("hash")
  private String hash;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("attribute_group_sort")
  public Integer getAttributeGroupSort() {
    return attributeGroupSort;
  }

  @JsonProperty("attribute_group_sort")
  public void setAttributeGroupSort(Integer attributeGroupSort) {
    this.attributeGroupSort = attributeGroupSort;
  }

  @JsonProperty("attribute_group")
  public String getAttributeGroup() {
    return attributeGroup;
  }

  @JsonProperty("attribute_group")
  public void setAttributeGroup(String attributeGroup) {
    this.attributeGroup = attributeGroup;
  }

  @JsonProperty("valid_values")
  public String getValidValues() {
    return validValues;
  }

  @JsonProperty("valid_values")
  public void setValidValues(String validValues) {
    this.validValues = validValues;
  }

  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(String value) {
    this.value = value;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }

  @JsonProperty("hash")
  public void setHash(String hash) {
    this.hash = hash;
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
