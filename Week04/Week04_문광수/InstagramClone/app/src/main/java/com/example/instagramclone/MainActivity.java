package com.example.instagramclone;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    ViewPagerAdapter adapter;
    TabLayout mTabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager)findViewById(R.id.viewPager);
//        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //getSupportfragmentManager == fragmentmanager를 담당하고 있는 애가 누구냐고 넣어주는 것?? 이 액티비티의 프래그먼트 담당자를 불러오는 것.
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));


        mTabLayout = (TabLayout) findViewById(R.id.tabs);

        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tab_home));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tab_search));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tab_add));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tab_heart));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tab_person));


        //addPageChangeListener(OnPageChangeListner listener)
        //ViewPager의 페이지가 변경될 때 알려주는 리스너. 예제에서는 TabLayoutOnpagerChangeListener(TabLayout tablLayout)
        //을 이요하여, ViewPager의 페이지가 변경 될 때 TabLayout에도 알려주도록 설정하였다.
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        /*
        * addOnTabSelectedListener(OnTabSelectedListener listener)
        Tab이 선택 되었을 때 알려주는 리스너입니다. 추가하면 다시, Override 메서드가 3가지가 있습니다.
        */
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

}
