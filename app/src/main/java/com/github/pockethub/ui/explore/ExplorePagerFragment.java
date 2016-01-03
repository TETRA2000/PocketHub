package com.github.pockethub.ui.explore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.github.pockethub.ui.TabPagerFragment;


public class ExplorePagerFragment extends TabPagerFragment<ExploreQueriesPagerAdapter> {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        configureTabPager();
    }

    @Override
    protected ExploreQueriesPagerAdapter createAdapter() {
        return new ExploreQueriesPagerAdapter(this);
    }
}
