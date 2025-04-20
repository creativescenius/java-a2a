
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
 * TaskSendParams
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sessionId",
    "message",
    "pushNotification",
    "historyLength",
    "metadata"
})
public class TaskSendParams {

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
    private String sessionId;
    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    private Message message;
    @JsonProperty("pushNotification")
    private Object pushNotification = null;
    /**
     * HistoryLength
     * <p>
     * 
     * 
     */
    @JsonProperty("historyLength")
    private Object historyLength = null;
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

    public TaskSendParams withId(String id) {
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
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sessionid
     * <p>
     * 
     * 
     */
    @JsonProperty("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public TaskSendParams withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    public TaskSendParams withMessage(Message message) {
        this.message = message;
        return this;
    }

    @JsonProperty("pushNotification")
    public Object getPushNotification() {
        return pushNotification;
    }

    @JsonProperty("pushNotification")
    public void setPushNotification(Object pushNotification) {
        this.pushNotification = pushNotification;
    }

    public TaskSendParams withPushNotification(Object pushNotification) {
        this.pushNotification = pushNotification;
        return this;
    }

    /**
     * HistoryLength
     * <p>
     * 
     * 
     */
    @JsonProperty("historyLength")
    public Object getHistoryLength() {
        return historyLength;
    }

    /**
     * HistoryLength
     * <p>
     * 
     * 
     */
    @JsonProperty("historyLength")
    public void setHistoryLength(Object historyLength) {
        this.historyLength = historyLength;
    }

    public TaskSendParams withHistoryLength(Object historyLength) {
        this.historyLength = historyLength;
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

    public TaskSendParams withMetadata(Object metadata) {
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

    public TaskSendParams withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
