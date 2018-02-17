package com.jcm.android.genesis.data.net;

import android.util.Log;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by Jevin on 02/03/2018.
 */

public class MongoDBConnection {
    private static final String LOG_TAG = "MongoDBConnection";

    public static void connectDB(){
        try {
            MongoClient mongoClient = new MongoClient();
            DB database = mongoClient.getDB("JizoDB");
            DBCollection collection = database.getCollection("Login");
        } catch (UnknownHostException e) {
            Log.e(LOG_TAG, "UnknownHostException occurred");
            e.printStackTrace();
        } catch (Exception e1) {
            Log.e(LOG_TAG, "Exception occurred");
            e1.printStackTrace();
        }
    }
}
