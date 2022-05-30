package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Home();
            case 1:
                return new Sports();
            case 2:
                return new Health();
            case 3:
                return new Entertainment();
            case 4:
                return new Science();
            case 5:
                return new Technology();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
