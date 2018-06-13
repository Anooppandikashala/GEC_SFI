package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
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


    public Facilities() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_facilities, container, false);

        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        //img=view.findViewById(R.id.imageView3);

        viewPagerAdapter=new ViewPagerAdapterInfinity(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {
            viewPagerAdapter.addFragments(new Dormetry());
            viewPagerAdapter.addFragments(new Clubs());
            viewPagerAdapter.addFragments(new Labs());
            viewPagerAdapter.addFragments(new LadiesHostel());
            viewPagerAdapter.addFragments(new MensHostel());
            viewPagerAdapter.addFragments(new CCF());
            viewPagerAdapter.addFragments(new GeneralStore());


        }


        viewPager.setAdapter(viewPagerAdapter);

        System.out.println("viewPager.getChildCount() ="+viewPager.getChildCount());
        viewPager.setCurrentItem((ViewPagerAdapterInfinity.LOOPS_COUNT )/ 2,true);
        viewPager.setOffscreenPageLimit(1);


        return  view;
    }

}
