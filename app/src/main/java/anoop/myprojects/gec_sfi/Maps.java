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
public class Maps extends Fragment {

    FragmentTransaction fragmentTransaction;

    View view1_clg,view2_work,view3_lh;


    public Maps() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_maps, container, false);

        view1_clg=view.findViewById(R.id.button2);
        view2_work=view.findViewById(R.id.button3);
        view3_lh=view.findViewById(R.id.button4);
        view1_clg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);

                MapSecond ldf = new MapSecond();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        view2_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);

                Map_Third ldf = new Map_Third();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        view3_lh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);

                Map_Fourth ldf = new Map_Fourth();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });

        return view;
    }

}
