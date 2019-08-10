package anoop.myprojects.gec_sfi;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anoop on 6/15/18.
 */

public class CustomAdapterNotification extends RecyclerView.Adapter<CustomAdapterNotification.MyViewHolder> {

    private ArrayList<DataModelNotification> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewid;
        TextView textViewVersion;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewid = (TextView) itemView.findViewById(R.id.textViewid);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
        }
    }

    public CustomAdapterNotification(ArrayList<DataModelNotification> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout_noti, parent, false);

        view.setOnClickListener(EventList.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewid = holder.textViewid;
        TextView textViewVersion = holder.textViewVersion;

        textViewName.setText(dataSet.get(listPosition).getName());
        textViewid.setText(String.valueOf(dataSet.get(listPosition).getId()));
        textViewVersion.setText(dataSet.get(listPosition).getVersion());
        Linkify.addLinks(textViewVersion, Linkify.PHONE_NUMBERS|Linkify.WEB_URLS);
        textViewVersion.setLinkTextColor(Color.parseColor("#2f6699"));
        //imageView.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
