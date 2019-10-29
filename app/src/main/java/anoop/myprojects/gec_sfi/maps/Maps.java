package anoop.myprojects.gec_sfi.maps;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import anoop.myprojects.gec_sfi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Maps extends Fragment {

    FragmentTransaction fragmentTransaction;

    View view1_clg,view2_work,view3_lh;

    AutoCompleteTextView autocomplete;
    ImageView search;

    String key;

    String[] stops = {
            "It Department",//
            "Cse Department",//
            "Mech Department",//
            "Ece Department",//
            "It Department Library",//
            "Cse Department Library",//
            "Mech Department Library",//
            "Ece Department Library",//
            "Eee Department",//
            "Office",//
            "Cooperative Store",//
            "Tequip",//
            "Civil Department",//
            "Maths Department",//
            "Physics Department",//
            "Chemistry Department",//
            "Physics Lab",//
            "Chemistry Lab",//
            "Nss Room",//
            "Ieee Room",//
            "Union Room",//
            "It Drawing Hall",//
            "Cse Drawing Hall",//
            "Ece Drawing Hall",//
            "It Seminar Hall",//
            "Cse Seminar Hall",//
            "Ece Seminar Hall",//
            "Mtech",//
            "CCF",//
            "Edusat Room",//
            "TBI",//
            "Central Library",//
            "PTA Office",//
            "Ladies Waiting Room",//
            "Boys Waiting Room",//
            "S1 S2 Cse","S1 S2 It","S1 S2 Ece","S1 S2 Eee","S1 S2 Mech",
            "S3 S4 Cse","S3 S4 It","S3 S4 Ece","S3 S4 Eee","S3 S4 Mech",
            "S5 S6 Cse","S5 S6 It","S5 S6 Ece","S5 S6 Eee","S5 S6 Mech",
            "S7 S8 Cse","S7 S8 It","S7 S8 Ece","S7 S8 Mech",
            "EC 001 S3","EC 014 S1","EC 004 S5","EC 003 S7","G 024 ECE DH",//
            "G 017 S7 ME","G 129 S1 ME","G 120 S5 ME",//
            "CS 108 S1","CS 105 S3","CS 115 S5","CS 116 S7","CS 131 DH",//
            "IT 209 S5","IT 216 S7","IT 217 S1","IT 206 S3","IT 233 DH",//
            "CS 203 EEE S1",//
            "Ladies Toilet First Floor","Ladies Toilet Ground Floor",
            "Ladies Toilet Second Floor",
            "Boys Toilet First Floor","Boys Toilet Ground Floor",
            "Boys Toilet Second Floor","Boys Toilet Third Floor"



    };


    public Maps() {
        // Required empty public constructor
    }

    public  void performSearch(String item)
    {
        System.out.println(item);

        if(item.equals("Ladies Toilet Second Floor") ||item.equals("Boys Toilet Second Floor") ||item.equals("S7 S8 It") ||item.equals("S5 S6 It") ||item.equals("S3 S4 It") ||item.equals("S1 S2 It") ||item.equals("It Department") || item.equals("It Department Library") ||item.equals("Mtech") ||item.equals("Cse Seminar Hall") ){

            //second floor part one

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            SecondFloor ldf = new SecondFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();

        }
        else if(item.equals("Ladies Toilet First Floor") ||item.equals("Boys Toilet First Floor") ||item.equals("CS 108 S1") ||item.equals("CS 105 S3") ||item.equals("CS 115 S5") ||item.equals("CS 116 S7") ||item.equals("CS 131 DH")||item.equals("G 129 S1 ME")||item.equals("G 120 S5 ME")){

            //first floor part one

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            FirstFloor ldf = new FirstFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();


        }
        else if(item.equals("IT 209 S5") ||item.equals("IT 216 S7") ||item.equals("IT 217 S1") ||item.equals("IT 206 S3") ||item.equals("IT 233 DH") || item.equals("CS 203 EEE S1") ){

            //second floor part one

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            SecondFloor ldf = new SecondFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();

        }

        else if(item.equals("Eee Department") ||item.equals("Nss Room") || item.equals("Office") ||item.equals("Mech Department Library") ||item.equals("It Drawing Hall")){

            //second floor part two

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            SecondFloor ldf = new SecondFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();




        }
        else if(item.equals("Ladies Toilet Ground Floor") ||item.equals("Boys Toilet Ground Floor") ||item.equals("G 017 S7 ME") ||item.equals("EC 001 S3") ||item.equals("EC 014 S1") ||item.equals("EC 004 S5") ||item.equals("EC 003 S7") ||item.equals("G 024 ECE DH")){

            //groundfloor part one

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            GroundFloor ldf = new GroundFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();

        }
        else if(item.equals("S7 S8 Ece") ||item.equals("S5 S6 Ece") ||item.equals("S3 S4 Ece") ||item.equals("S1 S2 Ece") ||item.equals("Ece Department")){

            //groundfloor part one

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            GroundFloor ldf = new GroundFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();

        }
        else if(item.equals("Chemistry Lab") || item.equals("Civil Department") ||item.equals("Chemistry Department") ||item.equals("Ece Drawing Hall") ||item.equals("PTA Office")){

            //groundfloor part two

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            GroundFloor ldf = new GroundFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();


        }

        else if(item.equals("S7 S8 Cse") ||item.equals("S5 S6 Cse") ||item.equals("S3 S4 Cse") ||item.equals("S1 S2 Cse") ||item.equals("Cse Department") || item.equals("Cse Department Library") ||item.equals("Ece Seminar Hall") ||item.equals("Ece Department Library")){

            //first floor part one

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            FirstFloor ldf = new FirstFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();


        }

        else if(item.equals("Boys Waiting Room") ||item.equals("Ladies Waiting Room") ||item.equals("Tequip") ||item.equals("Mech Department") || item.equals("Cse Drawing Hall")||item.equals("Edusat Room") ||item.equals("Cooperative Store") ||item.equals("Maths Department")||item.equals("Physics Department")){

            //first floor part two

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            FirstFloor ldf = new FirstFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();


        }
        else if(item.equals("Boys Toilet Third Floor")||item.equals("Central Library") || item.equals("It Department Library") ||item.equals("Mtech") ||item.equals("It Seminar Hall") ){

            //third floor part one

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            ThirdFloor ldf = new ThirdFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();

        }
        else if(item.equals("CCF") || item.equals("TBI") ||item.equals("Ieee Room") ||item.equals("Union Room")||item.equals("Physics Lab")){

            //third floor part two

            fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

            ThirdFloor ldf = new ThirdFloor();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.replace(R.id.main_container,ldf);
            fragmentTransaction.commit();




        }
        else
        {
            //

        }





    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        MapActivity.count=1;

        View view11= inflater.inflate(R.layout.fragment_maps, container, false);

        MapActivity.floatingActionButton3.setImageResource(R.drawable.ic_2_fill);
        MapActivity.floatingActionButton2.setImageResource(R.drawable.ic_1_fill);
        MapActivity.floatingActionButton1.setImageResource(R.drawable.ic_4_fillsvg);
        MapActivity.floatingActionButton4.setImageResource(R.drawable.ic_3_fill);

        search = view11.findViewById(R.id.go);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line, stops);

        autocomplete = view11.findViewById(R.id.search);

        autocomplete.setThreshold(1);
        autocomplete.setAdapter(adapter);
        /*autocomplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();
                performSearch(item);

            }
        } );*/

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                key = autocomplete.getText().toString().trim();

                performSearch(key);

            }
        });


        view1_clg=view11.findViewById(R.id.button2);
        view2_work=view11.findViewById(R.id.button3);
        view3_lh=view11.findViewById(R.id.button4);
        view1_clg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

                FirstFloor ldf = new FirstFloor();
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

                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

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

                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

                Map_Fourth ldf = new Map_Fourth();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });

        return view11;
    }




}
