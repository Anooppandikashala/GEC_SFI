package anoop.myprojects.gec_sfi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import anoop.myprojects.gec_sfi.data_models.DataModelNews;

/**
 * Created by anoop on 6/15/18.
 */

public class CustomAdapterNews extends RecyclerView.Adapter<CustomAdapterNews.MyViewHolder> {

    private ArrayList<DataModelNews> dataSet;
    Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewid;
        ImageView imageViewNews;
        TextView textViewVersion;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewid = (TextView) itemView.findViewById(R.id.textViewid);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewNews =itemView.findViewById(R.id.imageViewNews);
        }
    }

    public CustomAdapterNews(Context context,ArrayList<DataModelNews> data) {
        this.dataSet = data;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout_news, parent, false);

        view.setOnClickListener(EventList.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewid = holder.textViewid;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewNews;

        textViewName.setText(dataSet.get(listPosition).getName());
        textViewid.setText(String.valueOf(dataSet.get(listPosition).getId()));
        textViewVersion.setText(dataSet.get(listPosition).getVersion());

        Picasso.with(context).load(dataSet.get(listPosition).getName()) //Load the image
                .placeholder(R.mipmap.ic_launcher_round) //Image resource that act as placeholder
                .error(R.drawable.ic_bus_1) //Image resource for error
                .into(imageView);
        //imageView.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
