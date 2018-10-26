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
            img.setImageResource(R.drawable.thimphu_festival);
            tv.setText(R.string.thimphu_festival);
        }

        else if(s1.equalsIgnoreCase("Punakha"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.punakha_festival);

        }

        else if(s1.equalsIgnoreCase("Paro"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.paro_festival);
            tv.setText(R.string.paro_festival);

        }
        else if(s1.equalsIgnoreCase("Haa"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.haa_festival);
            tv.setText(R.string.haa_festival);

        }

        else if(s1.equalsIgnoreCase("Gasa"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.gasa_festival);
            tv.setText(R.string.gasa_festival);

        }
        else if(s1.equalsIgnoreCase("Wangduephodrang"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.wangdue_festival);
            tv.setText(R.string.wangdi_festival);

        }
        else if(s1.equalsIgnoreCase("Trongsa"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.trongsa_festival);
            tv.setText(R.string.trongsa_festival);

        }
        else if(s1.equalsIgnoreCase("Bumthang"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.bumthang_kurjey_festival);
            tv.setText(R.string.bumthang_festival);

        }


    }
}
