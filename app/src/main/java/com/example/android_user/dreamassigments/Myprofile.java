package com.example.android_user.dreamassigments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android_user.dreamassigments.Others.ImageConverter;

public class Myprofile extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    String shareBody="These is a great App, u should try it out!";
    TextView home,placeOrder,viewInfo;
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);


       // ImageView circularImageView = (ImageView)findViewById(R.id.circleView);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        home=(TextView)findViewById(R.id.home);
        placeOrder=(TextView)findViewById(R.id.placeOrder);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),OrderNow.class);
                startActivity(i);
            }
        });




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
}
