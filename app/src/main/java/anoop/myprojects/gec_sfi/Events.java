package anoop.myprojects.gec_sfi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Events extends Fragment {


    TabLayout tabLayout;
    DrawerLayout drawerLayout;
    ViewPager viewPager;
    ViewPagerAdapterNew viewPagerAdapter;
    String value="facility";
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    @SuppressLint("StaticFieldLeak")
    public static ImageView left1,right1;

    LinearLayout sliderDotsPanel;
    private int dotsCount;
    private ImageView[] dots;

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

        sliderDotsPanel=view.findViewById(R.id.sliderdots);




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
        //viewPager.setClipToPadding(false);
        //viewPager.setPadding(80,90,80,0);
        //viewPager.setPageMargin(20);
        //viewPager.setCurrentItem(1);

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

        dotsCount = viewPagerAdapter.getCount();
        dots = new ImageView[dotsCount];

        for(int i = 0; i < dotsCount; i++){

            dots[i] = new ImageView(getContext());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotsPanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotsCount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        return view;
    }



}
