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

        cse=(TextView)view.findViewById(R.id.ccf);
        me=(TextView)view.findViewById(R.id.melab);
        it=(TextView)view.findViewById(R.id.ccf);
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
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),EEELab.class);
                startActivity(intent);
            }
        });
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),ITLab.class);
                startActivity(intent);
            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),MELab.class);
                startActivity(intent);
            }
        });
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),GeneralLab.class);
                startActivity(intent);
            }
        });



        return  view;
    }

}
