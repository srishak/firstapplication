package com.srisha.firstapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs= NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TextFragment tab1 =new TextFragment();
                return tab1;
            case 1:
                AudioFragment tab2= new AudioFragment();
                return tab2;
            case 2:
                VideoFragment tab3= new VideoFragment();
            return tab3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}