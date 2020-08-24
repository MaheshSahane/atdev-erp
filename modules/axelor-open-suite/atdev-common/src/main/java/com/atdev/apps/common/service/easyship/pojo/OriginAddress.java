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
  "company_name",
  "contact_name",
  "contact_email",
  "contact_phone",
  "line_1",
  "line_2",
  "postal_code",
  "city",
  "state",
  "country",
  "default_values"
})
public class OriginAddress {

  @JsonProperty("id")
  private String id;

  @JsonProperty("company_name")
  private String companyName;

  @JsonProperty("contact_name")
  private String contactName;

  @JsonProperty("contact_email")
  private String contactEmail;

  @JsonProperty("contact_phone")
  private String contactPhone;

  @JsonProperty("line_1")
  private String line1;

  @JsonProperty("line_2")
  private String line2;

  @JsonProperty("postal_code")
  private String postalCode;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("default_values")
  private DefaultValues defaultValues;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }

  @JsonProperty("company_name")
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @JsonProperty("contact_name")
  public String getContactName() {
    return contactName;
  }

  @JsonProperty("contact_name")
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  @JsonProperty("contact_email")
  public String getContactEmail() {
    return contactEmail;
  }

  @JsonProperty("contact_email")
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  @JsonProperty("contact_phone")
  public String getContactPhone() {
    return contactPhone;
  }

  @JsonProperty("contact_phone")
  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  @JsonProperty("line_1")
  public String getLine1() {
    return line1;
  }

  @JsonProperty("line_1")
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  @JsonProperty("line_2")
  public String getLine2() {
    return line2;
  }

  @JsonProperty("line_2")
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  @JsonProperty("postal_code")
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }

  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(Country country) {
    this.country = country;
  }

  @JsonProperty("default_values")
  public DefaultValues getDefaultValues() {
    return defaultValues;
  }

  @JsonProperty("default_values")
  public void setDefaultValues(DefaultValues defaultValues) {
    this.defaultValues = defaultValues;
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
