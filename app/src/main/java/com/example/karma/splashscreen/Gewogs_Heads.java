package com.example.karma.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Gewogs_Heads extends AppCompatActivity {

    String s1;
    ImageView img;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gewogs__heads);

        s1=getIntent().getStringExtra("myText");

        if(s1.equalsIgnoreCase("Thimphu"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.thimphu_gewogs);
        }

        else if(s1.equalsIgnoreCase("Punakha"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_all_img);
            tv.setText(R.string.punakha_gewogs);

        }

        else if(s1.equalsIgnoreCase("Paro"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.paro_geographical);
            tv.setText(R.string.paro_gewogs);

        }
        else if(s1.equalsIgnoreCase("Haa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.haa_gewogs);

        }
        else if(s1.equalsIgnoreCase("Gasa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.gasa_geographical);
            tv.setText(R.string.gasa_gewogs);

        }
        else if(s1.equalsIgnoreCase("Wangduephodrang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.wphodrang_gewogs);

        }
        else if(s1.equalsIgnoreCase("Trongsa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.trongsa_gewogs);

        }
        else if(s1.equalsIgnoreCase("Bumthang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.bumthang_gewogs);

        }
        else if(s1.equalsIgnoreCase("Chukha"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.chhukha_gewogs);

        }
        else if(s1.equalsIgnoreCase("Dagana"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.dagana_gewogs);

        }
        else if(s1.equalsIgnoreCase("Lhuntse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.lhuentse_gewogs);

        }
        else if(s1.equalsIgnoreCase("Mongar"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.mongar_gewogs);

        }
        else if(s1.equalsIgnoreCase("Pemagatshel"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.pemagatshel_gewogs);

        }
        else if(s1.equalsIgnoreCase("Samdrupjongkher"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.samdrupjongkhar_gewogs);

        }
        else if(s1.equalsIgnoreCase("Samtse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.samtse_gewogs);

        }
        else if(s1.equalsIgnoreCase("Sarpang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.sarpang_gewogs);

        }
        else if(s1.equalsIgnoreCase("Tashigang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.tgang_gewogs);

        }
        else if(s1.equalsIgnoreCase("Tashiyangtse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.tyangtsi_gewogs);

        }
        else if(s1.equalsIgnoreCase("Zhemgang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.zhemgang_gewogs);

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId()) {
            case R.id.action_settings:
                Intent intent=new Intent(Gewogs_Heads.this,Navigation_MainActivity.class);
                startActivity(intent);

        }
        return(super.onOptionsItemSelected(item));
    }

}

