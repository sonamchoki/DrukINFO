package com.example.karma.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutUs_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
