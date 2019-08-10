package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class GroundFloor extends Fragment {

    View part1,part2;
    FragmentTransaction fragmentTransaction;


    public GroundFloor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MapActivity.count=2;
        // Inflate the layout for this fragment
        View view;
            view = inflater.inflate(R.layout.fragment_ground_floor, container, false);

        MapActivity.floatingActionButton1.setImageResource(R.drawable.ic_4);

            return view;

    }

}
