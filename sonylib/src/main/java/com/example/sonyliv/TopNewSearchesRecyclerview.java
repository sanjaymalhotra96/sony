package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopNewSearchesRecyclerview  extends RecyclerView.Adapter<TopNewSearchesRecyclerview.MyViewHolder> {
    public TopNewSearchesRecyclerview(SearchFragment searchFragment) {
    }

    @NonNull
    @Override
    public TopNewSearchesRecyclerview.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_searches_recyclerview, parent, false);
        return new TopNewSearchesRecyclerview.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopNewSearchesRecyclerview.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 55;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
