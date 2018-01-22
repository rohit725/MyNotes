package com.digipodium.mynotes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Time;
import java.time.OffsetDateTime;
import java.util.Date;


@Entity
public class Tasks {

    @PrimaryKey
    private int task_id;

    @ColumnInfo(name = "Name")
    private String task_name;

    @ColumnInfo(name = "Description")
    private String task_description;

    @ColumnInfo(name = "Status")
    private boolean task_status;

    @ColumnInfo(name = "DueDate")
    private Date task_duedate;

    @ColumnInfo(name = "Reminder")
    private OffsetDateTime reminder;

    public int getTask_id(){
        return task_id;
    }

    public void setTask_id(int task_id){
        this.task_id = task_id;
    }

    public String getTask_name(){
        return task_name;
    }

    public void setTask_name(String task_name){
        this.task_name = task_name;
    }

    public String getTask_description(){
        return task_description;
    }

    public void setTask_description(String task_description){
        this.task_description = task_description;
    }

    public boolean getTask_status(){
        return task_status;
    }

    public void setTask_status(boolean task_status){
        this.task_status = task_status;
    }

    public OffsetDateTime getReminder(){
        return reminder;
    }

    public void setReminder(OffsetDateTime reminder){
        this.reminder = reminder;
    }

    public Date getTask_duedate(){
        return task_duedate;
    }

    public void setTask_duedate(Date task_duedate){
        this.task_duedate = task_duedate;
    }

}
