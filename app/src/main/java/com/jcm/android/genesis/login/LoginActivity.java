package com.jcm.android.genesis.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import com.jcm.android.genesis.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Jevin on 01/25/2018.
 */

public class LoginActivity extends AppCompatActivity {
    private static final String LOG_TAG = "LoginActivity";

    @BindView(R.id.input_email) EditText _emailText;

    @BindView(R.id.input_password) EditText _passwordText;

    /*@BindView(R.id.link_signup)
    TextView _signupLink;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG,"onCreate(Bundle savedInstanceState) :method started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        Log.d(LOG_TAG, "onCreate(Bundle savedInstanceState) :method ended");
    }

    @OnClick(R.id.btn_login)
    public void login(){
        Log.d(LOG_TAG,"login() :method started");
        Log.d(LOG_TAG,"login() :method ended");
    }

    @OnClick(R.id.link_signup)
    public void signup(){
        Log.d(LOG_TAG,"signup() :method started");
        Log.d(LOG_TAG,"signup() :method ended");
    }
}