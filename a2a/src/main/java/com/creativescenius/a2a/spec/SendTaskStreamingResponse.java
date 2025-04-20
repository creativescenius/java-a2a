
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
 * SendTaskStreamingResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jsonrpc",
    "id",
    "result",
    "error"
})
public class SendTaskStreamingResponse {

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
    @JsonProperty("result")
    private Object result = null;
    @JsonProperty("error")
    private Object error = null;
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

    public SendTaskStreamingResponse withJsonrpc(String jsonrpc) {
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

    public SendTaskStreamingResponse withId(Object id) {
        this.id = id;
        return this;
    }

    @JsonProperty("result")
    public Object getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Object result) {
        this.result = result;
    }

    public SendTaskStreamingResponse withResult(Object result) {
        this.result = result;
        return this;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    public SendTaskStreamingResponse withError(Object error) {
        this.error = error;
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

    public SendTaskStreamingResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
