package com.hello;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewPagerAdapter extends FragmentStateAdapter{
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new GameFragment();
            case 1:
                return new MovieFragment();
            case 2:
                return new ChatFragment();
            default:
                return new GameFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
