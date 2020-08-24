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
  "id",
  "payment_method",
  "reference_number",
  "amount",
  "currency",
  "memo",
  "batch",
  "payment_date",
  "created_date",
  "modified_date"
})
public class Payment {

  @JsonProperty("id")
  private String id;

  @JsonProperty("payment_method")
  private String paymentMethod;

  @JsonProperty("reference_number")
  private String referenceNumber;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("memo")
  private Object memo;

  @JsonProperty("batch")
  private Object batch;

  @JsonProperty("payment_date")
  private String paymentDate;

  @JsonProperty("created_date")
  private String createdDate;

  @JsonProperty("modified_date")
  private String modifiedDate;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("payment_method")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  @JsonProperty("payment_method")
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @JsonProperty("reference_number")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  @JsonProperty("reference_number")
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @JsonProperty("memo")
  public Object getMemo() {
    return memo;
  }

  @JsonProperty("memo")
  public void setMemo(Object memo) {
    this.memo = memo;
  }

  @JsonProperty("batch")
  public Object getBatch() {
    return batch;
  }

  @JsonProperty("batch")
  public void setBatch(Object batch) {
    this.batch = batch;
  }

  @JsonProperty("payment_date")
  public String getPaymentDate() {
    return paymentDate;
  }

  @JsonProperty("payment_date")
  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  @JsonProperty("created_date")
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  @JsonProperty("modified_date")
  public String getModifiedDate() {
    return modifiedDate;
  }

  @JsonProperty("modified_date")
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
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
