package com.example.instagram_clone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdpater extends FragmentPagerAdapter {

    public ViewPagerAdpater(FragmentManager fm) {
        super(fm);
    }

    @Override //화면에 표출할 fragment를 결정하는 것
    public Fragment getItem(int i) {
        switch(i){
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

    @Override // fragment를 몇개 받을건가 즉 여기선 5
    public int getCount() {
        return 5;
    }
}
