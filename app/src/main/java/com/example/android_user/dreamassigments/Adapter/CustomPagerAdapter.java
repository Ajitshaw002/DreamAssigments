package com.example.android_user.dreamassigments.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.android_user.dreamassigments.R;

/**
 * Created by dextro on 03-Feb-17.
 */

public class CustomPagerAdapter extends PagerAdapter

{

    private  int[] mResources ={
        R.drawable.banner1,
        R.drawable.banner2,
        R.drawable.banner3,

};
    private Context ctx;
    private LayoutInflater mLayoutInflater;

    public CustomPagerAdapter(Context ctx) {
        this.ctx = ctx;

    }

    @Override
    public int getCount()
    {
       return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((CardView) object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        mLayoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
         imageView.setImageResource(mResources[position]);
        container.addView(itemView);
        return itemView;
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((CardView) object);
    }
}