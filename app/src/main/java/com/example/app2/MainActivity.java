package com.example.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button campus = findViewById(R.id.btnCampus);
        Button dinning = findViewById(R.id.btnDining);
        Button facility = findViewById(R.id.btnFacility);
        Button sports = findViewById(R.id.btnSports);
        Button others = findViewById(R.id.btnOthers);
        Button contactus = findViewById(R.id.btnContactus);


        //campus Button
        campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                startActivity(intent);
            }
        });


        //facility Button
        facility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main3Activity.class);
                startActivity(intent);
            }
        });


        //dinning Button
        dinning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main4Activity.class);
                startActivity(intent);
            }
        });


        //sports Button
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main5Activity.class);
                startActivity(intent);
            }
        });

        //contactus Button
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main6Activity.class);
                startActivity(intent);
            }
        });

        //others Button
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main8Activity.class);
                startActivity(intent);
            }
        });







    }
}
