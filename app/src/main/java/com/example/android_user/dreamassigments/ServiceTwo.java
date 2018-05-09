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

import com.example.android_user.dreamassigments.Adapter.RecyclerAdapter;
import com.example.android_user.dreamassigments.Others.Caterory1;

public class ServiceTwo extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_two);
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        toolbar.setTitle(getResources().getString(R.string.app_name));
       setSupportActionBar(toolbar);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setBundle();



    }

    public void setBundle()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        Bundle bundle= getIntent().getExtras();
        if(bundle!=null)
        {
            toolbar.setTitle(bundle.getString("ServiceName"));
            if(toolbar.getTitle().toString().equalsIgnoreCase("Humanities Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);

                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Law Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData1());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Social Science Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData2());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Engineering Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData3());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Essay Assignment Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData4());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Analysis/Outline/Draft Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData5());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Presentation,Pictorial Representation Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData6());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Professional Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData7());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("HomeWork Guidance"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData8());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Public Service Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData9());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Formal Science Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData10());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Natural Science Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData11());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Commerce Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData12());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("Other Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData13());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }else if(toolbar.getTitle().toString().equalsIgnoreCase("M.B.A Help"))
            {
                recyclerView = (RecyclerView) findViewById(R.id.recentlyView);
                RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), Caterory1.getData14());
                recyclerView.setAdapter(adapter);
                LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(getApplicationContext());
                mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
            }
        }
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
