package anoop.myprojects.gec_sfi;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Events extends Fragment {

    TabLayout tabLayout;
    DrawerLayout drawerLayout;
    ViewPager viewPager;
    ViewPagerAdapterNew viewPagerAdapter;
    String value="facility";
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    public static ImageView left1,right1;

    public Events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        toolbar=getActivity().findViewById(R.id.toolbar);
        left1 =view.findViewById(R.id.left1);
        right1 =view.findViewById(R.id.right1);


        //actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorPrimary));
        drawerLayout=getActivity().findViewById(R.id.activity_navgation);


        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapterNew(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {

            viewPagerAdapter.addFragments(new Invento());
            viewPagerAdapter.addFragments(new Daksha());
            viewPagerAdapter.addFragments(new Gpl());
            viewPagerAdapter.addFragments(new GCL());
            viewPagerAdapter.addFragments(new Sarang());
            viewPagerAdapter.addFragments(new pme());
            viewPagerAdapter.addFragments(new YearWiseCricket());
            viewPagerAdapter.addFragments(new YearWiseFootball());
            viewPagerAdapter.addFragments(new SummerFestCricket());
            viewPagerAdapter.addFragments(new AnnualSportsMeet());

           // viewPagerAdapter.addFragments(new EventList());

        }


        viewPager.setAdapter(viewPagerAdapter);

        //tabLayout.setupWithViewPager(viewPager);
        //setupTabIcons();
        /*try {
            Thread.sleep(5000);
            right1.setVisibility(ImageView.GONE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Thread myThread = new Thread() {
            @Override
            public void run() {

                try {
                    sleep(5000);



                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };*/

        //myThread.start();


        return view;
    }



}
