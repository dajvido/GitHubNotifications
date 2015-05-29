package com.dbjaskot.githubclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.dbjaskot.githubclient.authorization.AuthBody;
import com.dbjaskot.githubclient.authorization.Authorization;
import com.dbjaskot.githubclient.user.User;
import com.squareup.picasso.Picasso;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends ActionBarActivity {

    public static final String AUTH_TOKEN = "AUTH_TOKEN";
    public static final String BASIC = "Basic ";
    public static final String TOKEN = "token ";
    public static final String GITHUB_CLIENT_ID = "6a83bbb2f8357fb2de93";
    public static final String GITHUB_CLIENT_SECRET = "5566c9deb6f75f6c71aa83c71224b6a84144b8f1";
    public static final String GITHUB_SCOPES = "notifications";
    public static final String GITHUB_NOTE = "notifications";
    public static final String GITHUB_URL = "https://api.github.com";
    public static final RestAdapter restAdapter = new RestAdapter.Builder()
            .setEndpoint(GITHUB_URL)
            .build();
    public static final GitHubService service = restAdapter.create(GitHubService.class);

    private EditText textLogin;
    private EditText textPassword;
    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLogin = (EditText) findViewById(R.id.textLogin);
        textLogin.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    service.getUser(textLogin.getText().toString(), new Callback<User>() {
                        @Override
                        public void success(User user, Response response) {
                            ImageView imageView = (ImageView) findViewById(R.id.imageViewAvatar);
                            Picasso.with(getApplicationContext()).load(user.getAvatarUrl()).into(imageView);
                        }

                        @Override
                        public void failure(RetrofitError error) {

                        }
                    });
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onLogin(View v) {
        textPassword = (EditText) findViewById(R.id.textPassword);

        String login = textLogin.getText().toString();
        String password = textPassword.getText().toString();

        String basicAuth = BASIC + Base64.encodeToString((login + ":" + password).getBytes(), Base64.NO_WRAP);

        AuthBody authBody = new AuthBody();
        authBody.setClientId(GITHUB_CLIENT_ID);
        authBody.setClientSecret(GITHUB_CLIENT_SECRET);
        authBody.setScopes(GITHUB_SCOPES);
        authBody.setNote(GITHUB_NOTE);

        service.getAuthorization(
                basicAuth,
                authBody,
                new Callback<Authorization>() {
                    @Override
                    public void success(Authorization authorization, Response response) {
                        Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                        intent.putExtra(AUTH_TOKEN, TOKEN + authorization.getToken());
                        startActivity(intent);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(getBaseContext(), error.getResponse().getReason(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
