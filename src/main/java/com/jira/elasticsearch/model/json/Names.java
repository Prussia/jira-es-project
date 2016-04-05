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
        "watcher",
        "attachment",
        "sub-tasks",
        "description",
        "project",
        "comment",
        "issuelinks",
        "worklog",
        "updated",
        "timetracking"
})
public class Names {
    @JsonProperty("watcher")
    private String watcher;
    @JsonProperty("attachment")
    private String attachment;
    @JsonProperty("sub-tasks")
    private String subTasks;
    @JsonProperty("description")
    private String description;
    @JsonProperty("project")
    private String project;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("issuelinks")
    private String issuelinks;
    @JsonProperty("worklog")
    private String worklog;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("timetracking")
    private String timetracking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The watcher
     */
    @JsonProperty("watcher")
    public String getWatcher() {
        return watcher;
    }

    /**
     *
     * @param watcher
     * The watcher
     */
    @JsonProperty("watcher")
    public void setWatcher(String watcher) {
        this.watcher = watcher;
    }

    /**
     *
     * @return
     * The attachment
     */
    @JsonProperty("attachment")
    public String getAttachment() {
        return attachment;
    }

    /**
     *
     * @param attachment
     * The attachment
     */
    @JsonProperty("attachment")
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     *
     * @return
     * The subTasks
     */
    @JsonProperty("sub-tasks")
    public String getSubTasks() {
        return subTasks;
    }

    /**
     *
     * @param subTasks
     * The sub-tasks
     */
    @JsonProperty("sub-tasks")
    public void setSubTasks(String subTasks) {
        this.subTasks = subTasks;
    }

    /**
     *
     * @return
     * The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The project
     */
    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    /**
     *
     * @param project
     * The project
     */
    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
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
     * The issuelinks
     */
    @JsonProperty("issuelinks")
    public String getIssuelinks() {
        return issuelinks;
    }

    /**
     *
     * @param issuelinks
     * The issuelinks
     */
    @JsonProperty("issuelinks")
    public void setIssuelinks(String issuelinks) {
        this.issuelinks = issuelinks;
    }

    /**
     *
     * @return
     * The worklog
     */
    @JsonProperty("worklog")
    public String getWorklog() {
        return worklog;
    }

    /**
     *
     * @param worklog
     * The worklog
     */
    @JsonProperty("worklog")
    public void setWorklog(String worklog) {
        this.worklog = worklog;
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
     * The timetracking
     */
    @JsonProperty("timetracking")
    public String getTimetracking() {
        return timetracking;
    }

    /**
     *
     * @param timetracking
     * The timetracking
     */
    @JsonProperty("timetracking")
    public void setTimetracking(String timetracking) {
        this.timetracking = timetracking;
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
