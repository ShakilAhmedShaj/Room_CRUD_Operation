package com.t3ch.shaj.room_crud.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Shakil Ahmed Shaj on 17-May-19.
 * shakilahmedshaj@gmail.com
 */
@Dao
public interface MobileDao {

    @Insert
    void insertMobileData(MobileEntity mobile);

    @Query("Select * from mobile")
    List<MobileEntity> getData();


}
