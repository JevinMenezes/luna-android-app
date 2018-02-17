package com.jcm.android.genesis.login;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jevin on 01/28/2018.
 */

@Entity
public class Login {
    @PrimaryKey
    private int id;
    private String username;//email id
    private String pwd;
    //private String pwdHash;//Use this once hash algo is implemented
    private String lastLoginDateTime;
    private String incorrectLoginAttempts;
    private String isLoggedIn;

    public Login(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /*public String getPwdHash() {
        return pwdHash;
    }

    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
    }*/

    public String getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(String lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

    public String getIncorrectLoginAttempts() {
        return incorrectLoginAttempts;
    }

    public void setIncorrectLoginAttempts(String incorrectLoginAttempts) {
        this.incorrectLoginAttempts = incorrectLoginAttempts;
    }

    public String getIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(String isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
}
