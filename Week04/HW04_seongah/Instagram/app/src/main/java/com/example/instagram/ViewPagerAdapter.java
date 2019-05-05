package com.example.instagram;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.instagram.Fragment1;
import com.example.instagram.Fragment2;
import com.example.instagram.Fragment3;
import com.example.instagram.Fragment4;
import com.example.instagram.Fragment5;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            case 3:
                return new Fragment4();
            case 4:
                return new Fragment5();
        }
        return new Fragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}