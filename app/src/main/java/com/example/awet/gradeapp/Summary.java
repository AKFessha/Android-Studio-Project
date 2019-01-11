package com.example.awet.gradeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class Summary extends AppCompatActivity {
  Button goBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_grade);
        goBack= (Button)findViewById(R.id.btnGoBack);
      goBack.setOnClickListener(new View.OnClickListener(){

          @Override
          public void onClick(View view) {
              Intent t = new Intent(getApplicationContext(), Main.class);
              startActivity(t);
          }
      });
    }
}
