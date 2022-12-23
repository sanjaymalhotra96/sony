package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodayHotAdaptor extends RecyclerView.Adapter<TodayHotAdaptor.MyViewHolder> {


    public TodayHotAdaptor(HomeFragment homeFragment) {
    }

    @NonNull
    @Override
    public TodayHotAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.today_hots_pick_recyclerview, parent, false);
        return new TodayHotAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodayHotAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}