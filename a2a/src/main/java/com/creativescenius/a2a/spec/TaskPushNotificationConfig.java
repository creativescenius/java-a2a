
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
 * TaskPushNotificationConfig
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "pushNotificationConfig"
})
public class TaskPushNotificationConfig {

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
     * PushNotificationConfig
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushNotificationConfig")
    private PushNotificationConfig pushNotificationConfig;
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

    public TaskPushNotificationConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * PushNotificationConfig
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushNotificationConfig")
    public PushNotificationConfig getPushNotificationConfig() {
        return pushNotificationConfig;
    }

    /**
     * PushNotificationConfig
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushNotificationConfig")
    public void setPushNotificationConfig(PushNotificationConfig pushNotificationConfig) {
        this.pushNotificationConfig = pushNotificationConfig;
    }

    public TaskPushNotificationConfig withPushNotificationConfig(PushNotificationConfig pushNotificationConfig) {
        this.pushNotificationConfig = pushNotificationConfig;
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

    public TaskPushNotificationConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
