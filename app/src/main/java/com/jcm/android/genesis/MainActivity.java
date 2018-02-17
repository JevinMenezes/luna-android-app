package com.jcm.android.genesis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.jcm.android.genesis.login.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Jevin on 01/22/2018.
 */

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActivity";

    @BindView(R.id.app_name) TextView _appNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d(LOG_TAG,"onCreate(Bundle savedInstanceState) :method started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d(LOG_TAG, "onCreate(Bundle savedInstanceState) :method ended");
    }

    @OnClick(R.id.app_name)
    public void startLoginActivity(){
        Log.d(LOG_TAG,"startLoginActivity() :method started");
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        startActivityForResult(i, 0);
        Log.d(LOG_TAG,"startLoginActivity() :method ended");
    }
}