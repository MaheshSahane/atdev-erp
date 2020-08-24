package com.atdev.apps.common.service.easyship.pojo;

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
@JsonPropertyOrder({"total_pages", "current_page", "shipments", "shipment"})
public class Shipment {

  @JsonProperty("total_pages")
  private Integer totalPages;

  @JsonProperty("current_page")
  private Integer currentPage;

  @JsonProperty("shipments")
  private List<Shipment_> shipments = null;

  @JsonProperty("shipment")
  private Shipment_ shipment;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("total_pages")
  public Integer getTotalPages() {
    return totalPages;
  }

  @JsonProperty("total_pages")
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  @JsonProperty("current_page")
  public Integer getCurrentPage() {
    return currentPage;
  }

  @JsonProperty("current_page")
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  @JsonProperty("shipments")
  public List<Shipment_> getShipments() {
    return shipments;
  }

  @JsonProperty("shipments")
  public void setShipments(List<Shipment_> shipments) {
    this.shipments = shipments;
  }

  @JsonProperty("shipment")
  public Shipment_ getShipment() {
    return shipment;
  }

  @JsonProperty("shipment")
  public void setShipment(Shipment_ shipment) {
    this.shipment = shipment;
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
