package anoop.myprojects.gec_sfi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by anoop on 25/11/16.
 */

public class ViewPagerAdapterNew extends FragmentPagerAdapter{


    ArrayList<Fragment> fragments = new ArrayList<>();


    public void addFragments(Fragment fragments){

       this.fragments.add(fragments);


    }


     public ViewPagerAdapterNew(FragmentManager fm){

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
}
