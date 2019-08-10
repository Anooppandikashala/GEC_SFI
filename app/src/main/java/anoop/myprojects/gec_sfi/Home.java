package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    String value="";
   /* private int[] tabIcons = {
            R.drawable.home_icon
    };*/


    public Home() {
        // Required empty public constructor
    }
    private void setupTabIcons() {
        /*TextView tabOne = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        tabOne.setText("Bus Time");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bus2,0, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabtwo = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        tabtwo.setText("Numbers");
        tabtwo.setCompoundDrawablesWithIntrinsicBounds(R.drawable.phone1,0, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabtwo);

        TextView tabthree = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        tabthree.setText("Train Time");
        tabthree.setCompoundDrawablesWithIntrinsicBounds(R.drawable.train1,0, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabthree);*/


        tabLayout.getTabAt(0).setIcon(R.drawable.bus);
        tabLayout.getTabAt(1).setIcon(R.drawable.phone);
        tabLayout.getTabAt(2).setIcon(R.drawable.train);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        value = getArguments().getString("message").toLowerCase();
        System.out.println("Value  = "+value);



        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapter(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {
            viewPagerAdapter.addFragments(new Bustime(), "Facilities");
            viewPagerAdapter.addFragments(new LocalNumber(), "Union");
            viewPagerAdapter.addFragments(new TrainTimes(), "Enquiry");
        }
        else if(value.equals("enquery")) {
            viewPagerAdapter.addFragments(new TrainTimes(), "Enquiry");
            viewPagerAdapter.addFragments(new Bustime(), "Facilities");
            viewPagerAdapter.addFragments(new LocalNumber(), "Union");

        }
        else if(value.equals("union")) {
            viewPagerAdapter.addFragments(new LocalNumber(), "Union");
            viewPagerAdapter.addFragments(new Bustime(), "Facilities");

            viewPagerAdapter.addFragments(new TrainTimes(), "Enquiry");
        }
        else if(value.equals("credit")) {
            viewPagerAdapter.addFragments(new Bustime(), "Facilities");
            viewPagerAdapter.addFragments(new LocalNumber(), "Union");
            viewPagerAdapter.addFragments(new TrainTimes(), "Enquiry");
        }
        else{

            viewPagerAdapter.addFragments(new Bustime(), "Facilities");
            viewPagerAdapter.addFragments(new LocalNumber(), "Union");
            viewPagerAdapter.addFragments(new TrainTimes(), "Enquiry");

        }




        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        //setupTabIcons();


        return view;

    }
}
