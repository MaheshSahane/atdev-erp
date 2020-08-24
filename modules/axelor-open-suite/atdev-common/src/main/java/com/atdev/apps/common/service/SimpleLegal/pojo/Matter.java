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
  "client_matter_id",
  "id",
  "close_date",
  "created_date",
  "description",
  "matter_description",
  "matter_hash",
  "matter_lead",
  "matter_short_name",
  "modified_date",
  "name",
  "open_date",
  "status",
  "url"
})
public class Matter {

  @JsonProperty("client_matter_id")
  private String clientMatterId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("close_date")
  private Object closeDate;

  @JsonProperty("created_date")
  private String createdDate;

  @JsonProperty("description")
  private String description;

  @JsonProperty("matter_description")
  private String matterDescription;

  @JsonProperty("matter_hash")
  private String matterHash;

  @JsonProperty("matter_lead")
  private MatterLead matterLead;

  @JsonProperty("matter_short_name")
  private String matterShortName;

  @JsonProperty("modified_date")
  private String modifiedDate;

  @JsonProperty("name")
  private String name;

  @JsonProperty("open_date")
  private String openDate;

  @JsonProperty("status")
  private String status;

  @JsonProperty("url")
  private String url;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("client_matter_id")
  public String getClientMatterId() {
    return clientMatterId;
  }

  @JsonProperty("client_matter_id")
  public void setClientMatterId(String clientMatterId) {
    this.clientMatterId = clientMatterId;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("close_date")
  public Object getCloseDate() {
    return closeDate;
  }

  @JsonProperty("close_date")
  public void setCloseDate(Object closeDate) {
    this.closeDate = closeDate;
  }

  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  @JsonProperty("created_date")
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("matter_description")
  public String getMatterDescription() {
    return matterDescription;
  }

  @JsonProperty("matter_description")
  public void setMatterDescription(String matterDescription) {
    this.matterDescription = matterDescription;
  }

  @JsonProperty("matter_hash")
  public String getMatterHash() {
    return matterHash;
  }

  @JsonProperty("matter_hash")
  public void setMatterHash(String matterHash) {
    this.matterHash = matterHash;
  }

  @JsonProperty("matter_lead")
  public MatterLead getMatterLead() {
    return matterLead;
  }

  @JsonProperty("matter_lead")
  public void setMatterLead(MatterLead matterLead) {
    this.matterLead = matterLead;
  }

  @JsonProperty("matter_short_name")
  public String getMatterShortName() {
    return matterShortName;
  }

  @JsonProperty("matter_short_name")
  public void setMatterShortName(String matterShortName) {
    this.matterShortName = matterShortName;
  }

  @JsonProperty("modified_date")
  public String getModifiedDate() {
    return modifiedDate;
  }

  @JsonProperty("modified_date")
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("open_date")
  public String getOpenDate() {
    return openDate;
  }

  @JsonProperty("open_date")
  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
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
