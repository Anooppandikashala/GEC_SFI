package anoop.myprojects.gec_sfi;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Navgation extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    String msg="";
    public static ActionBarDrawerToggle actionBarDrawerToggle;
    public  static MenuItem gmitem;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navgation);

        Bundle bundle = getIntent().getExtras();
        msg = bundle.getString("message").toLowerCase();


        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String mTitle=" ";
         getSupportActionBar().setTitle(mTitle);

        navigationView = (NavigationView) findViewById(R.id.navgation_view);
        Menu menu = navigationView.getMenu();
        MenuItem mitem;
        if(Global.badge==true) {
            for (int i = 0; i < menu.size(); i++) {
                if ((mitem = menu.getItem(i)).getItemId() == R.id.noti) {

                    gmitem = mitem;

                    mitem.setIcon(R.drawable.ic_notifications_colorful);
                }
                // return i;
            }
        }
        else {

            for (int i = 0; i < menu.size(); i++) {
                if ((mitem = menu.getItem(i)).getItemId() == R.id.noti) {

                    gmitem = mitem;

                    mitem.setIcon(R.drawable.ic_notifications);
                }
                // return i;
            }


        }

        navigationView.setItemIconTintList(null);

        drawerLayout=(DrawerLayout)findViewById(R.id.activity_navgation);

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);


        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        if(msg.equals("event")){
            System.out.println("Super Macha");
            //actionBarDrawerToggle.setDrawerArrowDrawable(new DrawerArrowDrawable(R.drawable.home_icon));
            actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            Events ldf = new Events();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Enquiry");

        }

        if(msg.equals("enq")){
            System.out.println("Super Macha");
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            Enquiry ldf = new Enquiry();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Enquiry");

        }

        if(msg.equals("union")){
            System.out.println("Super Macha");
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            Union ldf = new Union();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Enquiry");

        }
        if(msg.equals("fac")){

            actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));
            System.out.println("Super Macha");
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            FacilityHome ldf = new FacilityHome();
            Bundle args = new Bundle();
            args.putString("message", "enquery");
            ldf.setArguments(args);


            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Enquiry");

        }

        /*if(msg=="enq"){
            System.out.println(msg);
            fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.main_container,new HomFragment());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Enquiry");
        }*/

        if(msg.equals("crd")){
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            Credit ldf = new Credit();
            Bundle args = new Bundle();
            args.putString("message", "credit");
            ldf.setArguments(args);

            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Credit");
        }






        //item.setChecked(true);






        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {



            @Override
            public boolean onNavigationItemSelected(MenuItem item) {


                //item.setChecked(true);
                navigationView.setCheckedItem(item.getItemId());

                switch (item.getItemId()){

                    case R.id.nav_home :
                        /*navigationView.setCheckedItem(R.id.nav_home);

                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new HomFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Home");
                        drawerLayout.closeDrawers();*/

                        Intent intent = new Intent(Navgation.this, HomeActivity.class);
                        startActivity(intent);

                        //int x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;

                    case R.id.noti:
                        /*navigationView.setCheckedItem(R.id.nav_home);

                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new HomFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Home");
                        drawerLayout.closeDrawers();*/

                        Intent intent1 = new Intent(Navgation.this, Notifications.class);
                        startActivity(intent1);

                        //int x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    case R.id.nav_rateus :
                        navigationView.setCheckedItem(R.id.nav_rateus);
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new AboutUsFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("AboutUs");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    case R.id.nav_info :
                        navigationView.setCheckedItem(R.id.nav_info);
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new InfoFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle(" ");
                        drawerLayout.closeDrawers();

                    case R.id.nav_share :
                        shareApp();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    //https://gecskp.etlab.in/user/login
                    //https://app.ktu.edu.in/login.jsp;jsessionid=723955CF0F43D5770338AD2C3C2DF031.KTUApp1
                    //https://chat.whatsapp.com/BqqvINrLcX8Jdx6O09AXtx


                }

                return true;
            }
        });



    }

    private void shareApp(){

        //Intent intent =new Intent(Intent.ACTION_SEND);


    }

    //for navigation
    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    //-------------------------------------------------------------------

    private int checkNavigationMenuItem() {
        Menu menu = navigationView.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            if (menu.getItem(i).isChecked())
                return i;
        }
        return -1;
    }

    @Override
    public void onBackPressed() {
        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            int x=checkNavigationMenuItem();
            //System.out.println("x="+x);
            if ( x!= 0)
            {

                /*fragment = new ContentMainActivity();
                getSupportFragmentManager().beginTransaction().replace(R.id.containerView, fragment).commit();*/

                /*navigationView.setCheckedItem(R.id.nav_home);
                fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container,new HomFragment());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Home");*/

                super.onBackPressed();

                // Intent intent = new Intent(Navgation.this, HomeActivity.class);
                //startActivity(intent);


            }
            else
                super.onBackPressed();
        }


    }



/*
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.activity_navgation);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
*/
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if itcover is present.
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        return true;
    }*/

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();
    }
}
