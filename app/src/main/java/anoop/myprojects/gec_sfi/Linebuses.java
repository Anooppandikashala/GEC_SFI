package anoop.myprojects.gec_sfi;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Linebuses extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerbus1,spinnerbus2;
    FragmentTransaction fragmentTransaction;
    int position1=0;
    int position2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linebuses);





        spinnerbus1 = (Spinner) findViewById(R.id.spinnerlinefrom);
        spinnerbus1.setOnItemSelectedListener(Linebuses.this);

        spinnerbus2 = (Spinner) findViewById(R.id.spinnerlineto);
        spinnerbus2.setOnItemSelectedListener(Linebuses.this);

        List<String> categories1 = new ArrayList<String>();
        categories1.add("Mannampatta");
        categories1.add("Sreekrishnapuram");


        List<String> categories2 = new ArrayList<String>();
        categories2.add("Palakkad/Kadambazhipuram");
        categories2.add("Sreekrishnapuram");
        categories2.add("Ottapalam");
        categories2.add("Cherpulassery");
        categories2.add("Mannarkkad");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories1);

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);

        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerbus1.setAdapter(dataAdapter1);
        spinnerbus2.setAdapter(dataAdapter2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {




        System.out.println("Position :"+position);
        System.out.println("Id :"+id);
        System.out.println("view.getId() :"+view.getId());
        System.out.println("Id :"+id);


        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.spinnerlinefrom)
        {
            //do this
            position1=position;
        }
        else if(spinner.getId() == R.id.spinnerlineto)
        {
            //do this
            position2=position;
        }

        //Toast.makeText(this,"Spinner1 :"+position1+"Spinner2 :"+position2,Toast.LENGTH_LONG).show();

        int key=0;

        switch (position1){

            case  0:
                switch (position2){

                    case 0:key=1;
                        break;
                    case 1:key=2;
                        break;
                    case 2:key=3;
                        break;
                    case 3:key=4;
                        break;
                    case 4:key=5;
                        break;

                }
                break;

            case  1:
                switch (position2){

                    case 0:key=6;
                        break;
                    case 1:key=7;
                        break;
                    case 2:key=8;
                        break;
                    case 3:key=9;
                        break;
                    case 4:key=10;
                        break;

                }
                break;




        }

        switch (key){

            case 1 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                LineBus_Palakkad ldf = new LineBus_Palakkad();

                fragmentTransaction.replace(R.id.main_container_line,ldf);
                fragmentTransaction.commit();
                break;

            case 2 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                LineBus_skp ldf2 = new LineBus_skp();

                fragmentTransaction.replace(R.id.main_container_line,ldf2);
                fragmentTransaction.commit();

                break;
            case 3 :

                //Nobus
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                NoBus ldf3 = new NoBus();

                fragmentTransaction.replace(R.id.main_container_line,ldf3);
                fragmentTransaction.commit();

                break;
            case 4 :

                //Nobus
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                NoBus ldf4 = new NoBus();

                fragmentTransaction.replace(R.id.main_container_line,ldf4);
                fragmentTransaction.commit();

                break;
            case 5 :

                //Nobus
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                NoBus ldf5 = new NoBus();

                fragmentTransaction.replace(R.id.main_container_line,ldf5);
                fragmentTransaction.commit();

                break;
            case 6 :
                //Nobus
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                NoBus ldf6 = new NoBus();

                fragmentTransaction.replace(R.id.main_container_line,ldf6);
                fragmentTransaction.commit();

                break;
            case 7 :
                //Nobus
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                NoBus ldf7 = new NoBus();

                fragmentTransaction.replace(R.id.main_container_line,ldf7);
                fragmentTransaction.commit();

                break;
            case 8 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                Ottapalam ldf8 = new Ottapalam();

                fragmentTransaction.replace(R.id.main_container_line,ldf8);
                fragmentTransaction.commit();

                break;
            case 9 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                Cherpulassery ldf9 = new Cherpulassery();

                fragmentTransaction.replace(R.id.main_container_line,ldf9);
                fragmentTransaction.commit();

                break;
            case 10 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                Mannarkkad ldf10 = new Mannarkkad();

                fragmentTransaction.replace(R.id.main_container_line,ldf10);
                fragmentTransaction.commit();

                break;


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        fragmentTransaction=getSupportFragmentManager().beginTransaction();

        LineBus_Palakkad ldf = new LineBus_Palakkad();

        fragmentTransaction.add(R.id.main_container_line,ldf);
        fragmentTransaction.commit();

    }
}
