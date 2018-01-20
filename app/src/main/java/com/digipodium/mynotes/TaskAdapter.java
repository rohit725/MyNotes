package com.digipodium.mynotes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class TaskAdapter extends RecyclerView.Adapter<TaskHolder> {

    private List<TaskModel> task_list;

    public TaskAdapter(List<TaskModel> tasks) {
        this.task_list = tasks;
    }

    @Override
    public TaskHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = ((LayoutInflater) parent.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.tasks_view, parent, false);
        return new TaskHolder(row);
    }

    @Override
    public void onBindViewHolder(TaskHolder holder, int position) {
        final TaskModel taskModel = task_list.get(position);
        holder.task_name.setText(taskModel.task);
        holder.task_desc.setText(taskModel.desc);
    }

    @Override
    public int getItemCount() {
        return task_list.size();
    }
}
