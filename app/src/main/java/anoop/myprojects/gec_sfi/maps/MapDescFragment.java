package anoop.myprojects.gec_sfi.maps;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import anoop.myprojects.gec_sfi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapDescFragment extends Fragment {


    static int x=0;
    TextView t1,t2,t3;
    ImageView i1;
    String heading,desc;




    public MapDescFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //SecondFloor.count=0;

        x=1;

        //SecondFloor.view1.setEnabled(false);
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_map_desc, container, false);

        heading = getArguments().getString("heading");
        desc = getArguments().getString("desc");


        t1=view.findViewById(R.id.text);
        t2=view.findViewById(R.id.heading);
        t3 = view.findViewById(R.id.description);
        i1=view.findViewById(R.id.back);

        t2.setText(heading);
        t3.setText(desc);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });





        return view;
    }

}
