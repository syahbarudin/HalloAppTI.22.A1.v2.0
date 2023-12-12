package com.hello;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class FragActivity extends AppCompatActivity{

    ViewPager2 viewPager2 ;
    MyViewPagerAdapter myViewPagerAdapter;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_activity);

        viewPager2 = findViewById(R.id.view_pager);
       tabLayout = findViewById(R.id.tablayout);
       myViewPagerAdapter = new MyViewPagerAdapter(this);
       viewPager2.setAdapter(myViewPagerAdapter);

       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               viewPager2.setCurrentItem(tab.getPosition());
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });
       viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
           @Override
           public void onPageSelected(int position) {
               super.onPageSelected(position);
               tabLayout.getTabAt(position).select();
           }
       });
    }


}
