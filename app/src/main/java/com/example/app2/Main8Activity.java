package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        //Title Name
        getSupportActionBar().setTitle("Others");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
