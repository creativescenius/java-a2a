
package com.creativescenius.a2a.spec;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TaskStatus
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "state",
    "message",
    "timestamp"
})
public class TaskStatus {

    /**
     * TaskState
     * <p>
     * An enumeration.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("An enumeration.")
    private TaskState state;
    @JsonProperty("message")
    private Object message = null;
    /**
     * Timestamp
     * <p>
     * 
     * 
     */
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * TaskState
     * <p>
     * An enumeration.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public TaskState getState() {
        return state;
    }

    /**
     * TaskState
     * <p>
     * An enumeration.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(TaskState state) {
        this.state = state;
    }

    public TaskStatus withState(TaskState state) {
        this.state = state;
        return this;
    }

    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    public TaskStatus withMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * Timestamp
     * <p>
     * 
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp
     * <p>
     * 
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public TaskStatus withTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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

    public TaskStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


    /**
     * TaskState
     * <p>
     * An enumeration.
     * 
     */
    public enum TaskState {

        SUBMITTED("submitted"),
        WORKING("working"),
        INPUT_REQUIRED("input-required"),
        COMPLETED("completed"),
        CANCELED("canceled"),
        FAILED("failed"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, TaskState> CONSTANTS = new HashMap<String, TaskState>();

        static {
            for (TaskState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TaskState(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static TaskState fromValue(String value) {
            TaskState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
