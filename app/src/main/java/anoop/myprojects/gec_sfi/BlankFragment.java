package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    SessionManager session;
    Button okGotIt;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        session = new SessionManager(getContext());
        //session.createLoginSession("anoop", "anoopp","1000");
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        return view;
    }

}
