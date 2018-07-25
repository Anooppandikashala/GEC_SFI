package anoop.myprojects.gec_sfi;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Bus6 extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {

    Spinner spinnerbus1;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus6);

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bus6.super.onBackPressed();
            }
        });





        spinnerbus1 = (Spinner) findViewById(R.id.spinnerbus6);
        spinnerbus1.setOnItemSelectedListener(Bus6.this);

        List<String> categories = new ArrayList<String>();
        categories.add("Towards College");
        categories.add("Towards Shornur");

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

                SHR_to_clg ldf = new SHR_to_clg();

                fragmentTransaction.replace(R.id.main_container_bus6,ldf);
                fragmentTransaction.commit();
                break;

            case 1 :
                fragmentTransaction=getSupportFragmentManager().beginTransaction();

                Clg_to_SHR ldf1 = new Clg_to_SHR();

                fragmentTransaction.replace(R.id.main_container_bus6,ldf1);
                fragmentTransaction.commit();

                break;


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        fragmentTransaction=getSupportFragmentManager().beginTransaction();

        SHR_to_clg ldf = new SHR_to_clg();

        fragmentTransaction.add(R.id.main_container_bus6,ldf);
        fragmentTransaction.commit();

    }
}
