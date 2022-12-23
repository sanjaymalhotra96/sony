package com.example.sonyliv;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
ImageSlider imageSlider;

RecyclerView recyclerView,recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5;
LinearLayoutManager linearLayoutManager,linearLayoutManager1,linearLayoutManager2,linearLayoutManager3,linearLayoutManager4,linearLayoutManager5;
ContinueWatchingAdaptor continueWatchingAdaptor;
SportsAdaptor sportsAdaptor;
TodayHotAdaptor todayHotAdaptor;
AddonLive addonLive;
CardAdaptor cardAdaptor;
UpComingLive upComingLive;
ExtendedFloatingActionButton extendedFloatingActionButton;
NestedScrollView nestedScrollView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ArrayList imageList =new  ArrayList<SlideModel>();


        extendedFloatingActionButton=view.findViewById(R.id.floatingActionButton2);
        nestedScrollView=view.findViewById(R.id.nested);
        recyclerView=view.findViewById(R.id.continue_watching_recyclerview);
        recyclerView1=view.findViewById(R.id.trending_sports_recyclerview);
        recyclerView2=view.findViewById(R.id.today_hots_pick_recyclerview);
        recyclerView3=view.findViewById(R.id.new_on_liv_recyclerview);
        recyclerView4=view.findViewById(R.id.card_recyclerview);
        recyclerView5=view.findViewById(R.id.up_coming_on_live_recyclerview);
        extendedFloatingActionButton.setText("unSeen Pitches");
        extendedFloatingActionButton.setPadding(15,5,40,5);
        extendedFloatingActionButton.setTextAlignment(View.TEXT_ALIGNMENT_GRAVITY);
        extendedFloatingActionButton.setIconResource(R.drawable.ic___lessons_that_entrepreneurs_can_learn_from_shark_tank_india);
        extendedFloatingActionButton.setTextSize(12);
        extendedFloatingActionButton.setIconSize(100);
        extendedFloatingActionButton.setIconTint(ColorStateList.valueOf(Color.parseColor("#1F51FF")));



        nestedScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > oldScrollY + 12 && extendedFloatingActionButton.isExtended()) {
                    extendedFloatingActionButton.shrink();

                }

                // the delay of the extension of the FAB is set for 12 items
                if (scrollY < oldScrollY - 12 && !extendedFloatingActionButton.isExtended()) {
                    extendedFloatingActionButton.extend();
                }

                // if the nestedScrollView is at the first item of the list then the
                // extended floating action should be in extended state
                if (scrollY == 0) {
                    extendedFloatingActionButton.extend();
                }
            }
        });


        imageList.add(new SlideModel("https://images.moviesanywhere.com/b17b3aa07713067cffbed0b1b148d4c8/5f0760c5-1a61-45d5-b7dc-7bcd229c00c5.jpg",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://m.media-amazon.com/images/S/pv-target-images/4afcd795fa1b7825ed89e6aefbd1c7a33c077e6a4f18ea8bbbe4f3e90706af9e._UR1920,1080_.jpg",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://bit.ly/3fLJf72",ScaleTypes.FIT));

         imageSlider =view.findViewById(R.id.image_slider) ;
        imageSlider.setImageList(imageList, ScaleTypes.FIT);
        imageSlider.startSliding(3000);


        continueWatchingAdaptor=new ContinueWatchingAdaptor(HomeFragment.this);
        linearLayoutManager=new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(continueWatchingAdaptor);

        sportsAdaptor=new SportsAdaptor(HomeFragment.this);
        linearLayoutManager1=new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(sportsAdaptor);

        todayHotAdaptor=new TodayHotAdaptor(HomeFragment.this);
        linearLayoutManager2=new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(todayHotAdaptor);

        addonLive=new AddonLive(HomeFragment.this);
        linearLayoutManager3=new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView3.setAdapter(addonLive);

        cardAdaptor=new CardAdaptor(HomeFragment.this);
        linearLayoutManager4=new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(linearLayoutManager4);
        recyclerView4.setAdapter(cardAdaptor);

        upComingLive=new UpComingLive(HomeFragment.this);
        linearLayoutManager5=new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(linearLayoutManager5);
        recyclerView5.setAdapter(upComingLive);

        return  view;
    }
}
