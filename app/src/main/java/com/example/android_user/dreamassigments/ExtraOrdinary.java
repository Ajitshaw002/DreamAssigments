package com.example.android_user.dreamassigments;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.example.android_user.dreamassigments.Adapter.MyExListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExtraOrdinary extends AppCompatActivity {
Toolbar toolbar;
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_ordinary);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        expandableListView=(ExpandableListView)findViewById(R.id.expan_listview);
        List<String> Heading =new ArrayList<>();
        List<String> h1 =new ArrayList<>();
        List<String> h2 =new ArrayList<>();
        List<String> h3 =new ArrayList<>();
        List<String> h4 =new ArrayList<>();
        List<String> h5 =new ArrayList<>();
        List<String> h6 =new ArrayList<>();
        List<String> h7 =new ArrayList<>();
        List<String> h8 =new ArrayList<>();
        List<String> h9 =new ArrayList<>();
        List<String> h10 =new ArrayList<>();
        List<String> h11 =new ArrayList<>();
        List<String> h12 =new ArrayList<>();
        List<String> h13 =new ArrayList<>();
        List<String> h14 =new ArrayList<>();
        HashMap<String,List<String>> ChildList= new HashMap<String, List<String>>();
        String heading_item[]=getResources().getStringArray(R.array.header_title);
        String H1[]=getResources().getStringArray(R.array.h1_item);
        String H2[]=getResources().getStringArray(R.array.h2_item);
        String H3[]=getResources().getStringArray(R.array.h3_item);
        String H4[]=getResources().getStringArray(R.array.h4_item);
        String H5[]=getResources().getStringArray(R.array.h5_item);
        String H6[]=getResources().getStringArray(R.array.h6_item);
        String H7[]=getResources().getStringArray(R.array.h7_item);
        String H8[]=getResources().getStringArray(R.array.h8_item);
        String H9[]=getResources().getStringArray(R.array.h9_item);
        String H10[]=getResources().getStringArray(R.array.h10_item);
        String H11[]=getResources().getStringArray(R.array.h11_item);
        String H12[]=getResources().getStringArray(R.array.h12_item);
        String H13[]=getResources().getStringArray(R.array.h13_item);
        String H14[]=getResources().getStringArray(R.array.h14_item);
        for(String title:heading_item)
        {
            Heading.add(title);
        }
        for(String title:H1)
        {
            h1.add(title);
        }
        for(String title:H2)
        {
            h2.add(title);
        }
        for(String title:H3)
        {
            h3.add(title);
        }
        for(String title:H4)
        {
            h4.add(title);
        }
        for(String title:H5)
        {
            h5.add(title);
        }
        for(String title:H6)
        {
            h6.add(title);
        } for(String title:H7)
        {
            h7.add(title);
        } for(String title:H8)
        {
            h8.add(title);
        }
        for(String title:H9)
        {
            h9.add(title);
        } for(String title:H10)
        {
            h10.add(title);
        }
        for(String title:H11)
        {
            h11.add(title);
        }
        for(String title:H12)
        {
            h12.add(title);
        }
        for(String title:H13)
        {
            h13.add(title);
        }
        for(String title:H14)
        {
            h14.add(title);
        }

        ChildList.put(Heading.get(0),h1);
        ChildList.put(Heading.get(1),h2);
        ChildList.put(Heading.get(2),h3);
        ChildList.put(Heading.get(3),h4);
        ChildList.put(Heading.get(4),h5);
        ChildList.put(Heading.get(5),h6);
        ChildList.put(Heading.get(6),h7);
        ChildList.put(Heading.get(7),h8);
        ChildList.put(Heading.get(8),h9);
        ChildList.put(Heading.get(9),h10);
        ChildList.put(Heading.get(10),h11);
        ChildList.put(Heading.get(11),h12);
        ChildList.put(Heading.get(12),h13);
        ChildList.put(Heading.get(13),h14);
        MyExListAdapter myExListAdapter=new MyExListAdapter(this,Heading,ChildList);
        expandableListView.setAdapter(myExListAdapter);







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
