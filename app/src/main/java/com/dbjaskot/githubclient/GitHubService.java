package com.dbjaskot.githubclient;

import com.dbjaskot.githubclient.authorization.AuthBody;
import com.dbjaskot.githubclient.authorization.Authorization;
import com.dbjaskot.githubclient.comment.Comment;
import com.dbjaskot.githubclient.notification.Empty;
import com.dbjaskot.githubclient.notification.Notification;
import com.dbjaskot.githubclient.user.User;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by dajvido on 16.05.15.
 */
public interface GitHubService {
    @GET("/users/{user}")
    public void getUser(
            @Path("user") String user,
            Callback<User> callback
    );

    @GET("/notifications")
    public void getNotifications(
            @Header("Authorization") String token,
            Callback<List<Notification>> callback
    );

    @PATCH("/notifications/threads/{id}")
    public void setNotification(
            @Header("Authorization") String token,
            @Path("id") String id,
            Callback<Empty> callback
    );

    @GET("/repos/{owner}/{repo}/issues/{id}")
    public void getRequest(
            @Path("owner") String owner,
            @Path("repo") String repo,
            @Path("id") String id,
            Callback<Comment> callback
    );

    @GET("/repos/{owner}/{repo}/issues/comments/{id}")
    public void getComment(
            @Path("owner") String owner,
            @Path("repo") String repo,
            @Path("id") String id,
            Callback<Comment> callback
    );

    @POST("/authorizations")
    public void getAuthorization(
            @Header("Authorization") String authBasic,
            @Body AuthBody params,
            Callback<Authorization> callback
    );
}