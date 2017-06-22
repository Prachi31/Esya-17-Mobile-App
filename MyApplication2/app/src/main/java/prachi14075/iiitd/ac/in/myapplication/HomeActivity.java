package prachi14075.iiitd.ac.in.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button evnt = (Button) findViewById(R.id.evnt);

        evnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getApplicationContext(), esya_events.class);
                startActivity(homeIntent);
            }
        });

        Button evnt2 = (Button) findViewById(R.id.evnt2);

        evnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getApplicationContext(), events_page.class);
                startActivity(homeIntent);
            }
        });

        Button evnt3 = (Button) findViewById(R.id.evnt3);

        evnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(homeIntent);
            }
        });

        Button evnt4 = (Button) findViewById(R.id.evnt4);

        evnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(homeIntent);
            }
        });


        Button evnt5 = (Button) findViewById(R.id.evnt5);

        evnt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getApplicationContext(), event5.class);
                startActivity(homeIntent);
            }
        });

        Button edp = (Button) findViewById(R.id.edp);

        edp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(getApplicationContext(), event_detail2.class);
                startActivity(homeIntent);
            }
        });
    }
}
