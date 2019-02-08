package com.example.awet.gradeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

import java.util.ArrayList;


public class Summary extends AppCompatActivity {
  Button goBack;
  EditText totalGrade, averageGrade, lowerGrade, highGrade;
  Double highgrade, lowergrade, averagegrade, totalgrade;
  public ArrayList<Double> myGrades = new ArrayList<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_grade);
        goBack= findViewById(R.id.btnGoBack);
        totalGrade = findViewById(R.id.txtTotalGrade);
        averageGrade= findViewById(R.id.txtAverageGrade);
        lowerGrade= findViewById(R.id.txtLowerGrade);
        highGrade= findViewById(R.id.txtHighGrade);
        myGrades = Main.listOfGrades;


        for(int i=0; i<myGrades.size(); i++){
            highgrade=0.0;
            if(myGrades.get(i)>highgrade){
                highgrade= myGrades.get(i);
            }
        }
        highGrade.setText(highgrade.toString());


        for(int i=0; i<myGrades.size(); i++){
            lowergrade=myGrades.get(0);
            if(myGrades.get(i)<= lowergrade){
                lowergrade= myGrades.get(i);
            }
        }
        lowerGrade.setText(lowergrade.toString());
        double sum =0.0 ;
        for(int i=0; i<myGrades.size(); i++){
            sum += myGrades.get(i);
            }
        averagegrade= sum/myGrades.size();
        averageGrade.setText(averagegrade.toString());

        totalgrade= sum;
         totalGrade.setText(totalgrade.toString());

      goBack.setOnClickListener(new View.OnClickListener(){

          @Override
          public void onClick(View view) {
              Intent t = new Intent(getApplicationContext(), Main.class);
              startActivity(t);
          }
      });
    }
}
