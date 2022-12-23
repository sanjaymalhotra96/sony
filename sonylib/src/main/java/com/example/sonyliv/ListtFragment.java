package com.example.sonyliv;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class ListtFragment  extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView back_button;
    ImageView home_icon,search_icon,premium_icon,plus_icon,menu_icon,edit_image;
    TextView home_text,search_text,premium_text,plus_text,menu_text,edit_text;
    RelativeLayout relativeLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        tabLayout=view.findViewById(R.id.tabLayout);
        viewPager=view.findViewById(R.id.viewPager);
        back_button=view.findViewById(R.id.back_button);
        tabLayout.addTab(tabLayout.newTab().setText("Watchlist"));
        tabLayout.addTab(tabLayout.newTab().setText("Interests"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
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
        edit_image=view.findViewById(R.id.edit_image);
        edit_text=view.findViewById(R.id.edit_text);
        relativeLayout=view.findViewById(R.id.edit_layout);
        edit_text.setVisibility(view.VISIBLE);


        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                HomeFragment fnv = new HomeFragment();
                fragmentTransaction.replace(R.id.fragment, fnv).commit();
                home_icon.setColorFilter(getActivity().getColor(R.color.orange));
                home_text.setTextColor(getActivity().getColor(R.color.orange));
                search_icon.setColorFilter(getActivity().getColor(R.color.view));
                search_text.setTextColor(getActivity().getColor(R.color.view));
                premium_icon.setColorFilter(getActivity().getColor(R.color.view));
                premium_text.setTextColor(getActivity().getColor(R.color.view));
                plus_icon.setColorFilter(getActivity().getColor(R.color.view));
                plus_text.setTextColor(getActivity().getColor(R.color.view));
                menu_icon.setColorFilter(getActivity().getColor(R.color.view));
                menu_text.setTextColor(getActivity().getColor(R.color.view));

            }
        });


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_image.setVisibility(View.INVISIBLE);
                edit_text.setText("Done");
            }
        });


        final MyAdaptor2 adapter = new MyAdaptor2(getContext(),getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
               /* int tabIconColor = ContextCompat.getColor(Facebook.this, R.color.facebook);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);*/

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return  view;
    }
}
