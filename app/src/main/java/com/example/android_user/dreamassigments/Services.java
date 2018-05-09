package com.example.android_user.dreamassigments;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Services extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
         toolbar = (Toolbar) findViewById(R.id.toolbar);
       // toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView=(ListView)findViewById(R.id.listView);
        listview();


    }




public void listview()
{
    ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),
            R.layout.custom_listview,R.id.list_items,getResources().getStringArray(R.array.service));

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent=new Intent(getApplicationContext(),ServiceTwo.class);
            intent.putExtra("ServiceName",listView.getItemAtPosition(position).toString());
            startActivity(intent);
        }
    });
    listView.setAdapter(adapter);
}




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

        finish();
        return super.onOptionsItemSelected(item);
    }
}
