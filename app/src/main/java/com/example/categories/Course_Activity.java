package com.example.categories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Course_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        tvtitle = (TextView) findViewById(R.id.title1);
        tvdescription = (TextView) findViewById(R.id.description);
        tvcategory = (TextView) findViewById(R.id.category);
        img = (ImageView) findViewById(R.id.coursethumbnail);



        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}