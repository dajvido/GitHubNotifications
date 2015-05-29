package com.dbjaskot.githubclient.user;

/**
 * Created by dajvido on 15.05.15.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Plan {

    @Expose
    private String name;
    @Expose
    private int space;
    @Expose
    private int collaborators;
    @SerializedName("private_repos")
    @Expose
    private int privateRepos;

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The space
     */
    public int getSpace() {
        return space;
    }

    /**
     * @param space The space
     */
    public void setSpace(int space) {
        this.space = space;
    }

    /**
     * @return The collaborators
     */
    public int getCollaborators() {
        return collaborators;
    }

    /**
     * @param collaborators The collaborators
     */
    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }

    /**
     * @return The privateRepos
     */
    public int getPrivateRepos() {
        return privateRepos;
    }

    /**
     * @param privateRepos The private_repos
     */
    public void setPrivateRepos(int privateRepos) {
        this.privateRepos = privateRepos;
    }

}
