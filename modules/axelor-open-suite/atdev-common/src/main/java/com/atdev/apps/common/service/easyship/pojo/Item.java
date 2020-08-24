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
@JsonPropertyOrder({
  "id",
  "description",
  "sku",
  "width",
  "length",
  "height",
  "actual_weight",
  "dimensional_weight",
  "volumetric_weight",
  "declared_customs_value",
  "declared_currency",
  "origin_customs_value",
  "origin_currency",
  "category",
  "quantity"
})
public class Item {

  @JsonProperty("id")
  private String id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("sku")
  private String sku;

  @JsonProperty("width")
  private Double width;

  @JsonProperty("length")
  private Double length;

  @JsonProperty("height")
  private Double height;

  @JsonProperty("actual_weight")
  private Double actualWeight;

  @JsonProperty("dimensional_weight")
  private Double dimensionalWeight;

  @JsonProperty("volumetric_weight")
  private Double volumetricWeight;

  @JsonProperty("declared_customs_value")
  private Double declaredCustomsValue;

  @JsonProperty("declared_currency")
  private String declaredCurrency;

  @JsonProperty("origin_customs_value")
  private Double originCustomsValue;

  @JsonProperty("origin_currency")
  private String originCurrency;

  @JsonProperty("category")
  private String category;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  @JsonProperty("sku")
  public void setSku(String sku) {
    this.sku = sku;
  }

  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }

  @JsonProperty("width")
  public void setWidth(Double width) {
    this.width = width;
  }

  @JsonProperty("length")
  public Double getLength() {
    return length;
  }

  @JsonProperty("length")
  public void setLength(Double length) {
    this.length = length;
  }

  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }

  @JsonProperty("height")
  public void setHeight(Double height) {
    this.height = height;
  }

  @JsonProperty("actual_weight")
  public Double getActualWeight() {
    return actualWeight;
  }

  @JsonProperty("actual_weight")
  public void setActualWeight(Double actualWeight) {
    this.actualWeight = actualWeight;
  }

  @JsonProperty("dimensional_weight")
  public Double getDimensionalWeight() {
    return dimensionalWeight;
  }

  @JsonProperty("dimensional_weight")
  public void setDimensionalWeight(Double dimensionalWeight) {
    this.dimensionalWeight = dimensionalWeight;
  }

  @JsonProperty("volumetric_weight")
  public Double getVolumetricWeight() {
    return volumetricWeight;
  }

  @JsonProperty("volumetric_weight")
  public void setVolumetricWeight(Double volumetricWeight) {
    this.volumetricWeight = volumetricWeight;
  }

  @JsonProperty("declared_customs_value")
  public Double getDeclaredCustomsValue() {
    return declaredCustomsValue;
  }

  @JsonProperty("declared_customs_value")
  public void setDeclaredCustomsValue(Double declaredCustomsValue) {
    this.declaredCustomsValue = declaredCustomsValue;
  }

  @JsonProperty("declared_currency")
  public String getDeclaredCurrency() {
    return declaredCurrency;
  }

  @JsonProperty("declared_currency")
  public void setDeclaredCurrency(String declaredCurrency) {
    this.declaredCurrency = declaredCurrency;
  }

  @JsonProperty("origin_customs_value")
  public Double getOriginCustomsValue() {
    return originCustomsValue;
  }

  @JsonProperty("origin_customs_value")
  public void setOriginCustomsValue(Double originCustomsValue) {
    this.originCustomsValue = originCustomsValue;
  }

  @JsonProperty("origin_currency")
  public String getOriginCurrency() {
    return originCurrency;
  }

  @JsonProperty("origin_currency")
  public void setOriginCurrency(String originCurrency) {
    this.originCurrency = originCurrency;
  }

  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(String category) {
    this.category = category;
  }

  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  @JsonProperty("quantity")
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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
