package prachi14075.iiitd.ac.in.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CardFragment extends Fragment {

    private CardView cardView;

    public static Fragment getInstance(int position) {
        CardFragment f = new CardFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        f.setArguments(args);

        return f;
    }

    @SuppressLint("DefaultLocale")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_viewpager, container, false);

        cardView = (CardView) view.findViewById(R.id.cardView);
        cardView.setMaxCardElevation(cardView.getCardElevation() * CardAdapter.MAX_ELEVATION_FACTOR);

        TextView title = (TextView) view.findViewById(R.id.title);
        Button button = (Button)view.findViewById(R.id.button);

        title.setText(String.format("Card %d", getArguments().getInt("position")));
        title.setText(String.format("Card %d", getArguments().getInt("position")));
        if(getArguments().getInt("position")==0)
        {
            title.setText(String.format("ESYA'17 TECH EVENTS"));
            button.setText(String.format("ESYA'17 TECH EVENTS"));
        }
        else if(getArguments().getInt("position")==1)
        {
            title.setText(String.format("ESYA'17 NON-TECH EVENTS"));
            button.setText(String.format("ESYA'17 TECH EVENTS"));
        }
        else
        {
            title.setText(String.format("ESYA'17 Any other"));
            button.setText(String.format("ESYA'17 TECH EVENTS"));
        }

        button.setText(String.format("SEE LIST"));

        if(getArguments().getInt("position")==0)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "ESYA'17 TECH EVENTS", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if(getArguments().getInt("position")==1)
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "ESYA'17 NON-TECH EVENTS", Toast.LENGTH_SHORT).show();
                }
            });
        }
        else
        {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Any Other", Toast.LENGTH_SHORT).show();
                }
            });
        }
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "Button in Card " + getArguments().getInt("position")
//                        + "Clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;
    }

    public CardView getCardView() {
        return cardView;
    }
}
