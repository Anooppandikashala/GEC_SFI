package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Gpl extends Fragment {

    TextView tv_explore;
    FragmentTransaction fragmentTransaction;


    public Gpl() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_gpl, container, false);

        tv_explore = view.findViewById(R.id.exploreme);

        tv_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragmentTransaction=getSupportFragmentManager().beginTransaction();
                Intent intent = new Intent(getContext(),GPL_Explore.class);
                startActivity(intent);
            }
        });

        return  view;
    }



}
