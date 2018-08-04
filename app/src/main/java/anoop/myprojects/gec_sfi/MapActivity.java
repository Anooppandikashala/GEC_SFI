package anoop.myprojects.gec_sfi;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.List;

public class MapActivity extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;
    static int count=0;

    FloatingActionMenu materialDesignFAM;
    static FloatingActionButton floatingActionButton1,
            floatingActionButton3,
            floatingActionButton4;
    static FloatingActionButton floatingActionButton2;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        fragmentTransaction=getSupportFragmentManager().beginTransaction();//.addToBackStack("mapps");

        Maps ldf = new Maps();
        Bundle args = new Bundle();
        args.putString("message", "enquery");
        ldf.setArguments(args);




        fragmentTransaction.add(R.id.main_container,ldf);
        fragmentTransaction.commit();



        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);
        floatingActionButton4 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item4);


        floatingActionButton3.setImageResource(R.drawable.ic_2_fill);
        floatingActionButton2.setImageResource(R.drawable.ic_1_fill);
        floatingActionButton1.setImageResource(R.drawable.ic_4_fillsvg);
        floatingActionButton4.setImageResource(R.drawable.ic_3_fill);

        //floatingActionButton2.setImageResource(R.drawable.ic_1_fill);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                materialDesignFAM.close(true);

                floatingActionButton3.setImageResource(R.drawable.ic_2_fill);
                floatingActionButton2.setImageResource(R.drawable.ic_1_fill);
                floatingActionButton1.setImageResource(R.drawable.ic_4);
                floatingActionButton4.setImageResource(R.drawable.ic_3_fill);

                if(count ==1){

                    fragmentTransaction=getSupportFragmentManager().beginTransaction().addToBackStack("mapsss");

                }
                else {
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                }




                GroundFloor ldf = new GroundFloor();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();
                //System.out.println(getFragmentManager().getBackStackEntryCount());

            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                materialDesignFAM.close(true);

                floatingActionButton3.setImageResource(R.drawable.ic_2_fill);
                floatingActionButton2.setImageResource(R.drawable.ic_1);
                floatingActionButton1.setImageResource(R.drawable.ic_4_fillsvg);
                floatingActionButton4.setImageResource(R.drawable.ic_3_fill);

                if(count == 1){

                    fragmentTransaction=getSupportFragmentManager().beginTransaction().addToBackStack("mapsss");
                }
                else {
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                }



                FirstFloor ldf = new FirstFloor();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();
                //System.out.println(getFragmentManager().getBackStackEntryCount());

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                materialDesignFAM.close(true);
                floatingActionButton3.setImageResource(R.drawable.ic_2);
                floatingActionButton2.setImageResource(R.drawable.ic_1_fill);
                floatingActionButton1.setImageResource(R.drawable.ic_4_fillsvg);
                floatingActionButton4.setImageResource(R.drawable.ic_3_fill);

                if(count == 1){
                    fragmentTransaction=getSupportFragmentManager().beginTransaction().addToBackStack("mapsss");
                }
                else {
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                }



                SecondFloor ldf = new SecondFloor();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();
                //System.out.println(getFragmentManager().getBackStackEntryCount());

            }
        });
        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                materialDesignFAM.close(true);

                floatingActionButton3.setImageResource(R.drawable.ic_2_fill);
                floatingActionButton2.setImageResource(R.drawable.ic_1_fill);
                floatingActionButton1.setImageResource(R.drawable.ic_4_fillsvg);
                floatingActionButton4.setImageResource(R.drawable.ic_3);

                if(count == 1){
                    fragmentTransaction=getSupportFragmentManager().beginTransaction().addToBackStack("mapsss");
                }
                else {
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                }



                ThirdFloor ldf = new ThirdFloor();
                Bundle args = new Bundle();
                args.putString("message", "enquery");
                ldf.setArguments(args);


                fragmentTransaction.replace(R.id.main_container,ldf);
                fragmentTransaction.commit();

                //System.out.println(getFragmentManager().getBackStackEntryCount());

            }
        });




    }

    @Override
    public void onBackPressed() {

        materialDesignFAM.close(true);



        super.onBackPressed();
    }
}
