package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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




        //actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorPrimary));
        drawerLayout=getActivity().findViewById(R.id.activity_navgation);


        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapterNew(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {


            viewPagerAdapter.addFragments(new GroundFloor());
            viewPagerAdapter.addFragments(new FirstFloor());
            viewPagerAdapter.addFragments(new SecondFloor());
            viewPagerAdapter.addFragments(new ThirdFloor());

            // viewPagerAdapter.addFragments(new EventList());

        }


        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(1);

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
