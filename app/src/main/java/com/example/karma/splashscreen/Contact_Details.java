package com.example.karma.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact_Details extends AppCompatActivity {

    String s1;
    ImageView img;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__details);

        s1=getIntent().getStringExtra("myText");

        if(s1.equalsIgnoreCase("Thimphu"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.conatct1_img);
            tv.setText(R.string.thimphu_contact);
        }

        else if(s1.equalsIgnoreCase("Punakha"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_all_img);
            tv.setText(R.string.punakha_contact);

        }

        else if(s1.equalsIgnoreCase("Paro"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.paro_geographical);
            tv.setText(R.string.paro_contact);

        }
        else if(s1.equalsIgnoreCase("Haa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.haa_contact);

        }
        else if(s1.equalsIgnoreCase("Gasa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.gasa_geographical);
            tv.setText(R.string.gasa_contact);

        }
        else if(s1.equalsIgnoreCase("Wangduephodrang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.wangdi_contact);

        }
        else if(s1.equalsIgnoreCase("Trongsa"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.trongsa_contact);

        }
        else if(s1.equalsIgnoreCase("Bumthang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.bumthang_contact);

        }
        else if(s1.equalsIgnoreCase("Chukha"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.chukha_contact);

        }
        else if(s1.equalsIgnoreCase("Dagana"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.dagana_contact);

        }
        else if(s1.equalsIgnoreCase("Lhuntse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.lhuntse_contact);

        }
        else if(s1.equalsIgnoreCase("Mongar"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.mongar_contact);

        }
        else if(s1.equalsIgnoreCase("Pemagatshel"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.pemagatshel_contact);

        }
        else if(s1.equalsIgnoreCase("Samdrupjongkher"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.samdrupjongkher_contact);

        }
        else if(s1.equalsIgnoreCase("Samtse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.samtse_contact);

        }
        else if(s1.equalsIgnoreCase("Sarpang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.sarpang_contact);

        }
        else if(s1.equalsIgnoreCase("Tashigang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.tashigang_contact);

        }
        else if(s1.equalsIgnoreCase("Tsirang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.tsirang_contact);

        }
        else if(s1.equalsIgnoreCase("Tashiyangtse"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.tashiyangtse_contact);

        }
        else if(s1.equalsIgnoreCase("Zhemgang"))
        {
            img=(ImageView)findViewById(R.id.g_img);
            tv=(TextView)findViewById(R.id.g_t1);
            img.setImageResource(R.drawable.geographical_img);
            tv.setText(R.string.zhemgang_contact);

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
                Intent intent=new Intent(Contact_Details.this,Navigation_MainActivity.class);
                startActivity(intent);

        }
        return(super.onOptionsItemSelected(item));
    }

}

