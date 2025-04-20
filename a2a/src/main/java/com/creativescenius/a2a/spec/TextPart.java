
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
 * TextPart
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "text",
    "metadata"
})
public class TextPart {

    /**
     * Type
     * <p>
     * Type of the part
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the part")
    private String type = "text";
    /**
     * Text
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("text")
    private String text;
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

    public TextPart withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Text
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public TextPart withText(String text) {
        this.text = text;
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

    public TextPart withMetadata(Object metadata) {
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

    public TextPart withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
