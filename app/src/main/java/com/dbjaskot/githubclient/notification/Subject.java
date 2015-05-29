package com.dbjaskot.githubclient.notification;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Subject {

    @Expose
    private String title;
    @Expose
    private String url;
    @SerializedName("latest_comment_url")
    @Expose
    private String latestCommentUrl;
    @Expose
    private String type;

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The latestCommentUrl
     */
    public String getLatestCommentUrl() {
        return latestCommentUrl;
    }

    /**
     * @param latestCommentUrl The latest_comment_url
     */
    public void setLatestCommentUrl(String latestCommentUrl) {
        this.latestCommentUrl = latestCommentUrl;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
