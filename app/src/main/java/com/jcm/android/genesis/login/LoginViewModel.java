package com.jcm.android.genesis.login;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by Jevin on 01/28/2018.
 */

public class LoginViewModel extends ViewModel {
    private LiveData<Login> loginUser;

    /*private String emailId;
    private String pwd;

    public void init(String emailId) {
        this.emailId = emailId;
    }*/

    public LiveData<Login> getLoginUser() {
        return loginUser;
    }
}
