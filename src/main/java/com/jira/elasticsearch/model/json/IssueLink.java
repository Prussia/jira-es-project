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
        "id",
        "type",
        "outwardIssue",
        "inwardIssue"
})
public class IssueLink {
    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("outwardIssue")
    private OutwardIssue outwardIssue;
    @JsonProperty("inwardIssue")
    private InwardIssue inwardIssue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The type
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The outwardIssue
     */
    @JsonProperty("outwardIssue")
    public OutwardIssue getOutwardIssue() {
        return outwardIssue;
    }

    /**
     *
     * @param outwardIssue
     * The outwardIssue
     */
    @JsonProperty("outwardIssue")
    public void setOutwardIssue(OutwardIssue outwardIssue) {
        this.outwardIssue = outwardIssue;
    }

    /**
     *
     * @return
     * The inwardIssue
     */
    @JsonProperty("inwardIssue")
    public InwardIssue getInwardIssue() {
        return inwardIssue;
    }

    /**
     *
     * @param inwardIssue
     * The inwardIssue
     */
    @JsonProperty("inwardIssue")
    public void setInwardIssue(InwardIssue inwardIssue) {
        this.inwardIssue = inwardIssue;
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
