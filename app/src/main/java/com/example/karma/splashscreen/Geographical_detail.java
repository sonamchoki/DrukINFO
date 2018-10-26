package com.example.karma.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Geographical_detail extends AppCompatActivity {

    String s1;
    ImageView img;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geographical_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        s1=getIntent().getStringExtra("myText");

        if(s1.equalsIgnoreCase("Thimphu"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.thimphu_geographical);
        }

        else if(s1.equalsIgnoreCase("Punakha"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_all_img);
            tv.setText(R.string.punakha_geographical);

        }

        else if(s1.equalsIgnoreCase("Paro"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.paro_geographical);
            tv.setText(R.string.paro_geographical);

        }
        else if(s1.equalsIgnoreCase("Haa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.haa_geographical);

        }
        else if(s1.equalsIgnoreCase("Gasa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.gasa_geographical);
            tv.setText(R.string.gasa_geographical);

        }
        else if(s1.equalsIgnoreCase("Wangduephodrang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.wangdi_geographical);

        }
        else if(s1.equalsIgnoreCase("Trongsa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.trongsa_geographical);

        }
        else if(s1.equalsIgnoreCase("Bumthang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.bumthang_geographical);

        }
        else if(s1.equalsIgnoreCase("Chukha"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.chukha_geographical);

        }
        else if(s1.equalsIgnoreCase("Dagana"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.dagana_geographical);

        }
        else if(s1.equalsIgnoreCase("Lhuntse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.lhuntse_geographical);

        }
        else if(s1.equalsIgnoreCase("Mongar"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.mongar_geographical);

        }
        else if(s1.equalsIgnoreCase("Pemagatshel"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.pemagatshel_geographical);

        }
        else if(s1.equalsIgnoreCase("Samdrupjongkher"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.samdrupjongkher_geographical);

        }
        else if(s1.equalsIgnoreCase("Samtse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.samtse_geographical);

        }
        else if(s1.equalsIgnoreCase("Sarpang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.sarpang_geographical);

        }
        else if(s1.equalsIgnoreCase("Tashigang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.tashigang_geographical);

        }
        else if(s1.equalsIgnoreCase("Tashiyangtse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.tashiyangtse_geographical);

        }
        else if(s1.equalsIgnoreCase("Zhemgang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.zhemgang_geographical);

        }
    }
}
