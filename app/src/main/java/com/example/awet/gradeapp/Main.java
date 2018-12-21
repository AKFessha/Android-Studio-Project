package com.example.awet.gradeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                Intent  t = new Intent(getApplicationContext(), SummaryGrade.class);
                startActivity(t);
            }
        });


    }

}