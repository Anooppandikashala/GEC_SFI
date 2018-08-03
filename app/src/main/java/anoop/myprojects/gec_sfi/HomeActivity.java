package anoop.myprojects.gec_sfi;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
    static FragmentTransaction fragmentTransaction;
    SessionManager session;
    //public static boolean badge=false;
    RelativeLayout linearLayout;
    String msg="";
    Button gotIt;

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        session = new SessionManager(getApplicationContext());
        linearLayout=findViewById(R.id.layoutForGotit);
        gotIt=findViewById(R.id.okgotit);


        viewPager=(ViewPager)findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapterNew(getSupportFragmentManager());



        viewPagerAdapter.addFragments(new News());
        viewPagerAdapter.addFragments(new HomeFragment());
        viewPagerAdapter.addFragments(new FragmentAchievements());



        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(1,true);



        if(!session.isLoggedIn()) {




            linearLayout.setVisibility(RelativeLayout.VISIBLE);
            fragmentTransaction = getSupportFragmentManager().beginTransaction().addToBackStack("hello");

            BlankFragment ldf = new BlankFragment();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.add(R.id.main_containerhome, ldf);
            fragmentTransaction.commit();
        }



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


    public void okGotIt(View view) {

        session.createLoginSession("anoop", "anoopp","1000");

        linearLayout.setVisibility(LinearLayout.GONE);
    }
}
