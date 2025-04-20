
package com.creativescenius.a2a.spec;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TaskNotCancelableError
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "message",
    "data"
})
public class TaskNotCancelableError {

    /**
     * Code
     * <p>
     * Error code
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Error code")
    private Integer code = -32002;
    /**
     * Message
     * <p>
     * A short description of the error
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("A short description of the error")
    private String message = "Task cannot be canceled";
    /**
     * Data
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    private Object data = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Code
     * <p>
     * Error code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Error code
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public TaskNotCancelableError withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Message
     * <p>
     * A short description of the error
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * A short description of the error
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public TaskNotCancelableError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Data
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public Object getData() {
        return data;
    }

    /**
     * Data
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    public TaskNotCancelableError withData(Object data) {
        this.data = data;
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

    public TaskNotCancelableError withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
