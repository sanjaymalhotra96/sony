package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OscarRecyclerview extends RecyclerView.Adapter<OscarRecyclerview.MyViewHolder> {


    public OscarRecyclerview(PremiumFragment premiumFragment) {
    }

    @NonNull
    @Override
    public OscarRecyclerview.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.oscar_recyclerview,parent,false);
        return new OscarRecyclerview.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OscarRecyclerview.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
