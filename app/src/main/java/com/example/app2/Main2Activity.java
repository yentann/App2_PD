package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        img = (ImageView) findViewById(R.id.imageViewMap);
        img.setImageResource(R.drawable.campusmap);

        //Title Name
        getSupportActionBar().setTitle("Campus Map");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }
}
