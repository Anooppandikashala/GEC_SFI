package anoop.myprojects.gec_sfi;


import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Enquiry extends Fragment{

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapterInfinity viewPagerAdapter;
    String value="facility";
    ImageView img,slider_train,slider_enq;


    public Enquiry() {
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
        View view = inflater.inflate(R.layout.fragment_enquiry, container, false);

        //value = getArguments().getString("message").toLowerCase();
        //System.out.println("Value  = "+value);



        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        //img=view.findViewById(R.id.imageView3);
        slider_train=view.findViewById(R.id.imageView2);
        slider_enq=view.findViewById(R.id.imageView6);

        viewPagerAdapter=new ViewPagerAdapterInfinity(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {
            viewPagerAdapter.addFragments(new Hospital());
            viewPagerAdapter.addFragments(new BusTime());
            viewPagerAdapter.addFragments(new General_enq());
            viewPagerAdapter.addFragments(new TrainTimes());


        }


        viewPager.setAdapter(viewPagerAdapter);

        System.out.println("viewPager.getChildCount() ="+viewPager.getChildCount());
        viewPager.setCurrentItem((ViewPagerAdapterInfinity.LOOPS_COUNT )/ 2,true);
        viewPager.setOffscreenPageLimit(1);

        //ViewPager.setCurrentItem(viewPager.getChildCount() *ViewPagerAdapterInfinity.LOOPS_COUNT / 2, false);



       /*tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                System.out.println("Position = "+ tab.getPosition());

                if(tab.getPosition() % 4 ==0)

                   tabLayout.getTabAt(0).setText("AAAAA");

                if(tab.getPosition()==0){

                    //Uri uri =Uri.parse("android.resource://com.example.anoop.image/drawable/sunset")

                    img.setImageURI(Uri.parse("android.resource://anoop.myprojects.gec_sfi/drawable/train_timess"));


                }
                if(tab.getPosition()==1){

                    //Uri uri =Uri.parse("android.resource://com.example.anoop.image/drawable/sunset")

                    img.setImageURI(Uri.parse("android.resource://anoop.myprojects.gec_sfi/drawable/train_timess"));


                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/

        //tabLayout.setupWithViewPager(viewPager);
        //setupTabIcons();


        return view;
    }


}
