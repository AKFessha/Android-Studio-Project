package com.example.awet.gradeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
    Button btnAdd, btnGoToSummary;
    EditText txtGrade;
    String stGrade = null;
    public static ArrayList<Double> listOfGrades= new ArrayList<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoToSummary = (Button) findViewById(R.id.btnShowSummary);
        btnAdd= findViewById(R.id.btnAddGrade);
        txtGrade= findViewById(R.id.txtGrade);

        //Adding grade to the arraylist by listening a click event

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stGrade= txtGrade.getText().toString();
                if(stGrade.isEmpty()){
                   Toast tos = Toast.makeText(getApplicationContext(),"Please enter a grade ", Toast.LENGTH_LONG);
                   tos.show();
                }
                else if(listOfGrades.contains(Double.parseDouble(stGrade))){
                    Toast tos = Toast.makeText(getApplicationContext(),"Grade already exist", Toast.LENGTH_LONG) ;
                    tos.show();
                }
                else{
                 listOfGrades.add(Double.parseDouble(stGrade));
                 txtGrade.setText("");
                 Toast tos = Toast.makeText(getApplicationContext(),"Grade is successfully added", Toast.LENGTH_LONG) ;
                 tos.show();
                }
            }
        });

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


    }

}