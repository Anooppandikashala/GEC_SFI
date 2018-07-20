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
public class FirstFloor2 extends Fragment {

    FragmentTransaction fragmentTransaction;
    View view1,view2;
    String value;


    public FirstFloor2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_floor2, container, false);

        view1=view.findViewById(R.id.ladiestoilet);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);
        view2=view.findViewById(R.id.ecelab1);



        view1.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {


                fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                fragmentTransaction.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_in_down, R.anim.slide_out_down, R.anim.slide_out_up);

                MapDescFragment ldf = new MapDescFragment();
                Bundle args = new Bundle();
                args.putString("heading", "Ladies Toilet");
                args.putString("desc", "Wash room for Girls");
                ldf.setArguments(args);


                fragmentTransaction.add(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });

        view2.setOnClickListener(new View.OnClickListener() {



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
        });

        return view;
    }

}
