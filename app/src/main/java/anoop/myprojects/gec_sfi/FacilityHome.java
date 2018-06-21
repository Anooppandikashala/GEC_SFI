package anoop.myprojects.gec_sfi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FacilityHome extends Fragment {

    Button ccf,general,lab,club,plh,pmh,lh,dormitory,sa,canteen;

    FragmentTransaction fragmentTransaction;
    ActionBarDrawerToggle actionBarDrawerToggle;
    MenuItem menuItem;


    public FacilityHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_facility_home, container, false);

        actionBarDrawerToggle = Navgation.actionBarDrawerToggle;
        menuItem =Navgation.gmitem;

        menuItem.setIcon(R.drawable.info);

        //actionBarDrawerToggle=new ActionBarDrawerToggle(this.getActivity(),drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));

        ccf=view.findViewById(R.id.ccf);
        general=view.findViewById(R.id.general);
        lab=view.findViewById(R.id.lab);
        club=view.findViewById(R.id.club);
        plh=view.findViewById(R.id.plh);
        pmh=view.findViewById(R.id.pmh);
        lh=view.findViewById(R.id.lh);
        dormitory=view.findViewById(R.id.dormitory);
        sa=view.findViewById(R.id.student);
        canteen=view.findViewById(R.id.canteen);


        ccf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "ccf");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "gnl");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "lab");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "clb");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        plh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "plh");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        pmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "pmh");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        lh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "lh");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        dormitory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "dm");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "sa");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });
        canteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();

                Facilities ldf = new Facilities();
                Bundle args = new Bundle();
                args.putString("message", "can");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

            }
        });



        return view;
    }


}
