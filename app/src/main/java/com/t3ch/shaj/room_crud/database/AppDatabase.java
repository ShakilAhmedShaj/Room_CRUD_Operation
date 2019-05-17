package com.t3ch.shaj.room_crud.database;

import android.arch.persistence.room.RoomDatabase;


/**
 * Created by Shakil Ahmed Shaj on 17-May-19.
 * shakilahmedshaj@gmail.com
 */
@android.arch.persistence.room.Database(entities = {MobileEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MobileDao mDatabaseDao();


}
