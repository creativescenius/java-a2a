
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
 * SendTaskRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jsonrpc",
    "id",
    "method",
    "params"
})
public class SendTaskRequest {

    /**
     * Jsonrpc
     * <p>
     * 
     * 
     */
    @JsonProperty("jsonrpc")
    private String jsonrpc = "2.0";
    /**
     * Id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private Object id;
    /**
     * Method
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("method")
    private String method = "tasks/send";
    /**
     * TaskSendParams
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    private TaskSendParams params;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Jsonrpc
     * <p>
     * 
     * 
     */
    @JsonProperty("jsonrpc")
    public String getJsonrpc() {
        return jsonrpc;
    }

    /**
     * Jsonrpc
     * <p>
     * 
     * 
     */
    @JsonProperty("jsonrpc")
    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public SendTaskRequest withJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }

    /**
     * Id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public SendTaskRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Method
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    /**
     * Method
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    public SendTaskRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * TaskSendParams
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    public TaskSendParams getParams() {
        return params;
    }

    /**
     * TaskSendParams
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    public void setParams(TaskSendParams params) {
        this.params = params;
    }

    public SendTaskRequest withParams(TaskSendParams params) {
        this.params = params;
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

    public SendTaskRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
