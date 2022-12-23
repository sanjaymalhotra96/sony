package com.example.sonyliv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MenuFragment extends Fragment {

    RecyclerView recyclerView,recyclerView2;
    ProfileRecyclerview profileRecyclerview;
    VerticalRecyclerview verticalRecyclerview;
    LinearLayoutManager linearLayoutManager,linearLayoutManager2;
    RelativeLayout relativelayout;
    LinearLayout bottom;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        recyclerView=view.findViewById(R.id.profile_recyclerview);
        recyclerView2=view.findViewById(R.id.vertical_recyclerview);
        relativelayout=view.findViewById(R.id.relativelayout);
        bottom=getActivity().findViewById(R.id.bottom);

        profileRecyclerview=new ProfileRecyclerview(MenuFragment.this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(profileRecyclerview);


        verticalRecyclerview=new VerticalRecyclerview(MenuFragment.this);
        linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(verticalRecyclerview);

        relativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ManageProfile fnv = new ManageProfile();
                fragmentTransaction.replace(R.id.fragment, fnv).commit();
                bottom.setVisibility(View.INVISIBLE);
            }
        });

        return  view;
    }
}

