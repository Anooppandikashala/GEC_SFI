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
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Navgation extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    String msg="";
    ActionBarDrawerToggle actionBarDrawerToggle;
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

        drawerLayout=(DrawerLayout)findViewById(R.id.activity_navgation);

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        if(msg.equals("event")){
            System.out.println("Super Macha");
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

        /*if(msg=="enq"){
            System.out.println(msg);
            fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.main_container,new HomFragment());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Enquiry");
        }*/
        if(msg.equals("fac")){
            System.out.println(msg);
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            Home ldf = new Home();
            Bundle args = new Bundle();
            args.putString("message", "facility");
            ldf.setArguments(args);





            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Facilities");
        }
        if(msg.equals("uni")){
            System.out.println(msg);
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            Home ldf = new Home();
            Bundle args = new Bundle();
            args.putString("message", "union");
            ldf.setArguments(args);

            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Union");
        }
        if(msg.equals("crd")){
            fragmentTransaction=getSupportFragmentManager().beginTransaction();

            Home ldf = new Home();
            Bundle args = new Bundle();
            args.putString("message", "credit");
            ldf.setArguments(args);

            fragmentTransaction.add(R.id.main_container,ldf);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Credit");
        }






        //item.setChecked(true);


        navigationView = (NavigationView) findViewById(R.id.navgation_view);
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
                    case R.id.nav_aboutus :
                        navigationView.setCheckedItem(R.id.nav_aboutus);
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
                        getSupportActionBar().setTitle("Information");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;

                    case R.id.nav_facilities :
                        navigationView.setCheckedItem(R.id.nav_facilities);
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new Facility());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Facilities");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;

                    case R.id.nav_cse :
                        navigationView.setCheckedItem(R.id.nav_cse);
                        //item.setChecked(true);
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new Cselab());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Computer Science");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    case R.id.nav_it :
                        navigationView.setCheckedItem(R.id.nav_it);
                        //item.setChecked(true);
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new Itlab());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Information Technology");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    case R.id.nav_ece :
                        navigationView.setCheckedItem(R.id.nav_ece);

                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new Ecelab());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Electronics & Communication");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    case R.id.nav_eee :
                        navigationView.setCheckedItem(R.id.nav_eee);
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new Eeelab());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Electrical & Electronics Engineering");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    case R.id.nav_me :
                        navigationView.setCheckedItem(R.id.nav_me);
                        fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        //getFragmentManager().popBackStack();
                        fragmentTransaction.replace(R.id.main_container,new Mechlab());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Mechanical Engineering");
                        drawerLayout.closeDrawers();

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        break;
                    case R.id.nav_Facebook :
                        navigationView.setCheckedItem(R.id.nav_Facebook);

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        goToUrl( "https://www.facebook.com/anoop.pandikashala");
                        break;
                    case R.id.nav_collegeweb :
                        navigationView.setCheckedItem(R.id.nav_collegeweb);

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        goToUrl( "http://www.gecskp.ac.in/");
                        break;
                    case R.id.nav_syllabus :
                        navigationView.setCheckedItem(R.id.nav_syllabus);

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        Intent i = new Intent(Navgation.this, pdfview.class);
                        startActivity(i);
                        break;
                    case R.id.nav_invento :
                        navigationView.setCheckedItem(R.id.nav_invento);

                        //x=checkNavigationMenuItem();
                        //System.out.println("x="+x);

                        goToUrl( "http://www.inventogec.in/home/");
                        break;
                    case R.id.nav_watsapp :
                        navigationView.setCheckedItem(R.id.nav_watsapp);
                        String number ="+919745244240";
                        Uri uri = Uri.parse("smsto:" + number);
                        Intent ii = new Intent(Intent.ACTION_SENDTO, uri);
                        ii.setPackage("com.whatsapp");
                        startActivity(Intent.createChooser(ii, ""));
                        break;
                    case R.id.nav_collegemagazine :
                        navigationView.setCheckedItem(R.id.nav_collegemagazine);
                        goToUrl( "http://www.gecpkdmagz.in/");
                        break;

                    case R.id.nav_sfiunit :
                        navigationView.setCheckedItem(R.id.nav_sfiunit);
                        goToUrl( "https://www.facebook.com/sfigecskp/");
                        break;

                    case R.id.nav_formats :
                        navigationView.setCheckedItem(R.id.nav_formats);
                        Toast.makeText(getApplicationContext(),"Coming Soon",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.nav_Ktu_clg_portal :
                        navigationView.setCheckedItem(R.id.nav_Ktu_clg_portal);
                        goToUrl( "https://gecskp.etlab.in/user/login");
                        break;

                    case R.id.nav_Ktu_portal :
                        navigationView.setCheckedItem(R.id.nav_Ktu_portal);
                        goToUrl( "https://app.ktu.edu.in/login.jsp;jsessionid=723955CF0F43D5770338AD2C3C2DF031.KTUApp1");
                        break;

                    case R.id.nav_joinus :
                        navigationView.setCheckedItem(R.id.nav_joinus);
                        goToUrl( "https://chat.whatsapp.com/BqqvINrLcX8Jdx6O09AXtx");
                        break;


                    //https://gecskp.etlab.in/user/login
                    //https://app.ktu.edu.in/login.jsp;jsessionid=723955CF0F43D5770338AD2C3C2DF031.KTUApp1
                    //https://chat.whatsapp.com/BqqvINrLcX8Jdx6O09AXtx


                }

                return true;
            }
        });



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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        return true;
    }*/

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();
    }
}
