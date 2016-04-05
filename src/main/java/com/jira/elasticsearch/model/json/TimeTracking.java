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
        "originalEstimate",
        "remainingEstimate",
        "timeSpent",
        "originalEstimateSeconds",
        "remainingEstimateSeconds",
        "timeSpentSeconds"
})
public class TimeTracking {
    @JsonProperty("originalEstimate")
    private String originalEstimate;
    @JsonProperty("remainingEstimate")
    private String remainingEstimate;
    @JsonProperty("timeSpent")
    private String timeSpent;
    @JsonProperty("originalEstimateSeconds")
    private Integer originalEstimateSeconds;
    @JsonProperty("remainingEstimateSeconds")
    private Integer remainingEstimateSeconds;
    @JsonProperty("timeSpentSeconds")
    private Integer timeSpentSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The originalEstimate
     */
    @JsonProperty("originalEstimate")
    public String getOriginalEstimate() {
        return originalEstimate;
    }

    /**
     *
     * @param originalEstimate
     * The originalEstimate
     */
    @JsonProperty("originalEstimate")
    public void setOriginalEstimate(String originalEstimate) {
        this.originalEstimate = originalEstimate;
    }

    /**
     *
     * @return
     * The remainingEstimate
     */
    @JsonProperty("remainingEstimate")
    public String getRemainingEstimate() {
        return remainingEstimate;
    }

    /**
     *
     * @param remainingEstimate
     * The remainingEstimate
     */
    @JsonProperty("remainingEstimate")
    public void setRemainingEstimate(String remainingEstimate) {
        this.remainingEstimate = remainingEstimate;
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
     * The originalEstimateSeconds
     */
    @JsonProperty("originalEstimateSeconds")
    public Integer getOriginalEstimateSeconds() {
        return originalEstimateSeconds;
    }

    /**
     *
     * @param originalEstimateSeconds
     * The originalEstimateSeconds
     */
    @JsonProperty("originalEstimateSeconds")
    public void setOriginalEstimateSeconds(Integer originalEstimateSeconds) {
        this.originalEstimateSeconds = originalEstimateSeconds;
    }

    /**
     *
     * @return
     * The remainingEstimateSeconds
     */
    @JsonProperty("remainingEstimateSeconds")
    public Integer getRemainingEstimateSeconds() {
        return remainingEstimateSeconds;
    }

    /**
     *
     * @param remainingEstimateSeconds
     * The remainingEstimateSeconds
     */
    @JsonProperty("remainingEstimateSeconds")
    public void setRemainingEstimateSeconds(Integer remainingEstimateSeconds) {
        this.remainingEstimateSeconds = remainingEstimateSeconds;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
