package com.example.instagramclone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {


        switch(i){
            case 0:
                return new fragment1();
            case 1:
                return new fragment2();
            case 2:
                return new fragment3();
            case 3:
                return new fragment4();
            case 4:
                return new fragment5();
            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
