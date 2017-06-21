package prachi14075.iiitd.ac.in.myapplication;

/**
 * Created by ankur on 21-Jun-17.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import prachi14075.iiitd.ac.in.myapplication.CardStackFragment;

public class CardStackAdapter extends FragmentStatePagerAdapter
{
    public CardStackAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new CardStackFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
