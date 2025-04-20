
package com.creativescenius.a2a.spec;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AuthenticationInfo
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schemes",
    "credentials"
})
public class AuthenticationInfo {

    /**
     * Schemes
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("schemes")
    private List<String> schemes = new ArrayList<String>();
    /**
     * Credentials
     * <p>
     * 
     * 
     */
    @JsonProperty("credentials")
    private Object credentials = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Schemes
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("schemes")
    public List<String> getSchemes() {
        return schemes;
    }

    /**
     * Schemes
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("schemes")
    public void setSchemes(List<String> schemes) {
        this.schemes = schemes;
    }

    public AuthenticationInfo withSchemes(List<String> schemes) {
        this.schemes = schemes;
        return this;
    }

    /**
     * Credentials
     * <p>
     * 
     * 
     */
    @JsonProperty("credentials")
    public Object getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * 
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(Object credentials) {
        this.credentials = credentials;
    }

    public AuthenticationInfo withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AuthenticationInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
