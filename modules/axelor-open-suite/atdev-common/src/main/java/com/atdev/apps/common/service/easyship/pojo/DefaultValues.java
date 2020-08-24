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
@JsonPropertyOrder({"pickup", "billing", "sender", "return"})
public class DefaultValues {

  @JsonProperty("pickup")
  private Boolean pickup;

  @JsonProperty("billing")
  private Boolean billing;

  @JsonProperty("sender")
  private Boolean sender;

  @JsonProperty("return")
  private Boolean _return;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("pickup")
  public Boolean getPickup() {
    return pickup;
  }

  @JsonProperty("pickup")
  public void setPickup(Boolean pickup) {
    this.pickup = pickup;
  }

  @JsonProperty("billing")
  public Boolean getBilling() {
    return billing;
  }

  @JsonProperty("billing")
  public void setBilling(Boolean billing) {
    this.billing = billing;
  }

  @JsonProperty("sender")
  public Boolean getSender() {
    return sender;
  }

  @JsonProperty("sender")
  public void setSender(Boolean sender) {
    this.sender = sender;
  }

  @JsonProperty("return")
  public Boolean getReturn() {
    return _return;
  }

  @JsonProperty("return")
  public void setReturn(Boolean _return) {
    this._return = _return;
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
