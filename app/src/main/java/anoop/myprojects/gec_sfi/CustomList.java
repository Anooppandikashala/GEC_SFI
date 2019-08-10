package anoop.myprojects.gec_sfi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anoop on 6/26/18.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] Title;
    private final String[] Name;
    private final String[] Mob;
    private final Integer[] imageId;
    public CustomList(Activity context,
                      String[] title,String[] name,String[] mob, Integer[] imageId) {
        super(context, R.layout.list_single,title);
        this.context = context;
        this.Title = title;
        this.Name = name;
        this.Mob = mob;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.position);
        TextView txtName = (TextView) rowView.findViewById(R.id.name);
        TextView txtMob = (TextView) rowView.findViewById(R.id.mob);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.usr);


        txtTitle.setText(Title[position]);
        txtName.setText(Name[position]);
        txtMob.setText(Mob[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
