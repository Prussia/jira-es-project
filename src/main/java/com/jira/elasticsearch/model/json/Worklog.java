package com.jira.elasticsearch.model.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "self",
        "author",
        "updateAuthor",
        "comment",
        "updated",
        "visibility",
        "started",
        "timeSpent",
        "timeSpentSeconds",
        "id",
        "issueId"
})
public class Worklog {
    @JsonProperty("self")
    private String self;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("updateAuthor")
    private UpdateAuthor updateAuthor;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("visibility")
    private Visibility visibility;
    @JsonProperty("started")
    private String started;
    @JsonProperty("timeSpent")
    private String timeSpent;
    @JsonProperty("timeSpentSeconds")
    private Integer timeSpentSeconds;
    @JsonProperty("id")
    private String id;
    @JsonProperty("issueId")
    private String issueId;
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
     * The comment
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
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

    /**
     *
     * @return
     * The started
     */
    @JsonProperty("started")
    public String getStarted() {
        return started;
    }

    /**
     *
     * @param started
     * The started
     */
    @JsonProperty("started")
    public void setStarted(String started) {
        this.started = started;
    }

    /**
     *
     * @return
     * The timeSpent
     */
    @JsonProperty("timeSpent")
    public String getTimeSpent() {
        return timeSpent;
    }

    /**
     *
     * @param timeSpent
     * The timeSpent
     */
    @JsonProperty("timeSpent")
    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    /**
     *
     * @return
     * The timeSpentSeconds
     */
    @JsonProperty("timeSpentSeconds")
    public Integer getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    /**
     *
     * @param timeSpentSeconds
     * The timeSpentSeconds
     */
    @JsonProperty("timeSpentSeconds")
    public void setTimeSpentSeconds(Integer timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
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
     * The issueId
     */
    @JsonProperty("issueId")
    public String getIssueId() {
        return issueId;
    }

    /**
     *
     * @param issueId
     * The issueId
     */
    @JsonProperty("issueId")
    public void setIssueId(String issueId) {
        this.issueId = issueId;
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
