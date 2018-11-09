package com.example.karma.splashscreen;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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


        s1 = getIntent().getStringExtra("myText");


        if (s1.equalsIgnoreCase("Thimphu")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.thimphu_festival);
            tv.setText(R.string.thimphu_festival);
        } else if (s1.equalsIgnoreCase("Punakha")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.punakha_festival);

        } else if (s1.equalsIgnoreCase("Paro")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.paro_festival);
            tv.setText(R.string.paro_festival);

        } else if (s1.equalsIgnoreCase("Haa")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.haa_festival);
            tv.setText(R.string.haa_festival);

        } else if (s1.equalsIgnoreCase("Gasa")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.gasa_festival);
            tv.setText(R.string.gasa_festival);

        } else if (s1.equalsIgnoreCase("Wangduephodrang")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.wangdue_festival);
            tv.setText(R.string.wangdi_festival);

        } else if (s1.equalsIgnoreCase("Trongsa")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.trongsa_festival);
            tv.setText(R.string.trongsa_festival);

        } else if (s1.equalsIgnoreCase("Bumthang")) {
            img = (ImageView) findViewById(R.id.img);
            tv = (TextView) findViewById(R.id.t1);
            img.setImageResource(R.drawable.bumthang_kurjey_festival);
            tv.setText(R.string.bumthang_festival);

        }
        else if(s1.equalsIgnoreCase("Chukha"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.chukha_fes);

        }
        else if(s1.equalsIgnoreCase("Dagana"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.dagana_fes);

        }
        else if(s1.equalsIgnoreCase("Lhuntse"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.lhuntse_fes);

        }
        else if(s1.equalsIgnoreCase("Mongar"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.mongar_fes);

        }
        else if(s1.equalsIgnoreCase("Pemagatshel"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.pemaga_fes);

        }
        else if(s1.equalsIgnoreCase("Samdrupjongkher"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.samdrupjon_fes);

        }
        else if(s1.equalsIgnoreCase("Samtse"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.samtse_fes);

        }
        else if(s1.equalsIgnoreCase("Sarpang"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.sarpang_fes);

        }
        else if(s1.equalsIgnoreCase("Tashigang"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.tashigang_fes);

        }
        else if(s1.equalsIgnoreCase("Tsirang"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.tsirang_fes);

        }
        else if(s1.equalsIgnoreCase("Tashiyangtse"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.tashiyang_fes);

        }
        else if(s1.equalsIgnoreCase("Zhemgang"))
        {
            img=(ImageView)findViewById(R.id.img);
            tv=(TextView)findViewById(R.id.t1);
            img.setImageResource(R.drawable.punakha_festival);
            tv.setText(R.string.zhemgang_fes);

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
            Intent intent=new Intent(Festival.this,Navigation_MainActivity.class);
            startActivity(intent);

    }
        return(super.onOptionsItemSelected(item));
    }

}
