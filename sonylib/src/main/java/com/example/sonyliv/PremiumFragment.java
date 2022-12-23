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

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PremiumFragment extends Fragment {

    RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4,recyclerView5,recyclerView6,recyclerView7,recyclerView8;
    OriginalsAdaptor originalsAdaptor;
    CoomingSoon coomingSoon;
    NewInPremium newInPremium;
    TrendingRecyclerview trendingRecyclerview;
    WebSeriesAdaptor webSeriesAdaptor;
    OscarRecyclerview oscarRecyclerview;
    NothingRecyclerview nothingRecyclerview;
    SteelRecyclerview steelRecyclerview;
    LinearLayoutManager linearLayoutManager,linearLayoutManager2,linearLayoutManager3,linearLayoutManager4,linearLayoutManager5,linearLayoutManager6,linearLayoutManager7,linearLayoutManager8;
    FloatingActionButton floatingActionButton;
    ImageSlider imageSlider;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_premium, container, false);
        ArrayList imageList =new  ArrayList<SlideModel>();
        recyclerView=view.findViewById(R.id.originals_recyclerview);
        recyclerView2=view.findViewById(R.id.new_in_premium);
        recyclerView3=view.findViewById(R.id.comingsoon_recyclerview);
        recyclerView4=view.findViewById(R.id.web_series_recyclerview);
        recyclerView5=view.findViewById(R.id.trending_trailer_recyclerview);
        recyclerView6=view.findViewById(R.id.oscar_recyclerview);
        recyclerView7=view.findViewById(R.id.nothing_recyclerview);
        recyclerView8=view.findViewById(R.id.flick_recyclerview);
        floatingActionButton=view.findViewById(R.id.floatingActionButton2);

        imageList.add(new SlideModel("https://m.media-amazon.com/images/M/MV5BMmEzMTIzNzQtZmJmMi00MmFlLTliNDAtMzIwNWFhNmVkMzcxXkEyXkFqcGdeQXVyMTE0MzY0NjE1._V1_.jpg", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://images.ottplay.com/posters/46da27a62903cee7f3ffebaf39c624de.jpg",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://www.scrolldroll.com/wp-content/uploads/2021/02/Aashram-best-indian-web-series-on-mx-player.jpg",ScaleTypes.FIT));

        imageSlider =view.findViewById(R.id.image_slider) ;
        imageSlider.setImageList(imageList, ScaleTypes.FIT);
        imageSlider.startSliding(3000);


        originalsAdaptor=new OriginalsAdaptor(PremiumFragment.this);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(originalsAdaptor);

        newInPremium=new NewInPremium(PremiumFragment.this);
        linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(newInPremium);

        coomingSoon=new CoomingSoon(PremiumFragment.this);
        linearLayoutManager3=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView3.setAdapter(coomingSoon);


        webSeriesAdaptor=new WebSeriesAdaptor(PremiumFragment.this);
        linearLayoutManager4=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(linearLayoutManager4);
        recyclerView4.setAdapter(webSeriesAdaptor);

        trendingRecyclerview=new TrendingRecyclerview(PremiumFragment.this);
        linearLayoutManager5=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(linearLayoutManager5);
        recyclerView5.setAdapter(trendingRecyclerview);



        oscarRecyclerview=new OscarRecyclerview(PremiumFragment.this);
        linearLayoutManager6=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView6.setLayoutManager(linearLayoutManager6);
        recyclerView6.setAdapter(oscarRecyclerview);


        nothingRecyclerview=new NothingRecyclerview(PremiumFragment.this);
        linearLayoutManager7=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView7.setLayoutManager(linearLayoutManager7);
        recyclerView7.setAdapter(nothingRecyclerview);


        steelRecyclerview=new SteelRecyclerview(PremiumFragment.this);
        linearLayoutManager8=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView8.setLayoutManager(linearLayoutManager8);
        recyclerView8.setAdapter(steelRecyclerview);

        return  view;
    }
}
