package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFloorPartOne extends Fragment {

    FragmentTransaction fragmentTransaction;
    ImageView info;


    public FirstFloorPartOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first_floor_part_one, container, false);

        info =view.findViewById(R.id.infoMap);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),FirstFloorPartOneDesc.class);
                startActivity(intent);
            }
        });




        /*view18.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {


                fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                fragmentTransaction.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_in_down, R.anim.slide_out_down, R.anim.slide_out_up);

                MapDescFragment ldf = new MapDescFragment();
                Bundle args = new Bundle();
                args.putString("heading", "CSE Lab");
                args.putString("desc", "lab of cse dept");
                ldf.setArguments(args);


                fragmentTransaction.add(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });*/

        return view;
    }

}
