package com.jcm.android.genesis.data.net;

import android.util.Log;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientException;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 * Created by Jevin on 02/03/2018.
 */

public class MongoDBConnection {
    private static final String LOG_TAG = "MongoDBConnection";

    public static void connectDB(){
        Log.d(LOG_TAG,"connectDB() :method started");
        try {
            MongoClientURI uri = new MongoClientURI("");
            MongoClient mongoClient = new MongoClient(uri);
            MongoDatabase db = mongoClient.getDatabase(uri.getDatabase());
        } catch (MongoClientException e) {
            Log.e(LOG_TAG, "MongoClientException occurred");
            e.printStackTrace();
        } catch (Exception e1) {
            Log.e(LOG_TAG, "Exception occurred");
            e1.printStackTrace();
        }
        Log.d(LOG_TAG,"connectDB() :method ended");
    }
}
