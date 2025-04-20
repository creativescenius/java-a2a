
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
 * GetTaskRequest
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
public class GetTaskRequest {

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
    private String method = "tasks/get";
    /**
     * TaskQueryParams
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    private TaskQueryParams params;
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

    public GetTaskRequest withJsonrpc(String jsonrpc) {
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

    public GetTaskRequest withId(Object id) {
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

    public GetTaskRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * TaskQueryParams
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    public TaskQueryParams getParams() {
        return params;
    }

    /**
     * TaskQueryParams
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    public void setParams(TaskQueryParams params) {
        this.params = params;
    }

    public GetTaskRequest withParams(TaskQueryParams params) {
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

    public GetTaskRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
