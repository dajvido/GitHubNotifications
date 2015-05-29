package com.dbjaskot.githubclient.authorization;

/**
 * Created by dajvido on 24.05.15.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Authorization {

    @Expose
    private int id;
    @Expose
    private String url;
    @Expose
    private App app;
    @Expose
    private String token;
    @SerializedName("hashed_token")
    @Expose
    private String hashedToken;
    @SerializedName("token_last_eight")
    @Expose
    private String tokenLastEight;
    @Expose
    private String note;
    @SerializedName("note_url")
    @Expose
    private Object noteUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @Expose
    private List<String> scopes = new ArrayList<String>();
    @Expose
    private Object fingerprint;

    /**
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return The app
     */
    public App getApp() {
        return app;
    }

    /**
     * @param app The app
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * @return The token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token The token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return The hashedToken
     */
    public String getHashedToken() {
        return hashedToken;
    }

    /**
     * @param hashedToken The hashed_token
     */
    public void setHashedToken(String hashedToken) {
        this.hashedToken = hashedToken;
    }

    /**
     * @return The tokenLastEight
     */
    public String getTokenLastEight() {
        return tokenLastEight;
    }

    /**
     * @param tokenLastEight The token_last_eight
     */
    public void setTokenLastEight(String tokenLastEight) {
        this.tokenLastEight = tokenLastEight;
    }

    /**
     * @return The note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note The note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return The noteUrl
     */
    public Object getNoteUrl() {
        return noteUrl;
    }

    /**
     * @param noteUrl The note_url
     */
    public void setNoteUrl(Object noteUrl) {
        this.noteUrl = noteUrl;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return The scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * @param scopes The scopes
     */
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * @return The fingerprint
     */
    public Object getFingerprint() {
        return fingerprint;
    }

    /**
     * @param fingerprint The fingerprint
     */
    public void setFingerprint(Object fingerprint) {
        this.fingerprint = fingerprint;
    }

}
