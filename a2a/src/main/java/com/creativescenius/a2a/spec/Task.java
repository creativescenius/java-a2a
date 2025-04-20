
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
 * Task
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sessionId",
    "status",
    "artifacts",
    "metadata"
})
public class Task {

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
     * Sessionid
     * <p>
     * 
     * 
     */
    @JsonProperty("sessionId")
    private Object sessionId = null;
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
     * Artifacts
     * <p>
     * 
     * 
     */
    @JsonProperty("artifacts")
    private Object artifacts = null;
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

    public Task withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Sessionid
     * <p>
     * 
     * 
     */
    @JsonProperty("sessionId")
    public Object getSessionId() {
        return sessionId;
    }

    /**
     * Sessionid
     * <p>
     * 
     * 
     */
    @JsonProperty("sessionId")
    public void setSessionId(Object sessionId) {
        this.sessionId = sessionId;
    }

    public Task withSessionId(Object sessionId) {
        this.sessionId = sessionId;
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

    public Task withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Artifacts
     * <p>
     * 
     * 
     */
    @JsonProperty("artifacts")
    public Object getArtifacts() {
        return artifacts;
    }

    /**
     * Artifacts
     * <p>
     * 
     * 
     */
    @JsonProperty("artifacts")
    public void setArtifacts(Object artifacts) {
        this.artifacts = artifacts;
    }

    public Task withArtifacts(Object artifacts) {
        this.artifacts = artifacts;
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

    public Task withMetadata(Object metadata) {
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

    public Task withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
