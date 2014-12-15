package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sunny on 12/15/2014.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                //recent posts
            case 1:
                //general photography
            case 2:
                //landscape photography
            case 3:
                //portrait photography
            case 4:
                //candid photography
            case 5:
                //mobile photography

        }
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }
}
