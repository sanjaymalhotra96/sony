package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardAdaptor extends RecyclerView.Adapter<CardAdaptor.MyViewHolder> {


    public CardAdaptor(HomeFragment homeFragment) {
    }

    @NonNull
    @Override
    public CardAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recyclerview, parent, false);
        return new CardAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdaptor.MyViewHolder holder, int position) {

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