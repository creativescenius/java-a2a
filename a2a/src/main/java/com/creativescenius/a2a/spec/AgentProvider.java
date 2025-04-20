
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
 * AgentProvider
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "organization",
    "url"
})
public class AgentProvider {

    /**
     * Organization
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("organization")
    private String organization;
    /**
     * Url
     * <p>
     * 
     * 
     */
    @JsonProperty("url")
    private Object url = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Organization
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    /**
     * Organization
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public AgentProvider withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Url
     * <p>
     * 
     * 
     */
    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    /**
     * Url
     * <p>
     * 
     * 
     */
    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    public AgentProvider withUrl(Object url) {
        this.url = url;
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

    public AgentProvider withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
