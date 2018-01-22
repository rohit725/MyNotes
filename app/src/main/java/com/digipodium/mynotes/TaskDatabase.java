package com.digipodium.mynotes;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;


@Database(entities = {Tasks.class}, version = 1)
@TypeConverters({Converters.class})
abstract class TaskDatabase extends RoomDatabase {
    abstract TaskDao taskDao();
}
