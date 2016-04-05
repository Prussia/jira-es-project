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
        "self",
        "id",
        "author",
        "body",
        "updateAuthor",
        "created",
        "updated",
        "visibility"
})
public class Comment {
    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private String id;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("body")
    private String body;
    @JsonProperty("updateAuthor")
    private UpdateAuthor updateAuthor;
    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("visibility")
    private Visibility visibility;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The author
     */
    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     *
     * @param body
     * The body
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     *
     * @return
     * The updateAuthor
     */
    @JsonProperty("updateAuthor")
    public UpdateAuthor getUpdateAuthor() {
        return updateAuthor;
    }

    /**
     *
     * @param updateAuthor
     * The updateAuthor
     */
    @JsonProperty("updateAuthor")
    public void setUpdateAuthor(UpdateAuthor updateAuthor) {
        this.updateAuthor = updateAuthor;
    }

    /**
     *
     * @return
     * The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The updated
     */
    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    /**
     *
     * @param updated
     * The updated
     */
    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     *
     * @return
     * The visibility
     */
    @JsonProperty("visibility")
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     *
     * @param visibility
     * The visibility
     */
    @JsonProperty("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
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
