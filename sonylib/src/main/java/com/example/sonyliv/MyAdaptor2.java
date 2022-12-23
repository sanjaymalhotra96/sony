package com.example.sonyliv;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdaptor2 extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;




    public MyAdaptor2(Context context, androidx.fragment.app.FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = context;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                WatchListFragment watchListFragment = new WatchListFragment();
                return watchListFragment;
            case 1:
                InterestsFragment interestsFragment = new InterestsFragment();
                return interestsFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}