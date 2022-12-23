package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewInPremium extends RecyclerView.Adapter<NewInPremium.MyViewHolder> {
    public NewInPremium(PremiumFragment premiumFragment) {
    }

    @NonNull
    @Override
    public NewInPremium.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.new_in_premium,parent,false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewInPremium.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
