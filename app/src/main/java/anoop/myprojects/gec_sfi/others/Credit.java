package anoop.myprojects.gec_sfi.others;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import anoop.myprojects.gec_sfi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Credit extends Fragment {


    public Credit() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_credit, container, false);
    }

}
