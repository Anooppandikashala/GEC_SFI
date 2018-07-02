package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    Button enquiry,union,credits,facilities,events;
    //public static boolean badge=false;
    String msg="";


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home2, container, false);

        enquiry=view.findViewById(R.id.Enquiry);
        union=view.findViewById(R.id.unions);
        credits=view.findViewById(R.id.credits);
        facilities=view.findViewById(R.id.facilities);
        events=view.findViewById(R.id.Events);

        enquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "enq";
                System.out.println("hello");
                Intent intent = new Intent(getContext(), Navgation.class);
                intent.putExtra("message", msg);

                startActivity(intent);

            }
        });
        union.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "union";
                System.out.println("hello");
                Intent intent = new Intent(getContext(), Navgation.class);
                intent.putExtra("message", msg);

                startActivity(intent);

            }
        });
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "fac";
                System.out.println("hello");
                Intent intent = new Intent(getContext(), Navgation.class);
                intent.putExtra("message", msg);

                startActivity(intent);

            }
        });
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "crd";
                System.out.println("hello");
                Intent intent = new Intent(getContext(), Navgation.class);
                intent.putExtra("message", msg);

                startActivity(intent);

            }
        });
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "event";
                System.out.println("hello");
                Intent intent = new Intent(getContext(), Navgation.class);
                intent.putExtra("message", msg);

                startActivity(intent);

            }
        });



        return view;
    }





}
