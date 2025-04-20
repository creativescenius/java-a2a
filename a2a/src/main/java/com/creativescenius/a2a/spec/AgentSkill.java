
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
 * AgentSkill
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "description",
    "tags",
    "examples",
    "inputModes",
    "outputModes"
})
public class AgentSkill {

    /**
     * Id
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
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
     * Tags
     * <p>
     * 
     * 
     */
    @JsonProperty("tags")
    private Object tags = null;
    /**
     * Examples
     * <p>
     * 
     * 
     */
    @JsonProperty("examples")
    private Object examples = null;
    /**
     * Inputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("inputModes")
    private Object inputModes = null;
    /**
     * Outputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("outputModes")
    private Object outputModes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Id
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AgentSkill withId(String id) {
        this.id = id;
        return this;
    }

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

    public AgentSkill withName(String name) {
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

    public AgentSkill withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * Tags
     * <p>
     * 
     * 
     */
    @JsonProperty("tags")
    public Object getTags() {
        return tags;
    }

    /**
     * Tags
     * <p>
     * 
     * 
     */
    @JsonProperty("tags")
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public AgentSkill withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Examples
     * <p>
     * 
     * 
     */
    @JsonProperty("examples")
    public Object getExamples() {
        return examples;
    }

    /**
     * Examples
     * <p>
     * 
     * 
     */
    @JsonProperty("examples")
    public void setExamples(Object examples) {
        this.examples = examples;
    }

    public AgentSkill withExamples(Object examples) {
        this.examples = examples;
        return this;
    }

    /**
     * Inputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("inputModes")
    public Object getInputModes() {
        return inputModes;
    }

    /**
     * Inputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("inputModes")
    public void setInputModes(Object inputModes) {
        this.inputModes = inputModes;
    }

    public AgentSkill withInputModes(Object inputModes) {
        this.inputModes = inputModes;
        return this;
    }

    /**
     * Outputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("outputModes")
    public Object getOutputModes() {
        return outputModes;
    }

    /**
     * Outputmodes
     * <p>
     * 
     * 
     */
    @JsonProperty("outputModes")
    public void setOutputModes(Object outputModes) {
        this.outputModes = outputModes;
    }

    public AgentSkill withOutputModes(Object outputModes) {
        this.outputModes = outputModes;
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

    public AgentSkill withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
