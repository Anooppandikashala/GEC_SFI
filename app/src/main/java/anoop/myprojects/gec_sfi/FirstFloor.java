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
public class FirstFloor extends Fragment {

    View part1,part2;
    FragmentTransaction fragmentTransaction;


    public FirstFloor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MapActivity.count=3;


        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first_floor, container, false);

        MapActivity.floatingActionButton2.setImageResource(R.drawable.ic_1);


        return view;
    }

}
