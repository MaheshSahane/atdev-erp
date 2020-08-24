
package com.atdev.apps.common.service.SimpleLegal.pojo.user;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "email",
    "first_name",
    "last_name",
    "phone",
    "orgrole",
    "active",
    "approval_authority",
    "two_factor_authentication",
    "last_login_date",
    "created_date",
    "modified_date",
    "api_url",
    "url"
})
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("orgrole")
    private String orgrole;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("approval_authority")
    private Object approvalAuthority;
    @JsonProperty("two_factor_authentication")
    private Boolean twoFactorAuthentication;
    @JsonProperty("last_login_date")
    private Object lastLoginDate;
    @JsonProperty("created_date")
    private String createdDate;
    @JsonProperty("modified_date")
    private String modifiedDate;
    @JsonProperty("api_url")
    private String apiUrl;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("orgrole")
    public String getOrgrole() {
        return orgrole;
    }

    @JsonProperty("orgrole")
    public void setOrgrole(String orgrole) {
        this.orgrole = orgrole;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("approval_authority")
    public Object getApprovalAuthority() {
        return approvalAuthority;
    }

    @JsonProperty("approval_authority")
    public void setApprovalAuthority(Object approvalAuthority) {
        this.approvalAuthority = approvalAuthority;
    }

    @JsonProperty("two_factor_authentication")
    public Boolean getTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    @JsonProperty("two_factor_authentication")
    public void setTwoFactorAuthentication(Boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    @JsonProperty("last_login_date")
    public Object getLastLoginDate() {
        return lastLoginDate;
    }

    @JsonProperty("last_login_date")
    public void setLastLoginDate(Object lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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

    @JsonProperty("api_url")
    public String getApiUrl() {
        return apiUrl;
    }

    @JsonProperty("api_url")
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
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
