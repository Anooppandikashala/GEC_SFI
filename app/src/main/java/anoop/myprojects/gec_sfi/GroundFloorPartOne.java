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
public class GroundFloorPartOne extends Fragment {

    FragmentTransaction fragmentTransaction;
    View view1,view2,view10,view3,view4,view5,view6,view7,view8,view9,view13,view12,view11;
    String value;


    public GroundFloorPartOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ground_floor_part_one, container, false);

        view1=view.findViewById(R.id.ladiestoilet);
        view2=view.findViewById(R.id.ecelab1);
        view3=view.findViewById(R.id.ecelab2);
        view4=view.findViewById(R.id.ecelab3);
        view5=view.findViewById(R.id.projectroom);
        view6=view.findViewById(R.id.s5ece);
        view7=view.findViewById(R.id.s3ece);
        view8=view.findViewById(R.id.ecestaff1);
        view9=view.findViewById(R.id.staffroomit);
        view10=view.findViewById(R.id.staffroomit2);
        view11=view.findViewById(R.id.s1ece);
        view12=view.findViewById(R.id.echod);
        view13=view.findViewById(R.id.s7ece);
        //view2=view.findViewById(R.id.ecelab1);

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
        view3.setOnClickListener(new View.OnClickListener() {



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
        view4.setOnClickListener(new View.OnClickListener() {



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
        view5.setOnClickListener(new View.OnClickListener() {



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
        view6.setOnClickListener(new View.OnClickListener() {



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
        view7.setOnClickListener(new View.OnClickListener() {



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
        view8.setOnClickListener(new View.OnClickListener() {



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
        view9.setOnClickListener(new View.OnClickListener() {



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
        view10.setOnClickListener(new View.OnClickListener() {



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
        view11.setOnClickListener(new View.OnClickListener() {



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
        view12.setOnClickListener(new View.OnClickListener() {



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
        view13.setOnClickListener(new View.OnClickListener() {



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
