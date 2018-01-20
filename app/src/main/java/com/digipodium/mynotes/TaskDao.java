package com.digipodium.mynotes;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


@Dao
public interface TaskDao {
    @Query("SELECT * FROM Tasks")
    public Tasks[] loadAllTasks();

    @Query("SELECT * FROM Tasks WHERE Name Like :task_name")
    public Tasks[] findTasksByName(String task_name);

    @Insert
    public void insertTask(Tasks task);

    @Update
    public void updateTask(Tasks task);

    @Delete
    public void deleteTask(Tasks task);
}
