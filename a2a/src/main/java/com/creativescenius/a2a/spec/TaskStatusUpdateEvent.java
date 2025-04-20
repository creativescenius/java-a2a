
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
 * TaskStatusUpdateEvent
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "final",
    "metadata"
})
public class TaskStatusUpdateEvent {

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
     * TaskStatus
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private TaskStatus status;
    /**
     * Final
     * <p>
     * 
     * 
     */
    @JsonProperty("final")
    private Boolean _final = false;
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

    public TaskStatusUpdateEvent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * TaskStatus
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public TaskStatus getStatus() {
        return status;
    }

    /**
     * TaskStatus
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskStatusUpdateEvent withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Final
     * <p>
     * 
     * 
     */
    @JsonProperty("final")
    public Boolean getFinal() {
        return _final;
    }

    /**
     * Final
     * <p>
     * 
     * 
     */
    @JsonProperty("final")
    public void setFinal(Boolean _final) {
        this._final = _final;
    }

    public TaskStatusUpdateEvent withFinal(Boolean _final) {
        this._final = _final;
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

    public TaskStatusUpdateEvent withMetadata(Object metadata) {
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

    public TaskStatusUpdateEvent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
