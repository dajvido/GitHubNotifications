package com.dbjaskot.githubclient.authorization;

/**
 * Created by dajvido on 24.05.15.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AuthBody {

    @SerializedName("client_id")
    @Expose
    private String clientId;
    @SerializedName("client_secret")
    @Expose
    private String clientSecret;
    @Expose
    private String scopes;
    @Expose
    private String note;

    /**
     * @return The clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * @param clientId The client_id
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * @return The clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * @param clientSecret The client_secret
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * @return The scopes
     */
    public String getScopes() {
        return scopes;
    }

    /**
     * @param scopes The scopes
     */
    public void setScopes(String scopes) {
        this.scopes = scopes;
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

}
