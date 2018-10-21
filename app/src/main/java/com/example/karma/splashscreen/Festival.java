package com.example.karma.splashscreen;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Festival extends AppCompatActivity {
    String s1;
    ImageView img;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s1=getIntent().getStringExtra("myText");

        if(s1.equalsIgnoreCase("Thimphu"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.thimphu);
            tv.setText(R.string.thimphu_festival);
        }

        else if(s1.equalsIgnoreCase("paro"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.paro);
            tv.setText(R.string.paro_festival);
            tv.setText(s1);
        }
    }
}
