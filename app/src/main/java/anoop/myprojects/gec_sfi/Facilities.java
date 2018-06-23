package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Facilities extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapterInfinity viewPagerAdapter;
    String value="facility";
    ImageView img,slider_train,slider_enq;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    String msg="";
    ActionBarDrawerToggle actionBarDrawerToggle;


    public Facilities() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_facilities, container, false);


        toolbar=(Toolbar) this.getActivity().findViewById(R.id.toolbar);
        //.setSupportActionBar(toolbar);
        //String mTitle=" ";
        drawerLayout=this.getActivity().findViewById(R.id.activity_navgation);
        actionBarDrawerToggle = Navgation.actionBarDrawerToggle;

        //actionBarDrawerToggle=new ActionBarDrawerToggle(this.getActivity(),drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorAccent));
        drawerLayout.setDrawerListener(actionBarDrawerToggle);



        value = getArguments().getString("message").toLowerCase();
        System.out.println("Value  = "+value);

        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        //img=view.findViewById(R.id.imageView3);

        viewPagerAdapter=new ViewPagerAdapterInfinity(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("ccf")) {

            viewPagerAdapter.addFragments(new CCF());
            viewPagerAdapter.addFragments(new GeneralStore());
            viewPagerAdapter.addFragments(new Canteen());
            viewPagerAdapter.addFragments(new StudentActivity());
            viewPagerAdapter.addFragments(new Dormetry());
            viewPagerAdapter.addFragments(new Clubs());
            viewPagerAdapter.addFragments(new Labs());
            viewPagerAdapter.addFragments(new Library());
            viewPagerAdapter.addFragments(new LadiesHostel());
            viewPagerAdapter.addFragments(new PrivateWomensHostel());
            viewPagerAdapter.addFragments(new MensHostel());
            viewPagerAdapter.addFragments(new Gym());


        }



        viewPager.setAdapter(viewPagerAdapter);

        System.out.println("viewPager.getChildCount() ="+viewPager.getChildCount());
        viewPager.setCurrentItem((ViewPagerAdapterInfinity.LOOPS_COUNT )/ 2,true);
        viewPager.setOffscreenPageLimit(1);


        return  view;
    }

}
