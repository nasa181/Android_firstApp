package com.example.nasa181.indiv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalYearOld extends AppCompatActivity {
    TextView year;
    String birthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_year_old);
        year = (TextView)findViewById(R.id.yearText);
        birthday = getIntent().getStringExtra("data");
        calYear();

    }
    public void calYear(){
        DateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        long today=(new Date()).getTime();
        long bday=0;
        try {
            bday = formatter.parse(birthday).getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long age=(today-bday)/(1000 * 60 * 60 * 24);
        year.setText(age + " days.");
    }


}
