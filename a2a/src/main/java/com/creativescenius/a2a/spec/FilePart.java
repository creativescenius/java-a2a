
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
 * FilePart
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "file",
    "metadata"
})
public class FilePart {

    /**
     * Type
     * <p>
     * Type of the part
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the part")
    private String type = "file";
    /**
     * FileContent
     * <p>
     * Represents the content of a file, either as base64 encoded bytes or a URI.
     * 
     * Ensures that either 'bytes' or 'uri' is provided, but not both.
     * (Required)
     * 
     */
    @JsonProperty("file")
    @JsonPropertyDescription("Represents the content of a file, either as base64 encoded bytes or a URI.\n\nEnsures that either 'bytes' or 'uri' is provided, but not both.")
    private FileContent file;
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
     * Type
     * <p>
     * Type of the part
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of the part
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public FilePart withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * FileContent
     * <p>
     * Represents the content of a file, either as base64 encoded bytes or a URI.
     * 
     * Ensures that either 'bytes' or 'uri' is provided, but not both.
     * (Required)
     * 
     */
    @JsonProperty("file")
    public FileContent getFile() {
        return file;
    }

    /**
     * FileContent
     * <p>
     * Represents the content of a file, either as base64 encoded bytes or a URI.
     * 
     * Ensures that either 'bytes' or 'uri' is provided, but not both.
     * (Required)
     * 
     */
    @JsonProperty("file")
    public void setFile(FileContent file) {
        this.file = file;
    }

    public FilePart withFile(FileContent file) {
        this.file = file;
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

    public FilePart withMetadata(Object metadata) {
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

    public FilePart withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
