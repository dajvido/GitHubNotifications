package com.dbjaskot.githubclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.dbjaskot.githubclient.notification.Notification;

/**
 * Created by dajvido on 29.05.15.
 */
public class NewNotificationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_notification);

        Intent intent = getIntent();

        String repoName = intent.getStringExtra(NotificationActivity.REPO);
        String notifyType = intent.getStringExtra(NotificationActivity.TYPE);
        String notifyUser = intent.getStringExtra(NotificationActivity.USER);
        String notifyTitle = intent.getStringExtra(NotificationActivity.TITLE);

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);

        textView.setText(repoName);
        textView2.setText(notifyType);
        textView3.setText(notifyUser);
        textView4.setText(notifyTitle);
    }
}
