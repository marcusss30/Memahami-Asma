package com.example.tarokawada.memahamiasma;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by tarokawada on 10/03/2016.
 */
public class ViewPageAdapter2 extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public ViewPageAdapter2(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MalayInfo tab1 = new MalayInfo();
                return tab1;
            case 1:
                MalayFAQ tab2 = new MalayFAQ();
                return tab2;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}