package anoop.myprojects.gec_sfi.facilities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import anoop.myprojects.gec_sfi.R;
import anoop.myprojects.gec_sfi.facilities.PrivateMensHostelShowMore;


/**
 * A simple {@link Fragment} subclass.
 */
public class MensHostel extends Fragment {

    TextView t1;


    public MensHostel() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mens_hostel, container, false);

        t1 = view.findViewById(R.id.menshostel);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(), PrivateMensHostelShowMore.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
