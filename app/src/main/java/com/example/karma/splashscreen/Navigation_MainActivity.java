package com.example.karma.splashscreen;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Navigation_MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FloatingActionButton fab1;

CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation__main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);
        c3=(CardView) findViewById(R.id.c3);
        c4=(CardView) findViewById(R.id.c4);
        c5=(CardView) findViewById(R.id.c5);
        c6=(CardView) findViewById(R.id.c6);
        c7=(CardView) findViewById(R.id.c7);
        c8=(CardView) findViewById(R.id.c8);
        c9=(CardView) findViewById(R.id.c9);
       c10=(CardView) findViewById(R.id.c10);
        c11=(CardView) findViewById(R.id.c11);
        c12=(CardView) findViewById(R.id.c12);
        c13=(CardView) findViewById(R.id.c13);
        c14=(CardView) findViewById(R.id.c14);
        c15=(CardView) findViewById(R.id.c15);
        c16=(CardView) findViewById(R.id.c16);
        c17=(CardView) findViewById(R.id.c17);
        c18=(CardView) findViewById(R.id.c18);
        c19=(CardView) findViewById(R.id.c19);
        c20=(CardView) findViewById(R.id.c20);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Thimphu";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Punakha";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

      c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Paro";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

       c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Haa";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Gasa";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Wangduephodrang";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Trongsa";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Bumthang";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Chukha";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Dagan";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Lhuntse";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Mongar";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Pemagatshel";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Samdrupjongkher";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Samtse";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Sarpang";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Tashigang";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Tsirang";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Tashiyangtse";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });

        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="Zhemgang";

                Intent intent=new Intent(Navigation_MainActivity.this, List_Activity_Thimphu.class);
                intent.putExtra("myText", s);
                startActivity(intent);
            }
        });




       FloatingActionButton fab1 = (FloatingActionButton)findViewById(R.id.fab_up);
       fab1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Snackbar.make(v, "Replace with your action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
               startActivity(new Intent(Navigation_MainActivity.this, Navigation_MainActivity.class));
           }
       });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation__main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

            // Handle the camera action
        } else if (id == R.id.rate) {
            Intent intent=new Intent(Navigation_MainActivity.this,Rate_us_Avtivity.class);
            startActivity(intent);

        } else if (id == R.id.about_us) {
            Intent intent=new Intent(Navigation_MainActivity.this,AboutUs_activity.class);
            startActivity(intent);

        } else if (id == R.id.close) {
            final AlertDialog.Builder builder=new AlertDialog.Builder(Navigation_MainActivity.this);
            builder.setMessage("Are you sure you want to close this close?");
            builder.setCancelable(true);
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if (id == R.id.share) {
           // Intent intent=new Intent(Navigation_MainActivity.this,Share_link_Activity.class);
           // startActivity(intent);

            Intent intent= new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBody = "Your body here";
            String shareSub ="Your subject here";
            intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            intent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(intent, "Share using"));

        } else if (id == R.id.feedback) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
