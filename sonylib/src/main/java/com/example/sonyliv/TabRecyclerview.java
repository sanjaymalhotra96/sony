package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TabRecyclerview extends RecyclerView.Adapter<TabRecyclerview.MyViewHolder> {


    public TabRecyclerview(MainActivity mainActivity) {
    }

    @NonNull
    @Override
    public TabRecyclerview.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab_recyclerview, parent, false);
        return new TabRecyclerview.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TabRecyclerview.MyViewHolder holder, int position) {

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

    {
    }
}
