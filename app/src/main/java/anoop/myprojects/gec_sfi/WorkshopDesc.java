package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WorkshopDesc extends AppCompatActivity {

    TextView t1,t2;
    TextView t3,t4;
    TextView t5,t6;
    TextView t7,t8;
    TextView t9,t10;
    View view1;
    View view2;
    View view3;
    View view4;
    View view5;
    ImageView back;

    boolean c1=false;
    boolean c2=false;
    boolean c3=false;
    boolean c4=false;
    boolean c5=false;
    private List<String> listDataHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop_desc);

        listDataHeader = new ArrayList<>();

        listDataHeader.add("Electrical Workshop");
        listDataHeader.add("Thermal lab");
        listDataHeader.add("Basic Mechanical Workshop");
        listDataHeader.add("Production Lab 1 & 2");


        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WorkshopDesc.super.onBackPressed();
            }
        });


        //listDataHeader.add("CERD");

        List<String> network = new ArrayList<>();
        network.add("Lab provided by the department of EEE");

        List<String> project = new ArrayList<>();
        project.add("Lab provided by  Mechanical department ");

        List<String> soft = new ArrayList<>();
        soft.add("Workshop provided by the department of mechanical engineering, mainly aimed for all departments of first year students.");

        List<String> soft1 = new ArrayList<>();
        soft1.add("Workshop provided by the department of mechanical engineering");





        //listDataHeader.add("CERD");

        t1= findViewById(R.id.lblListHeader);
        t1.setText(listDataHeader.get(0));
        t2= findViewById(R.id.lblListItem);
        t2.setText(network.get(0));
        view1 =findViewById(R.id.edd);

        t3= findViewById(R.id.lblListHeader1);
        t3.setText(listDataHeader.get(1));
        t4= findViewById(R.id.lblListItem1);
        t4.setText(project.get(0));
        view2 =findViewById(R.id.edd1);

        t5= findViewById(R.id.lblListHeader2);
        t5.setText(listDataHeader.get(2));
        t6= findViewById(R.id.lblListItem2);
        t6.setText(soft.get(0));
        view3 =findViewById(R.id.edd2);

        t7= findViewById(R.id.lblListHeader3);
        t7.setText(listDataHeader.get(2));
        t8= findViewById(R.id.lblListItem3);
        t8.setText(soft1.get(0));
        view4 =findViewById(R.id.edd3);
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
    public void headerClick2(View view) {

        if(c3 == false){
            c3=true;
            t6.setVisibility(TextView.VISIBLE);
            view3.setVisibility(View.VISIBLE);
        }
        else {
            c3=false;
            t6.setVisibility(TextView.GONE);
            view3.setVisibility(View.GONE);
        }
    }

    public void headerClick3(View view) {

        if(c4 == false){
            c4=true;
            t8.setVisibility(TextView.VISIBLE);
            view4.setVisibility(View.VISIBLE);
        }
        else {
            c3=false;
            t8.setVisibility(TextView.GONE);
            view4.setVisibility(View.GONE);
        }
    }
}
