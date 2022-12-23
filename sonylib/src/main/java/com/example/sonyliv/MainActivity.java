package com.example.sonyliv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    TabRecyclerview tabRecyclerview;
    LinearLayout home,search_tab,crown_tab,list_tab,menu_tab,bottom;
    View fragment;
    ImageView home_icon,search_icon,premium_icon,plus_icon,menu_icon;
    TextView home_text,search_text,premium_text,plus_text,menu_text;
    ExtendedFloatingActionButton extendedFloatingActionButton;
    AppBarLayout appBarLayout;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        // hideSystemBars();

        recyclerView=findViewById(R.id.recyclerview);
        appBarLayout=findViewById(R.id.abl);
        home=findViewById(R.id.home_tab);
        fragment=findViewById(R.id.fragment);
        search_tab=findViewById(R.id.search_tab);
        crown_tab=findViewById(R.id.crown_tab);
        list_tab=findViewById(R.id.list_tab);
        menu_tab=findViewById(R.id.menu_tab);
        home_icon=findViewById(R.id.home_icon);
        search_icon=findViewById(R.id.search_icon);
        premium_icon=findViewById(R.id.crown_icon);
        plus_icon=findViewById(R.id.plus_icon);
        menu_icon=findViewById(R.id.menu_icon);
        home_text=findViewById(R.id.home_text);
        search_text=findViewById(R.id.search_text);
        premium_text=findViewById(R.id.crown_text);
        plus_text=findViewById(R.id.plus_text);
        menu_text=findViewById(R.id.menu_text);
        bottom=findViewById(R.id.bottom);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HomeFragment fnv = new HomeFragment();
        fragmentTransaction.replace(R.id.fragment, fnv).commit();
        bottom.setVisibility(View.VISIBLE);
        home_icon.setColorFilter(getColor(R.color.orange));
        home_text.setTextColor(getColor(R.color.orange));
        search_icon.setColorFilter(getColor(R.color.view));
        search_text.setTextColor(getColor(R.color.view));
        premium_icon.setColorFilter(getColor(R.color.view));
        premium_text.setTextColor(getColor(R.color.view));
        plus_icon.setColorFilter(getColor(R.color.view));
        plus_text.setTextColor(getColor(R.color.view));
        menu_icon.setColorFilter(getColor(R.color.view));
        menu_text.setTextColor(getColor(R.color.view));



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                HomeFragment fnv = new HomeFragment();
                appBarLayout.setVisibility(View.VISIBLE);
                bottom.setVisibility(View.VISIBLE);
                fragmentTransaction.replace(R.id.fragment, fnv).commit();
                home_icon.setColorFilter(getColor(R.color.orange));
                home_text.setTextColor(getColor(R.color.orange));
                search_icon.setColorFilter(getColor(R.color.view));
                search_text.setTextColor(getColor(R.color.view));
                premium_icon.setColorFilter(getColor(R.color.view));
                premium_text.setTextColor(getColor(R.color.view));
                plus_icon.setColorFilter(getColor(R.color.view));
                plus_text.setTextColor(getColor(R.color.view));
                menu_icon.setColorFilter(getColor(R.color.view));
                menu_text.setTextColor(getColor(R.color.view));


            }
        });
        search_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SearchFragment fnv1 = new SearchFragment();
                fragmentTransaction.replace(R.id.fragment, fnv1).commit();
                appBarLayout.setVisibility(View.INVISIBLE);
                bottom.setVisibility(View.VISIBLE);
                home_icon.setColorFilter(getColor(R.color.view));
                home_text.setTextColor(getColor(R.color.view));
                search_icon.setColorFilter(getColor(R.color.orange));
                search_text.setTextColor(getColor(R.color.orange));
                premium_icon.setColorFilter(getColor(R.color.view));
                premium_text.setTextColor(getColor(R.color.view));
                plus_icon.setColorFilter(getColor(R.color.view));
                plus_text.setTextColor(getColor(R.color.view));
                menu_icon.setColorFilter(getColor(R.color.view));
                menu_text.setTextColor(getColor(R.color.view));
            }
        });

        crown_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                PremiumFragment fnv1 = new PremiumFragment();
                fragmentTransaction.replace(R.id.fragment, fnv1).commit();
                appBarLayout.setVisibility(View.INVISIBLE);
                bottom.setVisibility(View.VISIBLE);
                home_icon.setColorFilter(getColor(R.color.view));
                home_text.setTextColor(getColor(R.color.view));
                search_icon.setColorFilter(getColor(R.color.view));
                search_text.setTextColor(getColor(R.color.view));
                premium_icon.setColorFilter(getColor(R.color.orange));
                premium_text.setTextColor(getColor(R.color.orange));
                plus_icon.setColorFilter(getColor(R.color.view));
                plus_text.setTextColor(getColor(R.color.view));
                menu_icon.setColorFilter(getColor(R.color.view));
                menu_text.setTextColor(getColor(R.color.view));
            }
        });
        list_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ListtFragment fnv1 = new ListtFragment();
                fragmentTransaction.replace(R.id.fragment, fnv1).commit();
                appBarLayout.setVisibility(View.INVISIBLE);
                bottom.setVisibility(View.VISIBLE);
                home_icon.setColorFilter(getColor(R.color.view));
                home_text.setTextColor(getColor(R.color.view));
                search_icon.setColorFilter(getColor(R.color.view));
                search_text.setTextColor(getColor(R.color.view));
                premium_icon.setColorFilter(getColor(R.color.view));
                premium_text.setTextColor(getColor(R.color.view));
                plus_icon.setColorFilter(getColor(R.color.orange));
                plus_text.setTextColor(getColor(R.color.orange));
                menu_icon.setColorFilter(getColor(R.color.view));
                menu_text.setTextColor(getColor(R.color.view));
            }
        });
        menu_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                MenuFragment fnv1 = new MenuFragment();
                fragmentTransaction.replace(R.id.fragment, fnv1).commit();
                appBarLayout.setVisibility(View.INVISIBLE);
                bottom.setVisibility(View.VISIBLE);
                home_icon.setColorFilter(getColor(R.color.view));
                home_text.setTextColor(getColor(R.color.view));
                search_icon.setColorFilter(getColor(R.color.view));
                search_text.setTextColor(getColor(R.color.view));
                premium_icon.setColorFilter(getColor(R.color.view));
                premium_text.setTextColor(getColor(R.color.view));
                plus_icon.setColorFilter(getColor(R.color.view));
                plus_text.setTextColor(getColor(R.color.view));
                menu_icon.setColorFilter(getColor(R.color.orange));
                menu_text.setTextColor(getColor(R.color.orange));
            }
        });

        tabRecyclerview= new TabRecyclerview(MainActivity.this);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(tabRecyclerview);

    }

    /*private void hideSystemBars() {
        View decorView = getWindow().getDecorView();
        WindowInsetsController windowInsetsController = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            windowInsetsController = decorView.getWindowInsetsController();
        }
        if (windowInsetsController == null) {
            return;
        }
        // Configure the behavior of the hidden system bars
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            windowInsetsController.setSystemBarsBehavior(
                    WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            );
        }
        // Hide both the status bar and the navigation bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {

            windowInsetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.statusBars());
        }
    }*/
}