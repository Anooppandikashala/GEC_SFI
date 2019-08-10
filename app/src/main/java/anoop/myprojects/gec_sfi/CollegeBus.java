package anoop.myprojects.gec_sfi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CollegeBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_bus);

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CollegeBus.super.onBackPressed();
            }
        });

    }

    public void busOne(View view){

        Intent intent = new Intent(CollegeBus.this,Bus1.class);
        startActivity(intent);



    }
    public void busTwo(View view){
        Intent intent = new Intent(CollegeBus.this,Bus2.class);
        startActivity(intent);



    }
    public void busThree(View view){

        Intent intent = new Intent(CollegeBus.this,Bus3.class);
        startActivity(intent);



    }
    public void busFour(View view){

        Intent intent = new Intent(CollegeBus.this,Bus4.class);
        startActivity(intent);



    }
    public void busFive(View view){

        Intent intent = new Intent(CollegeBus.this,Bus5.class);
        startActivity(intent);



    }
    public void busSix(View view){

        Intent intent = new Intent(CollegeBus.this,Bus6.class);
        startActivity(intent);



    }
}
