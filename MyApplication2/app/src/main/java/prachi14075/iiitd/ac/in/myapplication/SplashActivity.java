package prachi14075.iiitd.ac.in.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent openNextActivityIntent;
//            if(utils.isUserLoggedIn()){
        openNextActivityIntent = new Intent(SplashActivity.this,MainActivity.class);
//            } else {
//                openNextActivityIntent = new Intent(SplashActivity.this,EventsActivity.class);
//            }
        startActivity(openNextActivityIntent);
//        }
        finish();
    }
}
