package com.example.android_user.dreamassigments.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.android_user.dreamassigments.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Android-user on 10-Apr-17.
 */

public class MyExListAdapter extends BaseExpandableListAdapter {
    private List<String> header_title;
    private HashMap<String,List<String>> child_title;
    private Context context;

    public MyExListAdapter(Context context,List<String> header_title,HashMap<String,List<String>> child_title)
    {
        this.context=context;
        this.header_title=header_title;
        this.child_title=child_title;
    }


    @Override
    public int getGroupCount() {
        return header_title.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return child_title.get(header_title.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return header_title.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return child_title.get(header_title.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title=(String)this.getGroup(groupPosition);
        if(convertView == null)
        {
            LayoutInflater inflater =(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =inflater.inflate(R.layout.list_parent,null);

        }
        TextView txtview =(TextView)convertView.findViewById(R.id.txtParent);
        txtview.setTypeface(null, Typeface.BOLD);
        txtview.setText(title);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String title=(String)this.getChild(groupPosition,childPosition);
        if(convertView == null)
        {
            LayoutInflater inflater =(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =inflater.inflate(R.layout.list_child,null);

        }
        TextView txtview =(TextView)convertView.findViewById(R.id.txtChild);
        txtview.setText(title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}


