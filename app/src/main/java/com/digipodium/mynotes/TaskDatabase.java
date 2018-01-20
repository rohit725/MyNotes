package com.digipodium.mynotes;

import android.arch.persistence.room.RoomDatabase;


public abstract class TaskDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
