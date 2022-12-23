package com.example.sonyliv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class SearchFragment extends Fragment {

    RecyclerView recyclerView;
    StaggeredGridLayoutManager staggeredGridLayoutManager;
    TopNewSearchesRecyclerview topNewSearchesRecyclerview;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView=view.findViewById(R.id.top_searches_recyclerview);

        topNewSearchesRecyclerview=new TopNewSearchesRecyclerview(SearchFragment.this);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(topNewSearchesRecyclerview);

        return  view;
    }
}
