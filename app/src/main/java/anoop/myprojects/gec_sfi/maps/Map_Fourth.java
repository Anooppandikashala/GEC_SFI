package anoop.myprojects.gec_sfi.maps;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Map_Fourth extends Fragment {


    public Map_Fourth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_map__fourth, container, false);
        ImageView info;

        info =view.findViewById(R.id.infoMap);

        /*info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),LHandDormetry.class);
                startActivity(intent);
            }
        });*/


        return view;
    }

}
