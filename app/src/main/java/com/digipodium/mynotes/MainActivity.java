package com.digipodium.mynotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import co.dift.ui.SwipeToAction;

import static java.lang.Boolean.FALSE;

public class MainActivity extends AppCompatActivity {

    List<TaskModel> tasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TaskActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.TaskRecycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        TaskAdapter adapter = new TaskAdapter(this.tasks);
        recyclerView.setAdapter(adapter);

        SwipeToAction swipeToAction = new SwipeToAction(recyclerView, new SwipeToAction.SwipeListener<Tasks>() {
            @Override
            public boolean swipeLeft(final Tasks itemData) {
                //do something
                return true; //true will move the front view to its starting position
            }

            @Override
            public boolean swipeRight(Tasks itemData) {
                //do something
                return true;
            }

            @Override
            public void onClick(Tasks itemData) {
                //do something
            }

            @Override
            public void onLongClick(Tasks itemData) {
                //do something
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private static void populateWithTestData(TaskDatabase db) {
        Tasks task = new Tasks();   //Just a Demo Task
        task.setTask_id(1);
        task.setTask_name("Docker Presentation");
        task.setTask_description("You have to create a presentation on docker.");
        task.setTask_status(FALSE);
        db.taskDao().insertTask(task);
    }

}
