
package com.creativescenius.a2a.spec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Message
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "role",
    "parts",
    "metadata"
})
public class Message {

    /**
     * Role
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("role")
    private Role role;
    /**
     * Parts
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("parts")
    private List<Object> parts = new ArrayList<Object>();
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
     * Role
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("role")
    public Role getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("role")
    public void setRole(Role role) {
        this.role = role;
    }

    public Message withRole(Role role) {
        this.role = role;
        return this;
    }

    /**
     * Parts
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("parts")
    public List<Object> getParts() {
        return parts;
    }

    /**
     * Parts
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("parts")
    public void setParts(List<Object> parts) {
        this.parts = parts;
    }

    public Message withParts(List<Object> parts) {
        this.parts = parts;
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

    public Message withMetadata(Object metadata) {
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

    public Message withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


    /**
     * Role
     * <p>
     * 
     * 
     */
    public enum Role {

        USER("user"),
        AGENT("agent");
        private final String value;
        private final static Map<String, Role> CONSTANTS = new HashMap<String, Role>();

        static {
            for (Role c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Role(String value) {
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
        public static Role fromValue(String value) {
            Role constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
