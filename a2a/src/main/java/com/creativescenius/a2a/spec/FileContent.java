
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
 * FileContent
 * <p>
 * Represents the content of a file, either as base64 encoded bytes or a URI.
 * 
 * Ensures that either 'bytes' or 'uri' is provided, but not both.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "mimeType",
    "bytes",
    "uri"
})
public class FileContent {

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private Object name = null;
    /**
     * Mimetype
     * <p>
     * 
     * 
     */
    @JsonProperty("mimeType")
    private Object mimeType = null;
    /**
     * Bytes
     * <p>
     * 
     * 
     */
    @JsonProperty("bytes")
    private Object bytes = null;
    /**
     * Uri
     * <p>
     * 
     * 
     */
    @JsonProperty("uri")
    private Object uri = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    public FileContent withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * Mimetype
     * <p>
     * 
     * 
     */
    @JsonProperty("mimeType")
    public Object getMimeType() {
        return mimeType;
    }

    /**
     * Mimetype
     * <p>
     * 
     * 
     */
    @JsonProperty("mimeType")
    public void setMimeType(Object mimeType) {
        this.mimeType = mimeType;
    }

    public FileContent withMimeType(Object mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * Bytes
     * <p>
     * 
     * 
     */
    @JsonProperty("bytes")
    public Object getBytes() {
        return bytes;
    }

    /**
     * Bytes
     * <p>
     * 
     * 
     */
    @JsonProperty("bytes")
    public void setBytes(Object bytes) {
        this.bytes = bytes;
    }

    public FileContent withBytes(Object bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * Uri
     * <p>
     * 
     * 
     */
    @JsonProperty("uri")
    public Object getUri() {
        return uri;
    }

    /**
     * Uri
     * <p>
     * 
     * 
     */
    @JsonProperty("uri")
    public void setUri(Object uri) {
        this.uri = uri;
    }

    public FileContent withUri(Object uri) {
        this.uri = uri;
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

    public FileContent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
