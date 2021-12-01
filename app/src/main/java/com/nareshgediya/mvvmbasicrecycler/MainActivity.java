package com.nareshgediya.mvvmbasicrecycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ModelViewModel modelViewModel;

    MainAdapter adapter;
    List<MainData> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

modelViewModel = ViewModelProviders.of(MainActivity.this).get(ModelViewModel.class);
modelViewModel.init();

list = new ArrayList<>();
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));
        list.add(new MainData("Naresh Gediya"));

        recyclerView = findViewById(R.id.recycle_View);
        //initiallize Adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        adapter = new MainAdapter(this,modelViewModel.getData().getValue());

        recyclerView.setAdapter(adapter);


        ItemTouchHelper.SimpleCallback call = new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull  RecyclerView.ViewHolder viewHolder, @NonNull  RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

                if (direction == 8){
                    Toast.makeText(MainActivity.this, "Right....", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Left....", Toast.LENGTH_SHORT).show();
                }

            }
        };

   new ItemTouchHelper(call).attachToRecyclerView(recyclerView);



    }



}