package com.jcm.android.genesis.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.jcm.android.genesis.login.Login;

/**
 * Created by Jevin on 02/03/2018.
 */

@Database(entities={Login.class}, version=1, exportSchema = true)
public abstract class LunaDB extends RoomDatabase {
}
