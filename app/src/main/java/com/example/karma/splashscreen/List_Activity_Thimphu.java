package com.example.karma.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class List_Activity_Thimphu extends AppCompatActivity {

    String s1;
    CardView lc1,lc2,lc3,lc4,lc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list___thimphu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s1=getIntent().getStringExtra("myText");
        lc1=(CardView)findViewById(R.id.lc1);
        lc2=(CardView)findViewById(R.id.lc2);
        lc4=(CardView)findViewById(R.id.lc4);
        lc3=(CardView)findViewById(R.id.lc3);
        lc5=(CardView)findViewById(R.id.lc5);
        lc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(List_Activity_Thimphu.this, Festival.class);
                intent.putExtra("myText", s1);
                startActivity(intent);
            }
        });

       lc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(List_Activity_Thimphu.this, Population_and_Languages.class);
                intent.putExtra("myText", s1);
                startActivity(intent);
            }
        });

        lc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(List_Activity_Thimphu.this, Geographical_detail.class);
                intent.putExtra("myText", s1);
                startActivity(intent);
            }
        });

        lc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(List_Activity_Thimphu.this, Gewogs_Heads.class);
                intent.putExtra("myText", s1);
                startActivity(intent);
            }
        });

        lc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(List_Activity_Thimphu.this, Contact_Details.class);
                intent.putExtra("myText", s1);
                startActivity(intent);
            }
        });

    }
}
