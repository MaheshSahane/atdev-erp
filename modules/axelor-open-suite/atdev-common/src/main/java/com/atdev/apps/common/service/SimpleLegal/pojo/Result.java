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
  "id",
  "obj_id",
  "vendor_id",
  "allocation_summary",
  "api_url",
  "approvers",
  "attachments",
  "billing_end_date",
  "billing_start_date",
  "currency",
  "exchange_rate",
  "final_amount",
  "final_status_history",
  "invoice_date",
  "invoice_number",
  "invoice_subject",
  "matters",
  "modified_date",
  "native_currency",
  "native_net",
  "native_tax",
  "native_total",
  "net",
  "po",
  "received_date",
  "status",
  "tax",
  "total",
  "url",
  "vendor",
  "vendor_number",
  "custom_attributes"
})
public class Result {

  @JsonProperty("id")
  private String id;

  @JsonProperty("obj_id")
  private Integer objId;

  @JsonProperty("vendor_id")
  private String vendorId;

  @JsonProperty("allocation_summary")
  private List<AllocationSummary> allocationSummary = null;

  @JsonProperty("api_url")
  private String apiUrl;

  @JsonProperty("approvers")
  private List<Approver> approvers = null;

  @JsonProperty("attachments")
  private List<Object> attachments = null;

  @JsonProperty("billing_end_date")
  private String billingEndDate;

  @JsonProperty("billing_start_date")
  private String billingStartDate;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("exchange_rate")
  private Object exchangeRate;

  @JsonProperty("final_amount")
  private Integer finalAmount;

  @JsonProperty("final_status_history")
  private List<Object> finalStatusHistory = null;

  @JsonProperty("invoice_date")
  private String invoiceDate;

  @JsonProperty("invoice_number")
  private String invoiceNumber;

  @JsonProperty("invoice_subject")
  private String invoiceSubject;

  @JsonProperty("matters")
  private List<Matter> matters = null;

  @JsonProperty("modified_date")
  private String modifiedDate;

  @JsonProperty("native_currency")
  private Object nativeCurrency;

  @JsonProperty("native_net")
  private Object nativeNet;

  @JsonProperty("native_tax")
  private Object nativeTax;

  @JsonProperty("native_total")
  private Object nativeTotal;

  @JsonProperty("net")
  private Object net;

  @JsonProperty("po")
  private Object po;

  @JsonProperty("received_date")
  private String receivedDate;

  @JsonProperty("status")
  private String status;

  @JsonProperty("tax")
  private Object tax;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("url")
  private String url;

  @JsonProperty("vendor")
  private String vendor;

  @JsonProperty("vendor_number")
  private Object vendorNumber;

  @JsonProperty("custom_attributes")
  private List<CustomAttribute> customAttributes = null;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("obj_id")
  public Integer getObjId() {
    return objId;
  }

  @JsonProperty("obj_id")
  public void setObjId(Integer objId) {
    this.objId = objId;
  }

  @JsonProperty("vendor_id")
  public String getVendorId() {
    return vendorId;
  }

  @JsonProperty("vendor_id")
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  @JsonProperty("allocation_summary")
  public List<AllocationSummary> getAllocationSummary() {
    return allocationSummary;
  }

  @JsonProperty("allocation_summary")
  public void setAllocationSummary(List<AllocationSummary> allocationSummary) {
    this.allocationSummary = allocationSummary;
  }

  @JsonProperty("api_url")
  public String getApiUrl() {
    return apiUrl;
  }

  @JsonProperty("api_url")
  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  @JsonProperty("approvers")
  public List<Approver> getApprovers() {
    return approvers;
  }

  @JsonProperty("approvers")
  public void setApprovers(List<Approver> approvers) {
    this.approvers = approvers;
  }

  @JsonProperty("attachments")
  public List<Object> getAttachments() {
    return attachments;
  }

  @JsonProperty("attachments")
  public void setAttachments(List<Object> attachments) {
    this.attachments = attachments;
  }

  @JsonProperty("billing_end_date")
  public String getBillingEndDate() {
    return billingEndDate;
  }

  @JsonProperty("billing_end_date")
  public void setBillingEndDate(String billingEndDate) {
    this.billingEndDate = billingEndDate;
  }

  @JsonProperty("billing_start_date")
  public String getBillingStartDate() {
    return billingStartDate;
  }

  @JsonProperty("billing_start_date")
  public void setBillingStartDate(String billingStartDate) {
    this.billingStartDate = billingStartDate;
  }

  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @JsonProperty("exchange_rate")
  public Object getExchangeRate() {
    return exchangeRate;
  }

  @JsonProperty("exchange_rate")
  public void setExchangeRate(Object exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  @JsonProperty("final_amount")
  public Integer getFinalAmount() {
    return finalAmount;
  }

  @JsonProperty("final_amount")
  public void setFinalAmount(Integer finalAmount) {
    this.finalAmount = finalAmount;
  }

  @JsonProperty("final_status_history")
  public List<Object> getFinalStatusHistory() {
    return finalStatusHistory;
  }

  @JsonProperty("final_status_history")
  public void setFinalStatusHistory(List<Object> finalStatusHistory) {
    this.finalStatusHistory = finalStatusHistory;
  }

  @JsonProperty("invoice_date")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  @JsonProperty("invoice_date")
  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  @JsonProperty("invoice_number")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  @JsonProperty("invoice_number")
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  @JsonProperty("invoice_subject")
  public String getInvoiceSubject() {
    return invoiceSubject;
  }

  @JsonProperty("invoice_subject")
  public void setInvoiceSubject(String invoiceSubject) {
    this.invoiceSubject = invoiceSubject;
  }

  @JsonProperty("matters")
  public List<Matter> getMatters() {
    return matters;
  }

  @JsonProperty("matters")
  public void setMatters(List<Matter> matters) {
    this.matters = matters;
  }

  @JsonProperty("modified_date")
  public String getModifiedDate() {
    return modifiedDate;
  }

  @JsonProperty("modified_date")
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  @JsonProperty("native_currency")
  public Object getNativeCurrency() {
    return nativeCurrency;
  }

  @JsonProperty("native_currency")
  public void setNativeCurrency(Object nativeCurrency) {
    this.nativeCurrency = nativeCurrency;
  }

  @JsonProperty("native_net")
  public Object getNativeNet() {
    return nativeNet;
  }

  @JsonProperty("native_net")
  public void setNativeNet(Object nativeNet) {
    this.nativeNet = nativeNet;
  }

  @JsonProperty("native_tax")
  public Object getNativeTax() {
    return nativeTax;
  }

  @JsonProperty("native_tax")
  public void setNativeTax(Object nativeTax) {
    this.nativeTax = nativeTax;
  }

  @JsonProperty("native_total")
  public Object getNativeTotal() {
    return nativeTotal;
  }

  @JsonProperty("native_total")
  public void setNativeTotal(Object nativeTotal) {
    this.nativeTotal = nativeTotal;
  }

  @JsonProperty("net")
  public Object getNet() {
    return net;
  }

  @JsonProperty("net")
  public void setNet(Object net) {
    this.net = net;
  }

  @JsonProperty("po")
  public Object getPo() {
    return po;
  }

  @JsonProperty("po")
  public void setPo(Object po) {
    this.po = po;
  }

  @JsonProperty("received_date")
  public String getReceivedDate() {
    return receivedDate;
  }

  @JsonProperty("received_date")
  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  @JsonProperty("tax")
  public Object getTax() {
    return tax;
  }

  @JsonProperty("tax")
  public void setTax(Object tax) {
    this.tax = tax;
  }

  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  @JsonProperty("total")
  public void setTotal(Integer total) {
    this.total = total;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }

  @JsonProperty("vendor")
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  @JsonProperty("vendor_number")
  public Object getVendorNumber() {
    return vendorNumber;
  }

  @JsonProperty("vendor_number")
  public void setVendorNumber(Object vendorNumber) {
    this.vendorNumber = vendorNumber;
  }

  @JsonProperty("custom_attributes")
  public List<CustomAttribute> getCustomAttributes() {
    return customAttributes;
  }

  @JsonProperty("custom_attributes")
  public void setCustomAttributes(List<CustomAttribute> customAttributes) {
    this.customAttributes = customAttributes;
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
