package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddonLive  extends RecyclerView.Adapter<AddonLive.MyViewHolder> {


    public AddonLive(HomeFragment homeFragment) {
    }

    @NonNull
    @Override
    public AddonLive.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_on_liv_recyclerview, parent, false);
        return new AddonLive.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddonLive.MyViewHolder holder, int position) {

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