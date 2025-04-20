
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
 * AgentCapabilities
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "streaming",
    "pushNotifications",
    "stateTransitionHistory"
})
public class AgentCapabilities {

    /**
     * Streaming
     * <p>
     * 
     * 
     */
    @JsonProperty("streaming")
    private Boolean streaming = false;
    /**
     * PushNotifications
     * <p>
     * 
     * 
     */
    @JsonProperty("pushNotifications")
    private Boolean pushNotifications = false;
    /**
     * Statetransitionhistory
     * <p>
     * 
     * 
     */
    @JsonProperty("stateTransitionHistory")
    private Boolean stateTransitionHistory = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Streaming
     * <p>
     * 
     * 
     */
    @JsonProperty("streaming")
    public Boolean getStreaming() {
        return streaming;
    }

    /**
     * Streaming
     * <p>
     * 
     * 
     */
    @JsonProperty("streaming")
    public void setStreaming(Boolean streaming) {
        this.streaming = streaming;
    }

    public AgentCapabilities withStreaming(Boolean streaming) {
        this.streaming = streaming;
        return this;
    }

    /**
     * PushNotifications
     * <p>
     * 
     * 
     */
    @JsonProperty("pushNotifications")
    public Boolean getPushNotifications() {
        return pushNotifications;
    }

    /**
     * PushNotifications
     * <p>
     * 
     * 
     */
    @JsonProperty("pushNotifications")
    public void setPushNotifications(Boolean pushNotifications) {
        this.pushNotifications = pushNotifications;
    }

    public AgentCapabilities withPushNotifications(Boolean pushNotifications) {
        this.pushNotifications = pushNotifications;
        return this;
    }

    /**
     * Statetransitionhistory
     * <p>
     * 
     * 
     */
    @JsonProperty("stateTransitionHistory")
    public Boolean getStateTransitionHistory() {
        return stateTransitionHistory;
    }

    /**
     * Statetransitionhistory
     * <p>
     * 
     * 
     */
    @JsonProperty("stateTransitionHistory")
    public void setStateTransitionHistory(Boolean stateTransitionHistory) {
        this.stateTransitionHistory = stateTransitionHistory;
    }

    public AgentCapabilities withStateTransitionHistory(Boolean stateTransitionHistory) {
        this.stateTransitionHistory = stateTransitionHistory;
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

    public AgentCapabilities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
