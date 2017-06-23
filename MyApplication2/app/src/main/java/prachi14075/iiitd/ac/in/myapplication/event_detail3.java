package prachi14075.iiitd.ac.in.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class event_detail3 extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] text=new String[5];
    ArrayList<detail> list=new ArrayList<detail>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail3);
        text[0]="1 am to 5 am 45 august";
        text[1]="IIITD";
        text[2]="Rules";
        text[3]="Registration Deadline";
        text[4]="Something";
        for( String i:text)
        {
            detail det=new detail(i);
            list.add(det);
        }
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter=new DetailAdapter(list);
        recyclerView.setAdapter(adapter);

    }
}
