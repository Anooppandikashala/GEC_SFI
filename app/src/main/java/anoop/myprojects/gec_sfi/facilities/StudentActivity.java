package anoop.myprojects.gec_sfi.facilities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import anoop.myprojects.gec_sfi.R;
import anoop.myprojects.gec_sfi.student_activity.Iedc;
import anoop.myprojects.gec_sfi.student_activity.Ieee;
import anoop.myprojects.gec_sfi.student_activity.NSS;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudentActivity extends Fragment {

    TextView nss,ieee,iedc;


    public StudentActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student, container, false);

        nss= view.findViewById(R.id.nss);
        ieee=view.findViewById(R.id.iee);
        iedc=view.findViewById(R.id.iedc);

        nss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), NSS.class);
                startActivity(intent);
            }
        });
        ieee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Ieee.class);
                startActivity(intent);
            }
        });
        iedc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Iedc.class);
                startActivity(intent);
            }
        });



        return view;
    }

}
