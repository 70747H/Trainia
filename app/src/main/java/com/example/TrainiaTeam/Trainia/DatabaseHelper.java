package com.example.TrainiaTeam.Trainia;

import android.content.Context;

import TrainiaDB.runtime.util.SimpleSQLiteOpenHelper;

/**
 * Created by Hussien on 04-May-16.
 */
public class DatabaseHelper extends SimpleSQLiteOpenHelper {

    protected static final String DB_NAME = "Trainia";
    protected static final Integer VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, VERSION);
    }

    @Override
    public void configure() {
        addCreationScript(R.raw.create);
    }

}
