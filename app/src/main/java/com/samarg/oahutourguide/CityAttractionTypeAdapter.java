package com.samarg.oahutourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class CityAttractionTypeAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public CityAttractionTypeAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        }  else {
            return new BarsClubsFragment();
        }

    }


    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_1);
        } else if (position == 1) {
            return mContext.getString(R.string.category_2);
        } else if (position == 2) {
            return mContext.getString(R.string.category_3);
        } else {
            return mContext.getString(R.string.category_4);
        }
    }

}
