package prachi14075.iiitd.ac.in.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ankur on 23-Jun-17.
 */

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder>{
    ArrayList<detail> details=new ArrayList<detail>();

    public DetailAdapter(ArrayList<detail> details)
    {
        this.details=details;
    }
    @Override
    public DetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.content_card,parent,false);
        DetailViewHolder detailViewHolder=new DetailViewHolder(view);
        return detailViewHolder;
    }

    @Override
    public void onBindViewHolder(DetailViewHolder holder, int position) {
        detail det=details.get(position);
        holder.detail.setText(det.getText());
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class DetailViewHolder extends RecyclerView.ViewHolder
    {
        TextView detail;
        public DetailViewHolder(View view)
        {
            super(view);
            detail=(TextView)view.findViewById(R.id.detail);
        }
    }
}
