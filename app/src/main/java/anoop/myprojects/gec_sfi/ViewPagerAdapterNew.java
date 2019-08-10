package anoop.myprojects.gec_sfi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

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

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        int virtualPosition = position % fragments.size();
        return super.instantiateItem(container, virtualPosition);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        int virtualPosition = position % fragments.size();
        super.destroyItem(container, virtualPosition, object);
    }
}
