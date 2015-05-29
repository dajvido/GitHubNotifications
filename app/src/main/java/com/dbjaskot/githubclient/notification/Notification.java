package com.dbjaskot.githubclient.notification;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Notification {

    @Expose
    private String id;
    @Expose
    private boolean unread;
    @Expose
    private String reason;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("last_read_at")
    @Expose
    private String lastReadAt;
    @Expose
    private Subject subject;
    @Expose
    private Repository repository;
    @Expose
    private String url;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The unread
     */
    public boolean isUnread() {
        return unread;
    }

    /**
     *
     * @param unread
     *     The unread
     */
    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    /**
     *
     * @return
     *     The reason
     */
    public String getReason() {
        return reason;
    }

    /**
     *
     * @param reason
     *     The reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     *
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     *     The lastReadAt
     */
    public String getLastReadAt() {
        return lastReadAt;
    }

    /**
     *
     * @param lastReadAt
     *     The last_read_at
     */
    public void setLastReadAt(String lastReadAt) {
        this.lastReadAt = lastReadAt;
    }

    /**
     *
     * @return
     *     The subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     *
     * @param subject
     *     The subject
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     *
     * @return
     *     The repository
     */
    public Repository getRepository() {
        return repository;
    }

    /**
     *
     * @param repository
     *     The repository
     */
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     *
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     *     The subscriptionUrl
     */
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     *
     * @param subscriptionUrl
     *     The subscription_url
     */
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

}
