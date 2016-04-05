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
        "filename",
        "author",
        "created",
        "size",
        "mimeType",
        "content",
        "thumbnail"
})
public class Attachment {

    @JsonProperty("self")
    private String self;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("created")
    private String created;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("content")
    private String content;
    @JsonProperty("thumbnail")
    private String thumbnail;
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
     * The filename
     */
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    /**
     *
     * @param filename
     * The filename
     */
    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
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
     * The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The mimeType
     */
    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    /**
     *
     * @param mimeType
     * The mimeType
     */
    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     *
     * @return
     * The content
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content
     * The content
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @return
     * The thumbnail
     */
    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     * The thumbnail
     */
    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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
