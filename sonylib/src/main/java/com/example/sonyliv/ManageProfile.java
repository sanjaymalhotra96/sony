package com.example.sonyliv;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.google.android.material.appbar.AppBarLayout;

public class ManageProfile  extends Fragment {

    ImageView imageView;
    ImageView home_icon,search_icon,premium_icon,plus_icon,menu_icon,edit_image;
    TextView home_text,search_text,premium_text,plus_text,menu_text,edit_text,text_label;
    AppBarLayout appBarLayout;
    LinearLayout bottom;
   RelativeLayout edit_layout;
    RecyclerView recyclerView;
    ManageProfileAdaptor manageProfileAdaptor;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.manage_profile,container,false);
        imageView=view.findViewById(R.id.back_button);
        appBarLayout=getActivity().findViewById(R.id.abl);
        bottom=getActivity().findViewById(R.id.bottom);
        home_icon=getActivity().findViewById(R.id.home_icon);
        search_icon=getActivity().findViewById(R.id.search_icon);
        premium_icon=getActivity().findViewById(R.id.crown_icon);
        plus_icon=getActivity().findViewById(R.id.plus_icon);
        menu_icon=getActivity().findViewById(R.id.menu_icon);
        home_text=getActivity().findViewById(R.id.home_text);
        search_text=getActivity().findViewById(R.id.search_text);
        premium_text=getActivity().findViewById(R.id.crown_text);
        plus_text=getActivity().findViewById(R.id.plus_text);
        menu_text=getActivity().findViewById(R.id.menu_text);
        recyclerView=view.findViewById(R.id.manage_profile);
        edit_layout=view.findViewById(R.id.edit_layout);
        edit_image=view.findViewById(R.id.edit_image);
        edit_text=view.findViewById(R.id.edit_text);
        edit_text.setVisibility(view.VISIBLE);
        text_label=view.findViewById(R.id.text_label);


        String text = "<font color=#696969>You can setup up to</font> "+
                "<font color=#ffffff>5 profiles</font>"+"<font color=#696969> for you family or friends</font>";
        text_label.setGravity(2);
        text_label.setPadding(80,20,20,20);
        text_label.setText(Html.fromHtml(text));

        edit_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_image.setVisibility(View.INVISIBLE);
                edit_text.setText("Done");
            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                MenuFragment fnv1 = new MenuFragment();
                fragmentTransaction.replace(R.id.fragment, fnv1).commit();
                appBarLayout.setVisibility(View.INVISIBLE);
                bottom.setVisibility(View.VISIBLE);
                home_icon.setColorFilter(getActivity().getColor(R.color.view));
                home_text.setTextColor(getActivity().getColor(R.color.view));
                search_icon.setColorFilter(getActivity().getColor(R.color.view));
                search_text.setTextColor(getActivity().getColor(R.color.view));
                premium_icon.setColorFilter(getActivity().getColor(R.color.view));
                premium_text.setTextColor(getActivity().getColor(R.color.view));
                plus_icon.setColorFilter(getActivity().getColor(R.color.view));
                plus_text.setTextColor(getActivity().getColor(R.color.view));
                menu_icon.setColorFilter(getActivity().getColor(R.color.orange));
                menu_text.setTextColor(getActivity().getColor(R.color.orange));
            }
        });


        manageProfileAdaptor=new ManageProfileAdaptor(ManageProfile.this);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(manageProfileAdaptor);

        return  view;
    }
}
