package com.example.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ViewPager viewPager;
    ViewPagerAdapter adapter;
    TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.homeout));
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.searchout));
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.plus));
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.heartout));
        tablayout.addTab(tablayout.newTab().setIcon(R.drawable.personout));


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                switch(tab.getPosition())
                {
                    case(0) :
                        tab.setIcon(R.drawable.homein);
                        break;
                    case(1) :
                        tab.setIcon(R.drawable.searchin);
                        break;
                    case(3) :
                        tab.setIcon(R.drawable.heartin);
                        break;
                    case(4) :
                        tab.setIcon(R.drawable.personin);
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch(tab.getPosition())
                {
                    case(0) :
                        tab.setIcon(R.drawable.homeout);
                        break;
                    case(1) :
                        tab.setIcon(R.drawable.searchout);
                        break;
                    case(3) :
                        tab.setIcon(R.drawable.heartout);
                        break;
                    case(4) :
                        tab.setIcon(R.drawable.personout);
                        break;

                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                switch(tab.getPosition())
                {
                    case(0) :
                        tab.setIcon(R.drawable.homein);
                        break;
                    case(1) :
                        tab.setIcon(R.drawable.searchin);
                        break;
                    case(3) :
                        tab.setIcon(R.drawable.heartin);
                        break;
                    case(4) :
                        tab.setIcon(R.drawable.personin);
                        break;

                }
            }
        });
        //Toast.makeText(getApplicationContext(),"OnCreate!!",Toast.LENGTH_SHORT).show();

    }




    @Override
    public void onClick(View v) {

    }
}
