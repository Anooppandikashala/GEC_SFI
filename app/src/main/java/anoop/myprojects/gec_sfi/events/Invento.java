package anoop.myprojects.gec_sfi.events;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import anoop.myprojects.gec_sfi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Invento extends Fragment {




    public Invento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_invento, container, false);

        //Events.left1.setVisibility(ImageView.GONE);
        //Events.right1.setVisibility(ImageView.VISIBLE);

        TextView tv_explore;

        tv_explore = view.findViewById(R.id.exploreinvento);

        tv_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragmentTransaction=getSupportFragmentManager().beginTransaction();
                Intent intent = new Intent(getContext(),InventoExplore.class);
                startActivity(intent);
            }
        });



        return  view;
    }

}
