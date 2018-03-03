package com.jcm.android.genesis.login;

import android.arch.lifecycle.LiveData;
import android.util.Log;

import com.jcm.android.genesis.data.ws.Webservice;

import java.io.IOException;
import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Response;

/**
 * Created by Jevin on 02/28/2018.
 */

@Singleton
public class LoginRepository {
    private final Webservice webservice;
    private final LoginDao loginDao;
    private final Executor executor;
    private static final String LOG_TAG = "LoginRepository";
    private static final int FRESH_TIMEOUT = 5;

    @Inject
    public LoginRepository(Webservice webservice, LoginDao loginDao, Executor executor){
        this.webservice = webservice;
        this.loginDao = loginDao;
        this.executor = executor;
    }

    public LiveData<Login> getUser(String id){
        Log.d(LOG_TAG,"getUser(String id) :method started");
        refreshLogin(id);
        Log.d(LOG_TAG,"getUser(String id) :method ended");
        return loginDao.load(id);
    }

    private void refreshLogin(final String id){
        Log.d(LOG_TAG,"refreshLogin(final String id) :method started");
        executor.execute(() ->{
            boolean loginExists = loginDao.hasLogin(id);
            if (!loginExists) {
                Response response = null;
                try {
                    response = webservice.getUser(id).execute();
                } catch (IOException e) {
                    Log.e(LOG_TAG, "Exception occurred");
                    e.printStackTrace();
                }
                //TODO check for error
                //Update the database
                loginDao.save(null);
            }
        });
        Log.d(LOG_TAG,"refreshLogin(final String id) :method ended");
    }
}
