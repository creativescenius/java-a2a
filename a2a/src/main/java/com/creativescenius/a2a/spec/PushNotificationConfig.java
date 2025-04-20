
package com.creativescenius.a2a.spec;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PushNotificationConfig
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "token",
    "authentication"
})
public class PushNotificationConfig {

    /**
     * Url
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    private String url;
    /**
     * Token
     * <p>
     * 
     * 
     */
    @JsonProperty("token")
    private Object token;
    @JsonProperty("authentication")
    private Object authentication = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Url
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Url
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public PushNotificationConfig withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Token
     * <p>
     * 
     * 
     */
    @JsonProperty("token")
    public Object getToken() {
        return token;
    }

    /**
     * Token
     * <p>
     * 
     * 
     */
    @JsonProperty("token")
    public void setToken(Object token) {
        this.token = token;
    }

    public PushNotificationConfig withToken(Object token) {
        this.token = token;
        return this;
    }

    @JsonProperty("authentication")
    public Object getAuthentication() {
        return authentication;
    }

    @JsonProperty("authentication")
    public void setAuthentication(Object authentication) {
        this.authentication = authentication;
    }

    public PushNotificationConfig withAuthentication(Object authentication) {
        this.authentication = authentication;
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

    public PushNotificationConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
