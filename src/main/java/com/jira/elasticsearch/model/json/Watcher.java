package com.jira.elasticsearch.model.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "isWatching",
        "watchCount",
        "watchers"
})
public class Watcher {
    @JsonProperty("self")
    private String self;
    @JsonProperty("isWatching")
    private Boolean isWatching;
    @JsonProperty("watchCount")
    private Integer watchCount;
    @JsonProperty("watchers")
    private List<Watcher> watchers = new ArrayList<Watcher>();
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
     * The isWatching
     */
    @JsonProperty("isWatching")
    public Boolean getIsWatching() {
        return isWatching;
    }

    /**
     *
     * @param isWatching
     * The isWatching
     */
    @JsonProperty("isWatching")
    public void setIsWatching(Boolean isWatching) {
        this.isWatching = isWatching;
    }

    /**
     *
     * @return
     * The watchCount
     */
    @JsonProperty("watchCount")
    public Integer getWatchCount() {
        return watchCount;
    }

    /**
     *
     * @param watchCount
     * The watchCount
     */
    @JsonProperty("watchCount")
    public void setWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
    }

    /**
     *
     * @return
     * The watchers
     */
    @JsonProperty("watchers")
    public List<Watcher> getWatchers() {
        return watchers;
    }

    /**
     *
     * @param watchers
     * The watchers
     */
    @JsonProperty("watchers")
    public void setWatchers(List<Watcher> watchers) {
        this.watchers = watchers;
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
