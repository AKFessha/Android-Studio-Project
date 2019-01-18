package com.example.awet.gradeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    Button btnAdd, btnGoToSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoToSummary = (Button) findViewById(R.id.btnShowSummary);

        btnGoToSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  t = new Intent(getApplicationContext(), Summary.class);
                startActivity(t);
                Toast toast = Toast.makeText(getApplicationContext(), "This button has been clicked", Toast.LENGTH_LONG);
                toast.setMargin(0,50);
                toast.show();
            }
        });

        btnAdd =  findViewById(R.id.btnAddGrade);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

}