
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
 * InternalError
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
public class InternalError {

    /**
     * Code
     * <p>
     * Error code
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Error code")
    private Integer code = -32603;
    /**
     * Message
     * <p>
     * A short description of the error
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("A short description of the error")
    private String message = "Internal error";
    /**
     * Data
     * <p>
     * 
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

    public InternalError withCode(Integer code) {
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

    public InternalError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Data
     * <p>
     * 
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
     * 
     */
    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    public InternalError withData(Object data) {
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

    public InternalError withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
