package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ProfileRecyclerview extends RecyclerView.Adapter<ProfileRecyclerview.MyViewHolder> {
    public ProfileRecyclerview(MenuFragment menuFragment) {
    }

    @NonNull
    @Override
    public ProfileRecyclerview.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_recyclerview, parent, false);
        return new ProfileRecyclerview.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileRecyclerview.MyViewHolder holder, int position) {

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
