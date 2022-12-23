package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SportsAdaptor extends RecyclerView.Adapter<SportsAdaptor.MyViewHolder> {


    public SportsAdaptor(HomeFragment homeFragment) {
    }

    @NonNull
    @Override
    public SportsAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_sports_recyclerview, parent, false);
        return new SportsAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsAdaptor.MyViewHolder holder, int position) {

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