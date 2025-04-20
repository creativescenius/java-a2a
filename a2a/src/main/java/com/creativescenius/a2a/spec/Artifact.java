
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
 * Artifact
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "parts",
    "index",
    "append",
    "lastChunk",
    "metadata"
})
public class Artifact {

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private Object name = null;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    private Object description = null;
    /**
     * Parts
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("parts")
    private List<Object> parts = new ArrayList<Object>();
    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    private Integer index = 0;
    /**
     * Append
     * <p>
     * 
     * 
     */
    @JsonProperty("append")
    private Object append = null;
    /**
     * LastChunk
     * <p>
     * 
     * 
     */
    @JsonProperty("lastChunk")
    private Object lastChunk = null;
    /**
     * Metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("metadata")
    private Object metadata = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    public Artifact withName(Object name) {
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

    public Artifact withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * Parts
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("parts")
    public List<Object> getParts() {
        return parts;
    }

    /**
     * Parts
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("parts")
    public void setParts(List<Object> parts) {
        this.parts = parts;
    }

    public Artifact withParts(List<Object> parts) {
        this.parts = parts;
        return this;
    }

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Artifact withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Append
     * <p>
     * 
     * 
     */
    @JsonProperty("append")
    public Object getAppend() {
        return append;
    }

    /**
     * Append
     * <p>
     * 
     * 
     */
    @JsonProperty("append")
    public void setAppend(Object append) {
        this.append = append;
    }

    public Artifact withAppend(Object append) {
        this.append = append;
        return this;
    }

    /**
     * LastChunk
     * <p>
     * 
     * 
     */
    @JsonProperty("lastChunk")
    public Object getLastChunk() {
        return lastChunk;
    }

    /**
     * LastChunk
     * <p>
     * 
     * 
     */
    @JsonProperty("lastChunk")
    public void setLastChunk(Object lastChunk) {
        this.lastChunk = lastChunk;
    }

    public Artifact withLastChunk(Object lastChunk) {
        this.lastChunk = lastChunk;
        return this;
    }

    /**
     * Metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Artifact withMetadata(Object metadata) {
        this.metadata = metadata;
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

    public Artifact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
