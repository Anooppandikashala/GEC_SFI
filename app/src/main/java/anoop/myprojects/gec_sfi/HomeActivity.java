package anoop.myprojects.gec_sfi;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomeActivity extends AppCompatActivity {

    Button enquiry,union,credits,facilities;
    ViewPager viewPager;
    ViewPagerAdapterNew viewPagerAdapter;
    //public static boolean badge=false;
    String msg="";
    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager=(ViewPager)findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapterNew(getSupportFragmentManager());



        viewPagerAdapter.addFragments(new Daksha());
        viewPagerAdapter.addFragments(new HomeFragment());
        viewPagerAdapter.addFragments(new Gpl());



        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(1,true);



    }





    @Override
    public void onBackPressed() {
        this.finish();
        Intent intent= new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);

        //super.onBackPressed();
    }
}
