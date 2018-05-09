package com.example.android_user.dreamassigments;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android_user.dreamassigments.Adapter.CustomPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;

    CustomPagerAdapter mcustompagerAdapter;
    TextView about,answer,orderNow,sample,facebook,twitter,linkedin,googleplus,Services;
    ViewPager viewPager;
    int page = 0;
    String shareBody="These is a great App, u should try it out!";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        viewPager = (ViewPager) findViewById(R.id.pager);
        mcustompagerAdapter = new CustomPagerAdapter(this);
        viewPager.setAdapter(mcustompagerAdapter);

        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(), 1000, 3000);

        about=(TextView)findViewById(R.id.home);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),About.class);
                startActivity(i);

            }
        });
        orderNow =(TextView)findViewById(R.id.orderNow) ;
        orderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),Order_Detail.class);
                startActivity(i);

            }
        });
        sample =(TextView)findViewById(R.id.sample);
        sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),Sample.class);
                startActivity(i);
            }
        });

        answer=(TextView)findViewById(R.id.answers);
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.dreamassignment.com/answers.php"));
                startActivity(intent);

            }
        });

        Services = (TextView) findViewById(R.id.services);
        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Services.class);
                startActivity(i);
            }
        });


        facebook=(TextView)findViewById(R.id.textFacebook);
        facebook.setPaintFlags(facebook.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        twitter=(TextView)findViewById(R.id.textTwitter);
        twitter.setPaintFlags(twitter.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        linkedin=(TextView)findViewById(R.id.textLinkedin);
        linkedin.setPaintFlags(linkedin.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        googleplus=(TextView)findViewById(R.id.textGooglePlus);
        googleplus.setPaintFlags(googleplus.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/dreamassignment/"));
                startActivity(intent);

            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/dreamassignmen1"));
                startActivity(intent);
            }
        });

        googleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://plus.google.com/u/0/100536152187662018699"));
                startActivity(intent);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/start/join?session_redirect=https%3A%2F%2Fwww.linkedin.com%2Fin%2Fdream-assignment-09069a127%3Ftrk%3Dnav_responsive_tab_profile&source=gf&trk=login_reg_redirect"));
                startActivity(intent);
            }
        });


    }



    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_privacyPolicy) {
            Intent i= new Intent(getApplicationContext(),PrivacyPolicy.class);
            startActivity(i);

        } else if(id == R.id.action_termsOfUse)
        {
            Intent i= new Intent(getApplicationContext(),TermsOfUse.class);
            startActivity(i);
        }else if(id == R.id.action_orderNow)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://www.dreamassignment.com/order_form.php"));
            startActivity(intent);

        }else if(id == R.id.action_login)
        {
            Intent i= new Intent(getApplicationContext(),LogInTabs.class);
            startActivity(i);
        }else if(id == R.id.action_info)
        {
            Intent i= new Intent(getApplicationContext(),ContactUs.class);
            startActivity(i);
        }


        return super.onOptionsItemSelected(item);


    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
 if (id == R.id.nav_ask) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://www.dreamassignment.com/answers.php"));
            startActivity(intent);

        } else if (id == R.id.nav_faq) {
            Intent i = new Intent(getBaseContext(),FrequentlyAsk.class);
            startActivity(i);

        }else if (id == R.id.nav_orderNow) {
     Intent i= new Intent(getApplicationContext(),OrderNow.class);
     startActivity(i);

        }else if (id == R.id.nav_login) {
            Intent i= new Intent(getApplicationContext(),LogInTabs.class);
            startActivity(i);
        }else if (id == R.id.nav_share)
        {
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "My App");
            intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(intent,"Share Via..."));
            return  true;
        }else if (id == R.id.nav_extraordinary)
        {
            Intent intent = new Intent(getApplicationContext(),ExtraOrdinary.class);
            startActivity(intent);
        }else if (id == R.id.nav_contactUs)
        {
     Intent intent = new Intent(getApplicationContext(),ContactUs.class);
     startActivity(intent);
         }else if (id == R.id.nav_myprofile)
 {
     Intent intent = new Intent(getApplicationContext(),Myprofile.class);
     startActivity(intent);
 }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

       public class MyTimerTask extends TimerTask {

            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (page > 3) {
                            page = 0;
                        } else {
                            viewPager.setCurrentItem(page++);
                        }

                    }
                });
            }
        }


}
