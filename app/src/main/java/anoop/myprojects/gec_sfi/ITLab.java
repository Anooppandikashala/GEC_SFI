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

public class ITLab extends AppCompatActivity {

    TextView t1,t2;
    TextView t3,t4;
    TextView t5,t6;
    TextView t7,t8;
    TextView t9,t10;
    TextView t11,t12;
    TextView t13,t14;
    View view1;
    View view2;
    View view3;
    View view4;
    View view5;
    View view6;
    View view7;
    boolean c1=false;
    boolean c2=false;
    boolean c3=false;
    boolean c4=false;
    boolean c5=false;
    boolean c6=false;
    boolean c7=false;

    private List<String> listDataHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itlab);

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ITLab.super.onBackPressed();
            }
        });


        listDataHeader = new ArrayList<>();

        listDataHeader.add("Network Lab");
        listDataHeader.add("Advanced Programming Lab");
        listDataHeader.add("Database and Data Structures Lab");
        listDataHeader.add("Programming Lab");
        listDataHeader.add("Seminar Hall");
        listDataHeader.add("Project Lab");
        listDataHeader.add("Digital and Micro-Controller Lab");




        //listDataHeader.add("CERD");

        List<String> network = new ArrayList<>();
        network.add("Helpful to develop network applications, configure new device etc. " +
                "The lab is dedicated for computer networking using specialized devices.\n" +
                "Lab In Charge:  \nSulfikar.S  \nShameer.A.N");

        List<String> apgm = new ArrayList<>();
        apgm.add("Helpful in advanced programming and is useful " +
                "for the research and development activities of the department.\n" +
                "");

        List<String> db = new ArrayList<>();
        db.add("To develop and program the database management " +
                "system and for data structure programming.\n" +
                "Lab In Charge:  \nAbdul Raheem.M");

        List<String> pgm = new ArrayList<>();
        pgm.add("Helpful in familiarizing with different" +
                " programming environments. Also used to implement basic applications " +
                "using high level programming languages such as C, C++, JAVA and PYTHON.\n" +
                "Lab In Charge:  \nArunvas.K");
        List<String> sem = new ArrayList<>();
        sem.add("Used for hosting softskill development classes, talks and seminars.\n" +
                "Lab In Charge:  \nSujith.D");

        List<String> pgct = new ArrayList<>();
        pgct.add("Provide facilities for Micro Project, Mini project and Main Project.\n" +
                "Lab In Charge:  \nJayapalan.T.D");

        List<String> mc = new ArrayList<>();
        mc.add("Used for digital, microcontroller and assembly language programming.\n" +
                "Lab In Charge:  \nManju.M.K");



        t1= findViewById(R.id.lblListHeader);
        t1.setText(listDataHeader.get(0));
        t2= findViewById(R.id.lblListItem);
        t2.setText(network.get(0));
        view1 =findViewById(R.id.edd);

        t3= findViewById(R.id.lblListHeader1);
        t3.setText(listDataHeader.get(1));
        t4= findViewById(R.id.lblListItem1);
        t4.setText(apgm.get(0));
        view2 =findViewById(R.id.edd1);

        t5= findViewById(R.id.lblListHeader2);
        t5.setText(listDataHeader.get(2));
        t6= findViewById(R.id.lblListItem2);
        t6.setText(db.get(0));
        view3 =findViewById(R.id.edd2);

        t7= findViewById(R.id.lblListHeader3);
        t7.setText(listDataHeader.get(3));
        t8= findViewById(R.id.lblListItem3);
        t8.setText(pgm.get(0));
        view4 =findViewById(R.id.edd3);

        t9= findViewById(R.id.lblListHeader4);
        t9.setText(listDataHeader.get(4));
        t10= findViewById(R.id.lblListItem4);
        t10.setText(sem.get(0));
        view5 =findViewById(R.id.edd4);

        t11= findViewById(R.id.lblListHeader5);
        t11.setText(listDataHeader.get(5));
        t12= findViewById(R.id.lblListItem5);
        t12.setText(pgct.get(0));
        view6 =findViewById(R.id.edd5);


        t13= findViewById(R.id.lblListHeader6);
        t13.setText(listDataHeader.get(6));
        t14= findViewById(R.id.lblListItem6);
        t14.setText(mc.get(0));
        view7 =findViewById(R.id.edd6);





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
            c4=false;
            t8.setVisibility(TextView.GONE);
            view4.setVisibility(View.GONE);
        }
    }

    public void headerClick4(View view) {

        if(c5 == false){
            c5=true;
            t10.setVisibility(TextView.VISIBLE);
            view5.setVisibility(View.VISIBLE);
        }
        else {
            c5=false;
            t10.setVisibility(TextView.GONE);
            view5.setVisibility(View.GONE);
        }
    }

    public void headerClick5(View view) {

        if(c6 == false){
            c6=true;
            t12.setVisibility(TextView.VISIBLE);
            view6.setVisibility(View.VISIBLE);
        }
        else {
            c6=false;
            t12.setVisibility(TextView.GONE);
            view6.setVisibility(View.GONE);
        }
    }

    public void headerClick6(View view) {

        if(c7 == false){
            c7=true;
            t14.setVisibility(TextView.VISIBLE);
            view7.setVisibility(View.VISIBLE);
        }
        else {
            c7=false;
            t14.setVisibility(TextView.GONE);
            view7.setVisibility(View.GONE);
        }
    }


}
