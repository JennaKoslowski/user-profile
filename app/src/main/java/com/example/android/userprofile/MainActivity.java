package com.example.android.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewName = (TextView) findViewById(R.id.name);
        textViewName.setText("Jenna");

        TextView textViewBirthday = (TextView) findViewById(R.id.birthday);
        textViewBirthday.setText("April 13, 2020");

        TextView textViewCountry = (TextView) findViewById(R.id.country);
        textViewCountry.setText("USA");

    }
}
