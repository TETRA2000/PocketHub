package com.github.pockethub.ui.explore;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import com.github.pockethub.R;
import com.github.pockethub.ui.FragmentPagerAdapter;


public class ExploreQueriesPagerAdapter extends FragmentPagerAdapter {
    private final Resources resources;

    public ExploreQueriesPagerAdapter(Fragment fragment) {
        super(fragment);

        resources = fragment.getResources();
    }

    @Override
    public Fragment getItem(int position) {
        return new Fragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
        case 0:
            return resources.getString(R.string.tab_trending);
        default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
