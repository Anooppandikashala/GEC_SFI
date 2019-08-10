package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CCF extends Fragment {

    TextView t1;


    public CCF() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view= inflater.inflate(R.layout.fragment_cc, container, false);

            t1 = view.findViewById(R.id.ccf);

            t1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getContext(),CCFShowmore.class);
                    startActivity(intent);
                }
            });



            return view;
    }

}
