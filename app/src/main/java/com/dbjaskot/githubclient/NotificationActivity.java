package com.dbjaskot.githubclient;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dbjaskot.githubclient.comment.Comment;
import com.dbjaskot.githubclient.notification.Empty;
import com.dbjaskot.githubclient.notification.Notification;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by dajvido on 24.05.15.
 */
public class NotificationActivity extends ActionBarActivity {

    public static final String REPO = "REPO";
    public static final String USER = "USER";
    public static final String TYPE = "TYPE";
    public static final String TITLE = "TITLE";

    public static final String NO_NEW_NOTIFICATIONS = "No new notifications";
    public static final String FAIL = "fail";
    public static final String FAIL_TO_GET_NOTIFICATIONS = "Fail to get notifications";
    public static final String FAIL_TO_GET_USER_LOGIN = "Fail to get user login";
    public static final String FAIL_TO_SET_NOTIFICATION_AS_READ = "Fail to set notification as read";

    private static final GitHubService service = MainActivity.service;

    private String token;
    private String notificationId = "";

    private String repoName;
    private String notifyType;
    private String notifyUser;
    private String notifyTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        repoName = "";
        notifyType = "";
        notifyUser = "";
        notifyTitle = "";

        Intent intent = getIntent();
        token = intent.getStringExtra(MainActivity.AUTH_TOKEN);
    }

    public void notificationClick(View v) {
        service.getNotifications(
                token,
                new Callback<List<Notification>>() {
                    @Override
                    public void success(List<Notification> notifications, Response response) {
                        TextView textView = (TextView) findViewById(R.id.textView);
                        TextView textView2 = (TextView) findViewById(R.id.textView2);
                        TextView textView4 = (TextView) findViewById(R.id.textView4);

                        if (!notifications.isEmpty()) {
                            Notification notification = notifications.get(0);

                            repoName = String.valueOf(notification.getRepository().getFullName());
                            notifyType = String.valueOf(notification.getSubject().getType());
                            notifyTitle = String.valueOf(notification.getSubject().getTitle());
                            String commentUrl = String.valueOf(notification.getSubject().getLatestCommentUrl());
                            notificationId = notification.getId();

                            textView.setText(repoName);
                            textView2.setText(notifyType);
                            textView4.setText(notifyTitle);

                            String[] commentPathList = commentUrl.split("/");

                            if (commentPathList.length == 8) {
                                service.getRequest(
                                        commentPathList[4],
                                        commentPathList[5],
                                        commentPathList[7],
                                        new Callback<Comment>() {
                                            @Override
                                            public void success(Comment comment, Response response) {
                                                TextView textView3 = (TextView) findViewById(R.id.textView3);
                                                notifyUser = comment.getUser().getLogin();
                                                textView3.setText(notifyUser);
                                            }

                                            @Override
                                            public void failure(RetrofitError error) {
                                                TextView textView3 = (TextView) findViewById(R.id.textView3);
                                                textView3.setText(FAIL);
                                                Toast.makeText(getApplicationContext(), FAIL_TO_GET_USER_LOGIN, Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            } else {
                                service.getComment(
                                        commentPathList[4],
                                        commentPathList[5],
                                        commentPathList[8],
                                        new Callback<Comment>() {
                                            @Override
                                            public void success(Comment comment, Response response) {
                                                TextView textView3 = (TextView) findViewById(R.id.textView3);
                                                notifyUser = comment.getUser().getLogin();
                                                textView3.setText(notifyUser);
                                            }

                                            @Override
                                            public void failure(RetrofitError error) {
                                                TextView textView3 = (TextView) findViewById(R.id.textView3);
                                                textView3.setText(FAIL);
                                                Toast.makeText(getApplicationContext(), FAIL_TO_GET_USER_LOGIN, Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), NO_NEW_NOTIFICATIONS, Toast.LENGTH_SHORT).show();
                        }


                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(getApplicationContext(), FAIL_TO_GET_NOTIFICATIONS, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public void setNotificationAsRead() {
        if (!notificationId.isEmpty()) {
            service.setNotification(token, notificationId, new Callback<Empty>() {
                @Override
                public void success(Empty empty, Response response) {
                    TextView textView = (TextView) findViewById(R.id.textView);
                    TextView textView2 = (TextView) findViewById(R.id.textView2);
                    TextView textView3 = (TextView) findViewById(R.id.textView3);
                    TextView textView4 = (TextView) findViewById(R.id.textView4);

                    textView.setText("");
                    textView2.setText("");
                    textView3.setText("");
                    textView4.setText("");
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(getApplicationContext(), FAIL_TO_SET_NOTIFICATION_AS_READ, Toast.LENGTH_SHORT).show();
                }
            });
            notificationId = "";
        }
    }

    public void readNotification(View v) {
        setNotificationAsRead();
    }

    public void makeNotification(View v) {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.githubmark)
                        .setContentTitle(repoName)
                        .setContentText(notifyTitle);
// Creates an explicit intent for an Activity in your app
        Intent resultIntent = new Intent(this, NewNotificationActivity.class);

        resultIntent.putExtra(REPO, repoName);
        resultIntent.putExtra(USER, notifyUser);
        resultIntent.putExtra(TYPE, notifyType);
        resultIntent.putExtra(TITLE, notifyTitle);

// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your application to the Home screen.
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
// Adds the back stack for the Intent (but not the Intent itself)
        stackBuilder.addParentStack(NewNotificationActivity.class);
// Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(
                        0,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// mId allows you to update the notification later on.
        int mNotificationId = 001;
        mNotificationManager.notify(mNotificationId, mBuilder.build());

        setNotificationAsRead();
    }
}
