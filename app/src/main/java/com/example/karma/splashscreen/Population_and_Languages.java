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



        s1=getIntent().getStringExtra("myText");

        if(s1.equalsIgnoreCase("Thimphu"))
        {
            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.thimphu);
            tv.setText(R.string.thimphu_population);
        }
        else if (s1.equalsIgnoreCase("Punakha")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.punakha);
            tv.setText(R.string.punakha_population);
        }

        else if (s1.equalsIgnoreCase("Paro")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.paro);
            tv.setText(R.string.paro_population);
        }
        else if (s1.equalsIgnoreCase("Haa")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.haa);
            tv.setText(R.string.haa_population);
        }
        else if (s1.equalsIgnoreCase("Gasa")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.gasa);
            tv.setText(R.string.gasa_population);
        }
        else if (s1.equalsIgnoreCase("Wangduephodrang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.wangdue);
            tv.setText(R.string.wangdiphodrang_population);
        }
        else if (s1.equalsIgnoreCase("Trongsa")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.trongsa);
            tv.setText(R.string.trongsa_population);
        }
        else if (s1.equalsIgnoreCase("Bumthang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.wangdue);
            tv.setText(R.string.bumthang_population);
        }

    }
}
