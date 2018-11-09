package com.example.karma.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.thimphu_population);
        }
        else if (s1.equalsIgnoreCase("Punakha")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.punakha_population);
        }

        else if (s1.equalsIgnoreCase("Paro")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.paro_population);
        }
        else if (s1.equalsIgnoreCase("Haa")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_img);
            tv.setText(R.string.haa_population);
        }
        else if (s1.equalsIgnoreCase("Gasa")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_img);
            tv.setText(R.string.gasa_population);
        }
        else if (s1.equalsIgnoreCase("Wangduephodrang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_img);
            tv.setText(R.string.wangdiphodrang_population);
        }
        else if (s1.equalsIgnoreCase("Trongsa")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.trongsa_population);
        }
        else if (s1.equalsIgnoreCase("Bumthang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.bumthang_population);
        }

        else if (s1.equalsIgnoreCase("Chukha")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.chukha_population);
        }

        else if (s1.equalsIgnoreCase("Dagana")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_img);
            tv.setText(R.string.dagana_population);
        }
        else if (s1.equalsIgnoreCase("Lhuntse")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.lhuntse_population);
        }

        else if (s1.equalsIgnoreCase("Mongar")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_img);
            tv.setText(R.string.mongar_population);
        }
        else if (s1.equalsIgnoreCase("Pemagatshel")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.pemagatshel_population);
        }
        else if (s1.equalsIgnoreCase("Samdrupjongkher")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.samdrupjongkher_population);
        }
        else if (s1.equalsIgnoreCase("Samtse")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.samtse_population);
        }
        else if (s1.equalsIgnoreCase("Sarpang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.sarpang_population);
        }
        else if (s1.equalsIgnoreCase("Tashigang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.tashigang_population);
        }
        else if (s1.equalsIgnoreCase("Tsirang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.tsirang_population);
        }
        else if (s1.equalsIgnoreCase("Tashiyangtse")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.tashiyangtse_population);

        }
        else if (s1.equalsIgnoreCase("Zhemgang")){

            img=(ImageView)findViewById(R.id.p_img);
            tv=(TextView)findViewById(R.id.p_t1);
            img.setImageResource(R.drawable.populatio_imgsss);
            tv.setText(R.string.zhemgang_population);
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
                Intent intent=new Intent(Population_and_Languages.this,Navigation_MainActivity.class);
                startActivity(intent);

        }
        return(super.onOptionsItemSelected(item));
    }

}
