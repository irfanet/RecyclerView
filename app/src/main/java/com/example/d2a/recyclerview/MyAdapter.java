package com.example.d2a.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by D2A on 10/2/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    String data1[],data2[];
    int img[];
    Context ctx;

    public MyAdapter(Context ct, String[] s1, String[] s2, int i1[]){
        ctx = ct;
        data1=s1;
        data2=s2;
        img=i1;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View myOwnView = myInflator.inflate(R.layout.my_row,parent,false);
        return new MyHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;
        ImageView myImage;
        public MyHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.text1);
            t2 = (TextView)itemView.findViewById(R.id.text2);
            myImage = (ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
