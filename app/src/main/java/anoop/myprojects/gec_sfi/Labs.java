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
public class Labs extends Fragment {

    TextView cse,me,it,ec,eee,general;


    public Labs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_labs, container, false);

        cse=(TextView)view.findViewById(R.id.cselab);
        me=(TextView)view.findViewById(R.id.melab);
        it=(TextView)view.findViewById(R.id.itlab);
        ec=(TextView)view.findViewById(R.id.ecelab);
        eee=(TextView)view.findViewById(R.id.eeelab);
        general=(TextView)view.findViewById(R.id.general);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),CSELab.class);
                startActivity(intent);
            }
        });

        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),ECELab.class);
                startActivity(intent);
            }
        });



        return  view;
    }

}
