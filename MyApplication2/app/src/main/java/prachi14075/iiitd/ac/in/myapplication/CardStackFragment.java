package prachi14075.iiitd.ac.in.myapplication;

/**
 * Created by ankur on 21-Jun-17.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import prachi14075.iiitd.ac.in.myapplication.R;

public class CardStackFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_card,null);
    }
}
