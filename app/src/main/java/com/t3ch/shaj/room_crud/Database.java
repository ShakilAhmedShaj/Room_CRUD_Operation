package com.t3ch.shaj.room_crud;

import android.arch.persistence.room.RoomDatabase;


/**
 * Created by Shakil Ahmed Shaj on 17-May-19.
 * shakilahmedshaj@gmail.com
 */
@android.arch.persistence.room.Database(entities = {Mobile.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract DatabaseDao mDatabaseDao();


}
