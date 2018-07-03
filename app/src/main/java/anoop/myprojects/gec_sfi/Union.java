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
public class Union extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapterInfinity3 viewPagerAdapter;
    String value="facility";
    ImageView img,slider_train,slider_enq;


    public Union() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_union, container, false);

        tabLayout=(TabLayout)view.findViewById(R.id.tabLayout);
        viewPager=(ViewPager)view.findViewById(R.id.viewPager);

        //img=view.findViewById(R.id.imageView3);
       // slider_train=view.findViewById(R.id.imageView2);
        //slider_enq=view.findViewById(R.id.imageView6);

        viewPagerAdapter=new ViewPagerAdapterInfinity3(getChildFragmentManager());


        //viewPagerAdapter.addFragments(new WhatsNew(),"");
        if(value.equals("facility")) {
            viewPagerAdapter.addFragments(new Staffs());
            viewPagerAdapter.addFragments(new Achievements());
            viewPagerAdapter.addFragments(new Union_members());
            viewPagerAdapter.addFragments(new UnitMemers());
            viewPagerAdapter.addFragments(new Staffs());
            viewPagerAdapter.addFragments(new Achievements());
            viewPagerAdapter.addFragments(new Union_members());
            viewPagerAdapter.addFragments(new UnitMemers());
            //viewPagerAdapter.addFragments(new Staffs());



        }


        viewPager.setAdapter(viewPagerAdapter);

        System.out.println("viewPager.getChildCount() ="+viewPager.getChildCount());
        viewPager.setCurrentItem((ViewPagerAdapterInfinity3.LOOPS_COUNT) / 2,true);
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
