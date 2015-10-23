package com.example.trey.roomateagreement;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button toItem = (Button) findViewById(R.id.toItem);
        toItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(DataActivity.this, AddItem.class));
            }

            DatePicker date1=(DatePicker)findViewById(R.id.datePicker);
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            String day=sdf.format(new Date(date1.getDayOfMonth()));
            String month=sdf.format(new Date(date1.getMonth()));
            String year=sdf.format(new Date(date1.getYear()));
            String date=month+"/"+day+"/"+year;
            Bundle b=new Bundle();

            //b.putString("date1",new Intent(DataActivity.this, AddItem.class));
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
