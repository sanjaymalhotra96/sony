package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UpComingLive extends RecyclerView.Adapter<UpComingLive.MyViewHolder> {


    public UpComingLive(HomeFragment homeFragment) {
    }

    @NonNull
    @Override
    public UpComingLive.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.up_coming_on_live_recyclerview, parent, false);
        return new UpComingLive.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UpComingLive.MyViewHolder holder, int position) {

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