package com.example.categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Course> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseList = new ArrayList<>();
        courseList.add(new Course("Science","Category Course","Description Course",R.drawable.science));
        courseList.add(new Course("Maths","Category Course","Description Course",R.drawable.math));
        courseList.add(new Course("Commerce","Category Course","Description Course",R.drawable.account));
        courseList.add(new Course("Arts","Category Course","Description Course",R.drawable.arts));
        courseList.add(new Course("Design","Category Course","Description Course",R.drawable.design));
        courseList.add(new Course("Architecture","Category Course","Description Course",R.drawable.t1));
        courseList.add(new Course("Category 7","Category Course","Description Course",R.drawable.yoga));
        courseList.add(new Course("Category 8","Category Course","Description Course",R.drawable.cat8));
        courseList.add(new Course("Category 9","Category Course","Description Course",R.drawable.law));
        courseList.add(new Course("Category 10","Category Course","Description Course",R.drawable.buiseness));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,courseList);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}