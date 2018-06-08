package anoop.myprojects.gec_sfi;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Linebuses extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerbus1;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linebuses);





        spinnerbus1 = (Spinner) findViewById(R.id.spinnerline);
        spinnerbus1.setOnItemSelectedListener(Linebuses.this);

        List<String> categories = new ArrayList<String>();
        categories.add("Towards Palakkad");
        categories.add("Towards Sreekrishnapuram");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerbus1.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                LineBus_Palakkad ldf = new LineBus_Palakkad();

                fragmentTransaction.replace(R.id.main_container_line,ldf);
                fragmentTransaction.commit();
                break;

            case 1 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                LineBus_skp ldf1 = new LineBus_skp();

                fragmentTransaction.replace(R.id.main_container_line,ldf1);
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
