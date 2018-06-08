package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BusTime extends Fragment {

    TextView tvclg,tvline;


    public BusTime() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_bus_time, container, false);

       tvclg = view.findViewById(R.id.colegebuses);
       tvline=view.findViewById(R.id.linebuses);

       tvclg.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getContext(),CollegeBus.class);
               startActivity(intent);

           }
       });

        tvline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),CollegeBus.class);
                startActivity(intent);


            }
        });



       return  view;
    }

}
