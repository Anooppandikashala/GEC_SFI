package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ThirdFloorPartOneDesc extends AppCompatActivity {

    TextView t1,t2;
    TextView t3,t4;
    TextView t5,t6;
    TextView t7,t8;
    View view1;
    View view2;
    View view3;
    View view4;


    boolean c1=false;
    boolean c2=false;
    boolean c3=false;
    boolean c4=false;
    private List<String> listDataHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_floor_part_one_desc);

        listDataHeader = new ArrayList<>();

        listDataHeader.add("Central Library");
        listDataHeader.add("IT Seminar Hall");
        listDataHeader.add("Ece seminar hall");

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdFloorPartOneDesc.super.onBackPressed();
            }
        });


        //listDataHeader.add("CERD");

        List<String> network = new ArrayList<>();
        network.add("To conduct labs based on networking.\n" +
                "Lab in-charge:");

        List<String> project = new ArrayList<>();
        project.add("For students to work on their project implementations\n" +
                "Lab in charge: Mr. Sasikumar");

        List<String> soft = new ArrayList<>();
        soft.add("To practice and conduct labs on programming languages. \n" +
                "Lab in-charge: Mr. Pradeep");





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
}
