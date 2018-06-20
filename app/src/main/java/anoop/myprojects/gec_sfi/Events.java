package anoop.myprojects.gec_sfi;

import android.content.Context;
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


public class Events extends Fragment {

    TabLayout tabLayout;
    DrawerLayout drawerLayout;
    ViewPager viewPager;
    ViewPagerAdapterNew viewPagerAdapter;
    String value="facility";
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;

    public Events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        toolbar=getActivity().findViewById(R.id.toolbar);


        //actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorPrimary));
        drawerLayout=getActivity().findViewById(R.id.activity_navgation);

        actionBarDrawerToggle=new ActionBarDrawerToggle(getActivity(),drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorPrimary));



        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapterNew(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {
            viewPagerAdapter.addFragments(new Gpl());
            viewPagerAdapter.addFragments(new EventList());
            viewPagerAdapter.addFragments(new Gpl());
        }


        viewPager.setAdapter(viewPagerAdapter);

        //tabLayout.setupWithViewPager(viewPager);
        //setupTabIcons();


        return view;
    }


}
