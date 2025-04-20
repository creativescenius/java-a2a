
package com.creativescenius.a2a.spec;

import java.util.ArrayList;
import java.util.Arrays;
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
 * AgentCard
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "url",
    "provider",
    "version",
    "documentationUrl",
    "capabilities",
    "authentication",
    "defaultInputModes",
    "defaultOutputModes",
    "skills"
})
public class AgentCard {

    /**
     * Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    private Object description = null;
    /**
     * Url
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    private String url;
    @JsonProperty("provider")
    private Object provider = null;
    /**
     * Version
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    private String version;
    /**
     * Documentationurl
     * <p>
     * 
     * 
     */
    @JsonProperty("documentationUrl")
    private Object documentationUrl = null;
    /**
     * AgentCapabilities
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilities")
    private AgentCapabilities capabilities;
    @JsonProperty("authentication")
    private Object authentication = null;
    /**
     * Defaultinputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("defaultInputModes")
    private List<String> defaultInputModes = new ArrayList<String>(Arrays.asList("text"));
    /**
     * Defaultoutputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("defaultOutputModes")
    private List<String> defaultOutputModes = new ArrayList<String>(Arrays.asList("text"));
    /**
     * Skills
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("skills")
    private List<AgentSkill> skills = new ArrayList<AgentSkill>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public AgentCard withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    public AgentCard withDescription(Object description) {
        this.description = description;
        return this;
    }

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

    public AgentCard withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("provider")
    public Object getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(Object provider) {
        this.provider = provider;
    }

    public AgentCard withProvider(Object provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Version
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Version
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public AgentCard withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Documentationurl
     * <p>
     * 
     * 
     */
    @JsonProperty("documentationUrl")
    public Object getDocumentationUrl() {
        return documentationUrl;
    }

    /**
     * Documentationurl
     * <p>
     * 
     * 
     */
    @JsonProperty("documentationUrl")
    public void setDocumentationUrl(Object documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public AgentCard withDocumentationUrl(Object documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }

    /**
     * AgentCapabilities
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilities")
    public AgentCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * AgentCapabilities
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilities")
    public void setCapabilities(AgentCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public AgentCard withCapabilities(AgentCapabilities capabilities) {
        this.capabilities = capabilities;
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

    public AgentCard withAuthentication(Object authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Defaultinputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("defaultInputModes")
    public List<String> getDefaultInputModes() {
        return defaultInputModes;
    }

    /**
     * Defaultinputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("defaultInputModes")
    public void setDefaultInputModes(List<String> defaultInputModes) {
        this.defaultInputModes = defaultInputModes;
    }

    public AgentCard withDefaultInputModes(List<String> defaultInputModes) {
        this.defaultInputModes = defaultInputModes;
        return this;
    }

    /**
     * Defaultoutputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("defaultOutputModes")
    public List<String> getDefaultOutputModes() {
        return defaultOutputModes;
    }

    /**
     * Defaultoutputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("defaultOutputModes")
    public void setDefaultOutputModes(List<String> defaultOutputModes) {
        this.defaultOutputModes = defaultOutputModes;
    }

    public AgentCard withDefaultOutputModes(List<String> defaultOutputModes) {
        this.defaultOutputModes = defaultOutputModes;
        return this;
    }

    /**
     * Skills
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("skills")
    public List<AgentSkill> getSkills() {
        return skills;
    }

    /**
     * Skills
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("skills")
    public void setSkills(List<AgentSkill> skills) {
        this.skills = skills;
    }

    public AgentCard withSkills(List<AgentSkill> skills) {
        this.skills = skills;
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

    public AgentCard withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
