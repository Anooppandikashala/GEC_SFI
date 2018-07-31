package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapSecond extends Fragment {

    TabLayout tabLayout;
    DrawerLayout drawerLayout;
    ViewPager viewPager;
    ViewPagerAdapterNew viewPagerAdapter;
    String value="facility";
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;

    LinearLayout sliderDotsPanel;
    private int dotsCount;
    private ImageView[] dots;


    public MapSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map_second, container, false);

        //View view = inflater.inflate(R.layout.fragment_events, container, false);
        toolbar=getActivity().findViewById(R.id.toolbar);

        sliderDotsPanel=view.findViewById(R.id.sliderdots);




        //actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorPrimary));
        //drawerLayout=getActivity().findViewById(R.id.activity_navgation);


        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapterNew(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {


            //viewPagerAdapter.addFragments(new GroundFloor());
            viewPagerAdapter.addFragments(new FirstFloor());
            //viewPagerAdapter.addFragments(new SecondFloor());
            //viewPagerAdapter.addFragments(new ThirdFloor());

            // viewPagerAdapter.addFragments(new EventList());

        }


        viewPager.setAdapter(viewPagerAdapter);

       /* viewPager.setClipToPadding(false);
        viewPager.setPadding(80,90,80,0);
        viewPager.setPageMargin(20);*/
        viewPager.setCurrentItem(0);

        dotsCount = viewPagerAdapter.getCount();
        dots = new ImageView[dotsCount];

        for(int i = 0; i < dotsCount; i++){

            dots[i] = new ImageView(getContext());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotsPanel.addView(dots[i], params);

        }

        dots[1].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));

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
