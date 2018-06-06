package anoop.myprojects.gec_sfi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Events extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapterNew viewPagerAdapter;
    String value="facility";

    public Events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);


        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapterNew(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {
            viewPagerAdapter.addFragments(new Gpl());
            viewPagerAdapter.addFragments(new Gpl());
            viewPagerAdapter.addFragments(new Gpl());
        }


        viewPager.setAdapter(viewPagerAdapter);

        //tabLayout.setupWithViewPager(viewPager);
        //setupTabIcons();


        return view;
    }


}
