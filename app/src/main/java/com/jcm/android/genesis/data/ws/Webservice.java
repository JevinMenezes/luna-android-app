package com.jcm.android.genesis.data.ws;

import com.jcm.android.genesis.login.Login;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Jevin on 02/27/2018.
 */

public interface Webservice {
    @GET("/login/{userid}")
    Call<Login> getUser(@Path("userid") String id);
}
