package com.jira.elasticsearch.model.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "expand",
        "id",
        "self",
        "key",
        "fields",
        "names",
        "schema"
})
public class Issue {
    @JsonProperty("expand")
    private String expand;
    @JsonProperty("id")
    private String id;
    @JsonProperty("self")
    private String self;
    @JsonProperty("key")
    private String key;
    @JsonProperty("fields")
    private Fields fields;
    @JsonProperty("names")
    private Names names;
    @JsonProperty("schema")
    private Schema schema;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The expand
     */
    @JsonProperty("expand")
    public String getExpand() {
        return expand;
    }

    /**
     *
     * @param expand
     * The expand
     */
    @JsonProperty("expand")
    public void setExpand(String expand) {
        this.expand = expand;
    }

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The self
     */
    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    /**
     *
     * @param self
     * The self
     */
    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     *
     * @return
     * The key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     *
     * @param key
     * The key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     *
     * @return
     * The fields
     */
    @JsonProperty("fields")
    public Fields getFields() {
        return fields;
    }

    /**
     *
     * @param fields
     * The fields
     */
    @JsonProperty("fields")
    public void setFields(Fields fields) {
        this.fields = fields;
    }

    /**
     *
     * @return
     * The names
     */
    @JsonProperty("names")
    public Names getNames() {
        return names;
    }

    /**
     *
     * @param names
     * The names
     */
    @JsonProperty("names")
    public void setNames(Names names) {
        this.names = names;
    }

    /**
     *
     * @return
     * The schema
     */
    @JsonProperty("schema")
    public Schema getSchema() {
        return schema;
    }

    /**
     *
     * @param schema
     * The schema
     */
    @JsonProperty("schema")
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
