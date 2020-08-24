package com.atdev.apps.common.service.SimpleLegal.pojo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "amount",
  "cost_code",
  "custom_attributes",
  "entity",
  "matter",
  "native_amount",
  "other_attributes",
  "percentage"
})
public class AllocationSummary {

  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("cost_code")
  private Object costCode;

  @JsonProperty("custom_attributes")
  private List<Object> customAttributes = null;

  @JsonProperty("entity")
  private Object entity;

  @JsonProperty("matter")
  private String matter;

  @JsonProperty("native_amount")
  private Integer nativeAmount;

  @JsonProperty("other_attributes")
  private List<Object> otherAttributes = null;

  @JsonProperty("percentage")
  private Integer percentage;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  @JsonProperty("cost_code")
  public Object getCostCode() {
    return costCode;
  }

  @JsonProperty("cost_code")
  public void setCostCode(Object costCode) {
    this.costCode = costCode;
  }

  @JsonProperty("custom_attributes")
  public List<Object> getCustomAttributes() {
    return customAttributes;
  }

  @JsonProperty("custom_attributes")
  public void setCustomAttributes(List<Object> customAttributes) {
    this.customAttributes = customAttributes;
  }

  @JsonProperty("entity")
  public Object getEntity() {
    return entity;
  }

  @JsonProperty("entity")
  public void setEntity(Object entity) {
    this.entity = entity;
  }

  @JsonProperty("matter")
  public String getMatter() {
    return matter;
  }

  @JsonProperty("matter")
  public void setMatter(String matter) {
    this.matter = matter;
  }

  @JsonProperty("native_amount")
  public Integer getNativeAmount() {
    return nativeAmount;
  }

  @JsonProperty("native_amount")
  public void setNativeAmount(Integer nativeAmount) {
    this.nativeAmount = nativeAmount;
  }

  @JsonProperty("other_attributes")
  public List<Object> getOtherAttributes() {
    return otherAttributes;
  }

  @JsonProperty("other_attributes")
  public void setOtherAttributes(List<Object> otherAttributes) {
    this.otherAttributes = otherAttributes;
  }

  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }

  @JsonProperty("percentage")
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
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
