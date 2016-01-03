package com.github.pockethub.ui.explore;

import android.app.Activity;

import java.util.Collection;
import com.github.pockethub.R;
import org.eclipse.egit.github.core.Repository;
import com.github.kevinsawicki.wishlist.SingleTypeAdapter;

public class ExploreListAdapter extends SingleTypeAdapter<Repository> {
    public ExploreListAdapter(Activity activity,
            Collection<Repository> elements) {
        // TODO: fix
        super(activity, R.layout.gist_item);

        setItems(elements);
    }

    @Override
    protected int[] getChildViewIds() {
        return new int[0];
    }

    @Override
    protected void update(int i, Repository repository) {

    }
}
