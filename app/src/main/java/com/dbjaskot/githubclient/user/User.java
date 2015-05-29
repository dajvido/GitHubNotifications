package com.dbjaskot.githubclient.user;

/**
 * Created by dajvido on 15.05.15.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class User {

    @Expose
    private String login;
    @Expose
    private int id;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String receivedEventsUrl;
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private boolean siteAdmin;
    @Expose
    private String name;
    @Expose
    private Object company;
    @Expose
    private Object blog;
    @Expose
    private String location;
    @Expose
    private String email;
    @Expose
    private boolean hireable;
    @Expose
    private Object bio;
    @SerializedName("public_repos")
    @Expose
    private int publicRepos;
    @SerializedName("public_gists")
    @Expose
    private int publicGists;
    @Expose
    private int followers;
    @Expose
    private int following;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("private_gists")
    @Expose
    private int privateGists;
    @SerializedName("total_private_repos")
    @Expose
    private int totalPrivateRepos;
    @SerializedName("owned_private_repos")
    @Expose
    private int ownedPrivateRepos;
    @SerializedName("disk_usage")
    @Expose
    private int diskUsage;
    @Expose
    private int collaborators;
    @Expose
    private Plan plan;

    /**
     *
     * @return
     *     The login
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     *     The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     *     The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     *     The gravatarId
     */
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     *
     * @param gravatarId
     *     The gravatar_id
     */
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
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
     *     The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     *
     * @param htmlUrl
     *     The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     *
     * @return
     *     The followersUrl
     */
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     *
     * @param followersUrl
     *     The followers_url
     */
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     *
     * @return
     *     The followingUrl
     */
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     *
     * @param followingUrl
     *     The following_url
     */
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     *
     * @return
     *     The gistsUrl
     */
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     *
     * @param gistsUrl
     *     The gists_url
     */
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     *
     * @return
     *     The starredUrl
     */
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     *
     * @param starredUrl
     *     The starred_url
     */
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     *
     * @return
     *     The subscriptionsUrl
     */
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     *
     * @param subscriptionsUrl
     *     The subscriptions_url
     */
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
     *
     * @return
     *     The organizationsUrl
     */
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     *
     * @param organizationsUrl
     *     The organizations_url
     */
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     *
     * @return
     *     The reposUrl
     */
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     *
     * @param reposUrl
     *     The repos_url
     */
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
     *
     * @return
     *     The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     *     The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     *
     * @return
     *     The receivedEventsUrl
     */
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     *
     * @param receivedEventsUrl
     *     The received_events_url
     */
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     *     The siteAdmin
     */
    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    /**
     *
     * @param siteAdmin
     *     The site_admin
     */
    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The company
     */
    public Object getCompany() {
        return company;
    }

    /**
     *
     * @param company
     *     The company
     */
    public void setCompany(Object company) {
        this.company = company;
    }

    /**
     *
     * @return
     *     The blog
     */
    public Object getBlog() {
        return blog;
    }

    /**
     *
     * @param blog
     *     The blog
     */
    public void setBlog(Object blog) {
        this.blog = blog;
    }

    /**
     *
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     *     The hireable
     */
    public boolean isHireable() {
        return hireable;
    }

    /**
     *
     * @param hireable
     *     The hireable
     */
    public void setHireable(boolean hireable) {
        this.hireable = hireable;
    }

    /**
     *
     * @return
     *     The bio
     */
    public Object getBio() {
        return bio;
    }

    /**
     *
     * @param bio
     *     The bio
     */
    public void setBio(Object bio) {
        this.bio = bio;
    }

    /**
     *
     * @return
     *     The publicRepos
     */
    public int getPublicRepos() {
        return publicRepos;
    }

    /**
     *
     * @param publicRepos
     *     The public_repos
     */
    public void setPublicRepos(int publicRepos) {
        this.publicRepos = publicRepos;
    }

    /**
     *
     * @return
     *     The publicGists
     */
    public int getPublicGists() {
        return publicGists;
    }

    /**
     *
     * @param publicGists
     *     The public_gists
     */
    public void setPublicGists(int publicGists) {
        this.publicGists = publicGists;
    }

    /**
     *
     * @return
     *     The followers
     */
    public int getFollowers() {
        return followers;
    }

    /**
     *
     * @param followers
     *     The followers
     */
    public void setFollowers(int followers) {
        this.followers = followers;
    }

    /**
     *
     * @return
     *     The following
     */
    public int getFollowing() {
        return following;
    }

    /**
     *
     * @param following
     *     The following
     */
    public void setFollowing(int following) {
        this.following = following;
    }

    /**
     *
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
     *     The privateGists
     */
    public int getPrivateGists() {
        return privateGists;
    }

    /**
     *
     * @param privateGists
     *     The private_gists
     */
    public void setPrivateGists(int privateGists) {
        this.privateGists = privateGists;
    }

    /**
     *
     * @return
     *     The totalPrivateRepos
     */
    public int getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    /**
     *
     * @param totalPrivateRepos
     *     The total_private_repos
     */
    public void setTotalPrivateRepos(int totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    /**
     *
     * @return
     *     The ownedPrivateRepos
     */
    public int getOwnedPrivateRepos() {
        return ownedPrivateRepos;
    }

    /**
     *
     * @param ownedPrivateRepos
     *     The owned_private_repos
     */
    public void setOwnedPrivateRepos(int ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
    }

    /**
     *
     * @return
     *     The diskUsage
     */
    public int getDiskUsage() {
        return diskUsage;
    }

    /**
     *
     * @param diskUsage
     *     The disk_usage
     */
    public void setDiskUsage(int diskUsage) {
        this.diskUsage = diskUsage;
    }

    /**
     *
     * @return
     *     The collaborators
     */
    public int getCollaborators() {
        return collaborators;
    }

    /**
     *
     * @param collaborators
     *     The collaborators
     */
    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }

    /**
     *
     * @return
     *     The plan
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     *
     * @param plan
     *     The plan
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}
