package com.example.android_user.dreamassigments.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android_user.dreamassigments.Others.Caterory1;
import com.example.android_user.dreamassigments.R;
import com.example.android_user.dreamassigments.ServiceDetail;

import java.util.List;

/**
 * Created by Android-user on 14-Apr-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<Caterory1> mData;
    private LayoutInflater mInflater;
    private Context mContext;


    public RecyclerAdapter(Context context, List<Caterory1> data) {
        this.mData = data;
        this.mInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycler_list, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Caterory1 currentObj = mData.get(position);

        holder.setData(currentObj);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

     class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView title;
        ImageView imgThumb;
         private Context mContext;



        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView)  itemView.findViewById(R.id.txv_row);
            //itemView.setOnClickListener(this);

        }

        public void setData(Caterory1 current) {
            this.title.setText(current.title);

        }

//
//        @Override
//        public void onClick(View v) {
//            Intent i= new Intent(this.mContext,ServiceDetail.class);
//            this.mContext.startActivity(i);
//
//        }

    }



}
