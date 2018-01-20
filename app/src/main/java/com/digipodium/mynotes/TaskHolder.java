package com.digipodium.mynotes;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import co.dift.ui.SwipeToAction;


public class TaskHolder extends SwipeToAction.ViewHolder<TaskModel> {

    CheckBox task_name;
    TextView task_desc;

    public TaskHolder(View v) {
        super(v);
        task_name = v.findViewById(R.id.TaskCheck);
        task_desc = v.findViewById(R.id.TaskDesc);
    }
}
