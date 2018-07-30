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
public class FirstFloor2 extends Fragment {

    FragmentTransaction fragmentTransaction;
    ImageView info;


    public FirstFloor2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_floor2, container, false);


        info =view.findViewById(R.id.infoMap);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),FirstFloorPartTwoDesc.class);
                startActivity(intent);
            }
        });



        return view;
    }

}
