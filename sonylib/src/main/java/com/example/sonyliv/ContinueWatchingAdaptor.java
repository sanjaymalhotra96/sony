package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContinueWatchingAdaptor extends RecyclerView.Adapter<ContinueWatchingAdaptor.MyViewHolder> {


    public ContinueWatchingAdaptor(HomeFragment homeFragment) {
    }

    @NonNull
@Override
public ContinueWatchingAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.continue_watching_recyclerview, parent, false);
        return new ContinueWatchingAdaptor.MyViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull ContinueWatchingAdaptor.MyViewHolder holder, int position) {

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