package com.jira.elasticsearch.model.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class Fields {
    @JsonProperty("watcher")
    private Watcher watcher;
    @JsonProperty("attachment")
    private List<Attachment> attachment = new ArrayList<Attachment>();
    @JsonProperty("sub-tasks")
    private List<SubTask> subTasks = new ArrayList<SubTask>();
    @JsonProperty("description")
    private String description;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("comment")
    private List<Comment> comment = new ArrayList<Comment>();
    @JsonProperty("issuelinks")
    private List<IssueLink> issuelinks = new ArrayList<IssueLink>();
    @JsonProperty("worklog")
    private List<Worklog> worklog = new ArrayList<Worklog>();
    @JsonProperty("updated")
    private Integer updated;
    @JsonProperty("timetracking")
    private TimeTracking timetracking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The watcher
     */
    @JsonProperty("watcher")
    public Watcher getWatcher() {
        return watcher;
    }

    /**
     *
     * @param watcher
     * The watcher
     */
    @JsonProperty("watcher")
    public void setWatcher(Watcher watcher) {
        this.watcher = watcher;
    }

    /**
     *
     * @return
     * The attachment
     */
    @JsonProperty("attachment")
    public List<Attachment> getAttachment() {
        return attachment;
    }

    /**
     *
     * @param attachment
     * The attachment
     */
    @JsonProperty("attachment")
    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    /**
     *
     * @return
     * The subTasks
     */
    @JsonProperty("sub-tasks")
    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    /**
     *
     * @param subTasks
     * The sub-tasks
     */
    @JsonProperty("sub-tasks")
    public void setSubTasks(List<SubTask> subTasks) {
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
    public Project getProject() {
        return project;
    }

    /**
     *
     * @param project
     * The project
     */
    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     *
     * @return
     * The comment
     */
    @JsonProperty("comment")
    public List<Comment> getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    @JsonProperty("comment")
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     * The issuelinks
     */
    @JsonProperty("issuelinks")
    public List<IssueLink> getIssuelinks() {
        return issuelinks;
    }

    /**
     *
     * @param issuelinks
     * The issuelinks
     */
    @JsonProperty("issuelinks")
    public void setIssuelinks(List<IssueLink> issuelinks) {
        this.issuelinks = issuelinks;
    }

    /**
     *
     * @return
     * The worklog
     */
    @JsonProperty("worklog")
    public List<Worklog> getWorklog() {
        return worklog;
    }

    /**
     *
     * @param worklog
     * The worklog
     */
    @JsonProperty("worklog")
    public void setWorklog(List<Worklog> worklog) {
        this.worklog = worklog;
    }

    /**
     *
     * @return
     * The updated
     */
    @JsonProperty("updated")
    public Integer getUpdated() {
        return updated;
    }

    /**
     *
     * @param updated
     * The updated
     */
    @JsonProperty("updated")
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    /**
     *
     * @return
     * The timetracking
     */
    @JsonProperty("timetracking")
    public TimeTracking getTimetracking() {
        return timetracking;
    }

    /**
     *
     * @param timetracking
     * The timetracking
     */
    @JsonProperty("timetracking")
    public void setTimetracking(TimeTracking timetracking) {
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
