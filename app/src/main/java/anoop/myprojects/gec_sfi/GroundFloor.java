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
        // Inflate the layout for this fragment
        View view=null;
        try {
            view = inflater.inflate(R.layout.fragment_ground_floor, container, false);

            part1 = view.findViewById(R.id.part1);

            part2 = view.findViewById(R.id.part2);

            part1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                    fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

                    GroundFloorPartOne ldf = new GroundFloorPartOne();
                    Bundle args = new Bundle();
                    args.putString("message", "enquery");
                    ldf.setArguments(args);


                    fragmentTransaction.replace(R.id.main_container, ldf);
                    fragmentTransaction.commit();

                }
            });

            part2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                    fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

                    GroundFloorPartTwo ldf = new GroundFloorPartTwo();
                    Bundle args = new Bundle();
                    args.putString("message", "enquery");
                    ldf.setArguments(args);


                    fragmentTransaction.replace(R.id.main_container, ldf);
                    fragmentTransaction.commit();

                }
            });

            return view;

        }
        catch (Exception e){

            e.printStackTrace();
        }






        return view;
    }

}
