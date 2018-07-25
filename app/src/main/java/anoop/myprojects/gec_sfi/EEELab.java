package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EEELab extends AppCompatActivity {

    TextView t1,t2;
    TextView t3,t4;

    View view1;
    View view2;


    boolean c1=false;
    boolean c2=false;


    private List<String> listDataHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeelab);

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EEELab.super.onBackPressed();
            }
        });


        listDataHeader = new ArrayList<>();

        listDataHeader.add("Programming Lab");
        listDataHeader.add("Electronic Circuit Lab");


        //listDataHeader.add("CERD");

        List<String> pgm = new ArrayList<>();
        pgm.add("To impart knowledge and Develop skills in programming\n" +
                "Lab in charge:\n" +
                "Dr.Vineetha");
        List<String> elc = new ArrayList<>();
        elc.add("To design and develop various electronics circuits using discrete components and OPAMPs\n" +
                "Lab in charge:\n" +
                "Mr.Sreejith");




        //listDataHeader.add("CERD");

        t1= findViewById(R.id.lblListHeader);
        t1.setText(listDataHeader.get(0));
        t2= findViewById(R.id.lblListItem);
        t2.setText(pgm.get(0));
        view1 =findViewById(R.id.edd);

        t3= findViewById(R.id.lblListHeader1);
        t3.setText(listDataHeader.get(1));
        t4= findViewById(R.id.lblListItem1);
        t4.setText(elc.get(0));
        view2 =findViewById(R.id.edd1);




    }



    public void headerClick(View view) {

        if(c1 == false){
            c1=true;
            t2.setVisibility(TextView.VISIBLE);
            view1.setVisibility(View.VISIBLE);
        }
        else {
            c1=false;
            t2.setVisibility(TextView.GONE);
            view1.setVisibility(View.GONE);
        }
    }

    public void headerClick1(View view) {

        if(c2 == false){
            c2=true;
            t4.setVisibility(TextView.VISIBLE);
            view2.setVisibility(View.VISIBLE);
        }
        else {
            c2=false;
            t4.setVisibility(TextView.GONE);
            view2.setVisibility(View.GONE);
        }
    }

}
