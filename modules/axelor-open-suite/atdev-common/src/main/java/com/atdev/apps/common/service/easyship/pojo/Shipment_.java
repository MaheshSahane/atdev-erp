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
@JsonPropertyOrder({
  "created_at",
  "updated_at",
  "order_created_at",
  "easyship_shipment_id",
  "origin_address",
  "store_name",
  "set_as_residential",
  "destination_name",
  "destination_company_name",
  "consignee_tax_id",
  "destination_address_line_1",
  "destination_address_line_2",
  "destination_country_alpha2",
  "destination_city",
  "destination_state",
  "destination_postal_code",
  "destination_phone_number",
  "destination_email_address",
  "order_notes",
  "buyer_notes",
  "seller_notes",
  "order_tag_list",
  "platform_order_number",
  "platform_name",
  "total_customs_value",
  "total_actual_weight",
  "total_dimensional_weight",
  "total_volumetric_weight",
  "is_insured",
  "currency",
  "shipment_state",
  "pickup_state",
  "delivery_state",
  "label_state",
  "warehouse_state",
  "origin_country",
  "destination_country",
  "items",
  "box",
  "selected_courier",
  "is_merged",
  "discount"
})
public class Shipment_ {

  @JsonProperty("created_at")
  private String createdAt;

  @JsonProperty("updated_at")
  private String updatedAt;

  @JsonProperty("order_created_at")
  private Object orderCreatedAt;

  @JsonProperty("easyship_shipment_id")
  private String easyshipShipmentId;

  @JsonProperty("origin_address")
  private OriginAddress originAddress;

  @JsonProperty("store_name")
  private Object storeName;

  @JsonProperty("set_as_residential")
  private Boolean setAsResidential;

  @JsonProperty("destination_name")
  private String destinationName;

  @JsonProperty("destination_company_name")
  private String destinationCompanyName;

  @JsonProperty("consignee_tax_id")
  private Object consigneeTaxId;

  @JsonProperty("destination_address_line_1")
  private String destinationAddressLine1;

  @JsonProperty("destination_address_line_2")
  private String destinationAddressLine2;

  @JsonProperty("destination_country_alpha2")
  private String destinationCountryAlpha2;

  @JsonProperty("destination_city")
  private String destinationCity;

  @JsonProperty("destination_state")
  private String destinationState;

  @JsonProperty("destination_postal_code")
  private String destinationPostalCode;

  @JsonProperty("destination_phone_number")
  private String destinationPhoneNumber;

  @JsonProperty("destination_email_address")
  private String destinationEmailAddress;

  @JsonProperty("order_notes")
  private Object orderNotes;

  @JsonProperty("buyer_notes")
  private Object buyerNotes;

  @JsonProperty("seller_notes")
  private Object sellerNotes;

  @JsonProperty("order_tag_list")
  private List<Object> orderTagList = null;

  @JsonProperty("platform_order_number")
  private String platformOrderNumber;

  @JsonProperty("platform_name")
  private String platformName;

  @JsonProperty("total_customs_value")
  private Double totalCustomsValue;

  @JsonProperty("total_actual_weight")
  private Double totalActualWeight;

  @JsonProperty("total_dimensional_weight")
  private Double totalDimensionalWeight;

  @JsonProperty("total_volumetric_weight")
  private Double totalVolumetricWeight;

  @JsonProperty("is_insured")
  private Boolean isInsured;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("shipment_state")
  private String shipmentState;

  @JsonProperty("pickup_state")
  private String pickupState;

  @JsonProperty("delivery_state")
  private String deliveryState;

  @JsonProperty("label_state")
  private String labelState;

  @JsonProperty("warehouse_state")
  private String warehouseState;

  @JsonProperty("origin_country")
  private OriginCountry originCountry;

  @JsonProperty("destination_country")
  private DestinationCountry destinationCountry;

  @JsonProperty("items")
  private List<Item> items = null;

  @JsonProperty("box")
  private Box box;

  @JsonProperty("selected_courier")
  private String selectedCourier;

  @JsonProperty("is_merged")
  private Boolean isMerged;

  @JsonProperty("discount")
  private Discount discount;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updated_at")
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @JsonProperty("order_created_at")
  public Object getOrderCreatedAt() {
    return orderCreatedAt;
  }

  @JsonProperty("order_created_at")
  public void setOrderCreatedAt(Object orderCreatedAt) {
    this.orderCreatedAt = orderCreatedAt;
  }

  @JsonProperty("easyship_shipment_id")
  public String getEasyshipShipmentId() {
    return easyshipShipmentId;
  }

  @JsonProperty("easyship_shipment_id")
  public void setEasyshipShipmentId(String easyshipShipmentId) {
    this.easyshipShipmentId = easyshipShipmentId;
  }

  @JsonProperty("origin_address")
  public OriginAddress getOriginAddress() {
    return originAddress;
  }

  @JsonProperty("origin_address")
  public void setOriginAddress(OriginAddress originAddress) {
    this.originAddress = originAddress;
  }

  @JsonProperty("store_name")
  public Object getStoreName() {
    return storeName;
  }

  @JsonProperty("store_name")
  public void setStoreName(Object storeName) {
    this.storeName = storeName;
  }

  @JsonProperty("set_as_residential")
  public Boolean getSetAsResidential() {
    return setAsResidential;
  }

  @JsonProperty("set_as_residential")
  public void setSetAsResidential(Boolean setAsResidential) {
    this.setAsResidential = setAsResidential;
  }

  @JsonProperty("destination_name")
  public String getDestinationName() {
    return destinationName;
  }

  @JsonProperty("destination_name")
  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  @JsonProperty("destination_company_name")
  public String getDestinationCompanyName() {
    return destinationCompanyName;
  }

  @JsonProperty("destination_company_name")
  public void setDestinationCompanyName(String destinationCompanyName) {
    this.destinationCompanyName = destinationCompanyName;
  }

  @JsonProperty("consignee_tax_id")
  public Object getConsigneeTaxId() {
    return consigneeTaxId;
  }

  @JsonProperty("consignee_tax_id")
  public void setConsigneeTaxId(Object consigneeTaxId) {
    this.consigneeTaxId = consigneeTaxId;
  }

  @JsonProperty("destination_address_line_1")
  public String getDestinationAddressLine1() {
    return destinationAddressLine1;
  }

  @JsonProperty("destination_address_line_1")
  public void setDestinationAddressLine1(String destinationAddressLine1) {
    this.destinationAddressLine1 = destinationAddressLine1;
  }

  @JsonProperty("destination_address_line_2")
  public String getDestinationAddressLine2() {
    return destinationAddressLine2;
  }

  @JsonProperty("destination_address_line_2")
  public void setDestinationAddressLine2(String destinationAddressLine2) {
    this.destinationAddressLine2 = destinationAddressLine2;
  }

  //    destination_country_alpha2

  @JsonProperty("destination_country_alpha2")
  public String getDestinationCountryAlpha2() {
    return destinationCountryAlpha2;
  }

  @JsonProperty("destination_country_alpha2")
  public void setDestinationCountryAlpha2(String destinationCountryAlpha2) {
    this.destinationCountryAlpha2 = destinationCountryAlpha2;
  }

  @JsonProperty("destination_city")
  public String getDestinationCity() {
    return destinationCity;
  }

  @JsonProperty("destination_city")
  public void setDestinationCity(String destinationCity) {
    this.destinationCity = destinationCity;
  }

  @JsonProperty("destination_state")
  public String getDestinationState() {
    return destinationState;
  }

  @JsonProperty("destination_state")
  public void setDestinationState(String destinationState) {
    this.destinationState = destinationState;
  }

  @JsonProperty("destination_postal_code")
  public String getDestinationPostalCode() {
    return destinationPostalCode;
  }

  @JsonProperty("destination_postal_code")
  public void setDestinationPostalCode(String destinationPostalCode) {
    this.destinationPostalCode = destinationPostalCode;
  }

  @JsonProperty("destination_phone_number")
  public String getDestinationPhoneNumber() {
    return destinationPhoneNumber;
  }

  @JsonProperty("destination_phone_number")
  public void setDestinationPhoneNumber(String destinationPhoneNumber) {
    this.destinationPhoneNumber = destinationPhoneNumber;
  }

  @JsonProperty("destination_email_address")
  public String getDestinationEmailAddress() {
    return destinationEmailAddress;
  }

  @JsonProperty("destination_email_address")
  public void setDestinationEmailAddress(String destinationEmailAddress) {
    this.destinationEmailAddress = destinationEmailAddress;
  }

  @JsonProperty("order_notes")
  public Object getOrderNotes() {
    return orderNotes;
  }

  @JsonProperty("order_notes")
  public void setOrderNotes(Object orderNotes) {
    this.orderNotes = orderNotes;
  }

  @JsonProperty("buyer_notes")
  public Object getBuyerNotes() {
    return buyerNotes;
  }

  @JsonProperty("buyer_notes")
  public void setBuyerNotes(Object buyerNotes) {
    this.buyerNotes = buyerNotes;
  }

  @JsonProperty("seller_notes")
  public Object getSellerNotes() {
    return sellerNotes;
  }

  @JsonProperty("seller_notes")
  public void setSellerNotes(Object sellerNotes) {
    this.sellerNotes = sellerNotes;
  }

  @JsonProperty("order_tag_list")
  public List<Object> getOrderTagList() {
    return orderTagList;
  }

  @JsonProperty("order_tag_list")
  public void setOrderTagList(List<Object> orderTagList) {
    this.orderTagList = orderTagList;
  }

  @JsonProperty("platform_order_number")
  public String getPlatformOrderNumber() {
    return platformOrderNumber;
  }

  @JsonProperty("platform_order_number")
  public void setPlatformOrderNumber(String platformOrderNumber) {
    this.platformOrderNumber = platformOrderNumber;
  }

  @JsonProperty("platform_name")
  public String getPlatformName() {
    return platformName;
  }

  @JsonProperty("platform_name")
  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }

  @JsonProperty("total_customs_value")
  public Double getTotalCustomsValue() {
    return totalCustomsValue;
  }

  @JsonProperty("total_customs_value")
  public void setTotalCustomsValue(Double totalCustomsValue) {
    this.totalCustomsValue = totalCustomsValue;
  }

  @JsonProperty("total_actual_weight")
  public Double getTotalActualWeight() {
    return totalActualWeight;
  }

  @JsonProperty("total_actual_weight")
  public void setTotalActualWeight(Double totalActualWeight) {
    this.totalActualWeight = totalActualWeight;
  }

  @JsonProperty("total_dimensional_weight")
  public Double getTotalDimensionalWeight() {
    return totalDimensionalWeight;
  }

  @JsonProperty("total_dimensional_weight")
  public void setTotalDimensionalWeight(Double totalDimensionalWeight) {
    this.totalDimensionalWeight = totalDimensionalWeight;
  }

  @JsonProperty("total_volumetric_weight")
  public Double getTotalVolumetricWeight() {
    return totalVolumetricWeight;
  }

  @JsonProperty("total_volumetric_weight")
  public void setTotalVolumetricWeight(Double totalVolumetricWeight) {
    this.totalVolumetricWeight = totalVolumetricWeight;
  }

  @JsonProperty("is_insured")
  public Boolean getIsInsured() {
    return isInsured;
  }

  @JsonProperty("is_insured")
  public void setIsInsured(Boolean isInsured) {
    this.isInsured = isInsured;
  }

  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @JsonProperty("shipment_state")
  public String getShipmentState() {
    return shipmentState;
  }

  @JsonProperty("shipment_state")
  public void setShipmentState(String shipmentState) {
    this.shipmentState = shipmentState;
  }

  @JsonProperty("pickup_state")
  public String getPickupState() {
    return pickupState;
  }

  @JsonProperty("pickup_state")
  public void setPickupState(String pickupState) {
    this.pickupState = pickupState;
  }

  @JsonProperty("delivery_state")
  public String getDeliveryState() {
    return deliveryState;
  }

  @JsonProperty("delivery_state")
  public void setDeliveryState(String deliveryState) {
    this.deliveryState = deliveryState;
  }

  @JsonProperty("label_state")
  public String getLabelState() {
    return labelState;
  }

  @JsonProperty("label_state")
  public void setLabelState(String labelState) {
    this.labelState = labelState;
  }

  @JsonProperty("warehouse_state")
  public String getWarehouseState() {
    return warehouseState;
  }

  @JsonProperty("warehouse_state")
  public void setWarehouseState(String warehouseState) {
    this.warehouseState = warehouseState;
  }

  @JsonProperty("origin_country")
  public OriginCountry getOriginCountry() {
    return originCountry;
  }

  @JsonProperty("origin_country")
  public void setOriginCountry(OriginCountry originCountry) {
    this.originCountry = originCountry;
  }

  @JsonProperty("destination_country")
  public DestinationCountry getDestinationCountry() {
    return destinationCountry;
  }

  @JsonProperty("destination_country")
  public void setDestinationCountry(DestinationCountry destinationCountry) {
    this.destinationCountry = destinationCountry;
  }

  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<Item> items) {
    this.items = items;
  }

  @JsonProperty("box")
  public Box getBox() {
    return box;
  }

  @JsonProperty("box")
  public void setBox(Box box) {
    this.box = box;
  }

  @JsonProperty("selected_courier")
  public String getSelectedCourier() {
    return selectedCourier;
  }

  @JsonProperty("selected_courier")
  public void setSelectedCourier(String selectedCourier) {
    this.selectedCourier = selectedCourier;
  }

  @JsonProperty("is_merged")
  public Boolean getIsMerged() {
    return isMerged;
  }

  @JsonProperty("is_merged")
  public void setIsMerged(Boolean isMerged) {
    this.isMerged = isMerged;
  }

  @JsonProperty("discount")
  public Discount getDiscount() {
    return discount;
  }

  @JsonProperty("discount")
  public void setDiscount(Discount discount) {
    this.discount = discount;
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
