package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NothingRecyclerview  extends RecyclerView.Adapter<NothingRecyclerview.MyViewHolder> {


    public NothingRecyclerview(PremiumFragment premiumFragment) {
    }

    @NonNull
    @Override
    public NothingRecyclerview.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nothing_recyclerview, parent, false);
        return new NothingRecyclerview.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NothingRecyclerview.MyViewHolder holder, int position) {

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