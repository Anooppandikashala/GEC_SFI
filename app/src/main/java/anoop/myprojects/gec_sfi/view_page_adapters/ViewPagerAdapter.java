package anoop.myprojects.gec_sfi.view_page_adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by anoop on 25/11/16.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{


    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    public void addFragments(Fragment fragments,String titles){

       this.fragments.add(fragments);
        this.tabTitles.add(titles);

    }


     public ViewPagerAdapter(FragmentManager fm){

        super(fm);

    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {

        return  tabTitles.get(position);
    }
}
