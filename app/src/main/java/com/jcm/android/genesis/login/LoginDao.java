package com.jcm.android.genesis.login;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by Jevin on 02/28/2018.
 */

@Dao
public interface LoginDao {
    @Insert(onConflict = REPLACE)
    void save(Login login);

    @Query("SELECT * FROM login WHERE id = :id")
    LiveData<Login> load(String id);

    @Query("SELECT CAST(COUNT(*) AS BIT) FROM [login] WHERE id = :id")
    boolean hasLogin(String id);
}
