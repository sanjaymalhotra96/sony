package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SteelRecyclerview extends RecyclerView.Adapter<SteelRecyclerview.MyViewHolder> {


    public SteelRecyclerview(PremiumFragment premiumFragment) {
    }

    @NonNull
    @Override
    public SteelRecyclerview.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flick_recyclerview, parent, false);
        return new SteelRecyclerview.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SteelRecyclerview.MyViewHolder holder, int position) {

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