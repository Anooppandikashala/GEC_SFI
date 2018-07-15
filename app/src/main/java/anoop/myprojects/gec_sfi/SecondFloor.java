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
public class SecondFloor extends Fragment {

    FragmentTransaction fragmentTransaction;
    static int count=0;

     static View view1;


    public SecondFloor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second_floor, container, false);
        view1=view.findViewById(R.id.map);
        count =0;

        view1.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {


                    fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                    fragmentTransaction.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_in_down, R.anim.slide_out_down, R.anim.slide_out_up);

                    MapDescFragment ldf = new MapDescFragment();
                    Bundle args = new Bundle();
                    args.putString("message", "enquery");
                    ldf.setArguments(args);


                    fragmentTransaction.add(R.id.main_container,ldf);
                    fragmentTransaction.commit();
                    count++;






            }
        });


        return view;
    }


}
