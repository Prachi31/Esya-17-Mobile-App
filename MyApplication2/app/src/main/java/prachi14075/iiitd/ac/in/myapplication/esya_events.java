package prachi14075.iiitd.ac.in.myapplication;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import prachi14075.iiitd.ac.in.myapplication.R;
import prachi14075.iiitd.ac.in.myapplication.CardStackAdapter;

public class esya_events extends AppCompatActivity
{

    private ViewPager mPager ;

    private CardStackAdapter mAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_esya_events);

        mPager = (ViewPager) findViewById(R.id.viewPager);

        mAdapter = new CardStackAdapter(getSupportFragmentManager());

        mPager.setPageTransformer(true, new CardStackTransformer());

        mPager.setOffscreenPageLimit(3);

        mPager.setAdapter(mAdapter);
    }

    private class CardStackTransformer implements ViewPager.PageTransformer
    {
        @Override
        public void transformPage(View page, float position)
        {
            if(position>=0)
            {
                page.setScaleX(0.8f - 0.02f * position);

                page.setScaleY(0.8f);

                page.setTranslationX(- page.getWidth()*position);

                page.setTranslationY(30 * position);
            }

        }
    }
}
