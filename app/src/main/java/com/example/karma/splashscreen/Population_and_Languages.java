package com.example.karma.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Population_and_Languages extends AppCompatActivity {
    String s1;
    ImageView img;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_population_and__languages);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s1=getIntent().getStringExtra("myText");

        if(s1.equalsIgnoreCase("Thimphu"))
        {
            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.thimphu);
            tv.setText(R.string.thimphu_population);
        }

        else if(s1.equalsIgnoreCase("paro"))
        {
            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.paro);
            tv.setText(R.string.paro_population);
            tv.setText(s1);
        }
    }
}
