package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Title Name
        getSupportActionBar().setTitle("Dining Area");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
