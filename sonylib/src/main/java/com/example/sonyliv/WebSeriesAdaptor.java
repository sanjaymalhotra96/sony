package com.example.sonyliv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WebSeriesAdaptor extends RecyclerView.Adapter<WebSeriesAdaptor.MyViewHolder> {
    public WebSeriesAdaptor(PremiumFragment premiumFragment) {
    }

    @NonNull
    @Override
    public WebSeriesAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
   View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.web_series_recyclerview,parent,false);
   return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WebSeriesAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
