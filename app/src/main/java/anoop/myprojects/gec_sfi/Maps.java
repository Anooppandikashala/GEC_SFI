package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Maps extends Fragment {

    FragmentTransaction fragmentTransaction;

    View view1_clg,view2_work,view3_lh;

    AutoCompleteTextView autocomplete;

    String[] stops = {
            "It Department",
            "Cse Department",
            "Mech Department",
            "Ece Department",
            "It Department Library",
            "Cse Department Library",
            "Mech Department Library",
            "Ece Department Library",
            "Eee Department",
            "Office",
            "Cooperative Store",
            "Tequip",
            "Civil Department",
            "Maths Department",
            "Physics Department",
            "Chemistry Department",
            "Physics Lab",
            "Chemistry Lab",
            "Nss Room",
            "Ieee Room",
            "Union Room",
            "It Drawing Hall",
            "Cse Drawing Hall",
            "Ece Drawing Hall",
            "It Seminar Hall",
            "Cse Seminar Hall",
            "Ece Seminar Hall",
            "Mtech",
            "CCF","Edusat Room","TBI","Central Library"


    };


    public Maps() {
        // Required empty public constructor
    }

    public  void performSearch(String item)
    {
        System.out.print(item);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_maps, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line, stops);

        autocomplete = (AutoCompleteTextView)view.findViewById(R.id.search);

        autocomplete.setThreshold(1);
        autocomplete.setAdapter(adapter);
        autocomplete.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();
                performSearch(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });











        view1_clg=view.findViewById(R.id.button2);
        view2_work=view.findViewById(R.id.button3);
        view3_lh=view.findViewById(R.id.button4);
        view1_clg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("map");

                fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);

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

        return view;
    }




}
