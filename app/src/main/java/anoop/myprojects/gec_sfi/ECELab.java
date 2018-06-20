package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ECELab extends AppCompatActivity {

    TextView t1,t2;
    TextView t3,t4;
    TextView t5,t6;
    TextView t7,t8;
    TextView t9,t10;
    TextView t11,t12;

    View view1;
    View view2;
    View view3;
    View view4;
    View view5;
    View view6;

    boolean c1=false;
    boolean c2=false;
    boolean c3=false;
    boolean c4=false;
    boolean c5=false;
    boolean c6=false;


    private List<String> listDataHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecelab);


        listDataHeader = new ArrayList<>();

        listDataHeader.add("Electronic circuits lab");
        listDataHeader.add("Advanced communication lab");
        listDataHeader.add("AC/DC lab");
        listDataHeader.add("Digital circuits &amp; Microprocessor lab");
        listDataHeader.add("Computer lab");
        listDataHeader.add("Project lab");
        //listDataHeader.add("AC/DC lab");

        //listDataHeader.add("CERD");

        List<String> ele = new ArrayList<>();
        ele.add("The laboratory is well equipped to conduct " +
                "experiments related to courses on Electronic " +
                "circuits and Devices, Power electronics and " +
                "Instrumentation and Analog integrated circuits.");

        List<String> acl = new ArrayList<>();
        acl.add("This laboratory is equipped with modern apparatus and setups " +
                "for conducting experiments based on Communication systems " +
                "and VLSI Design. Microwave and optical fibre based " +
                "experiments are also performed here . Special facilities of " +
                "Network analyser and calibration kits are available for analysing " +
                "fabricated antennas.");

        List<String> acdc = new ArrayList<>();
        acdc.add("This laboratory helps the students to learn and analyse various " +
                "techniques of analog and digital transmission .Basic electronic " +
                "engineering lab and Communication Engineering lab are being " +
                "conducted here.");

        List<String> dcm = new ArrayList<>();
        dcm.add("The laboratory is well equipped to conduct experiments related " +
                "to courses on Logic circuit design, Digital Signal Processing and " +
                "Microprocessors and Microcontrollers lab. 8086,8051 based " +
                "trainer kits are available to do assembly level programming " +
                "with interfacing concepts.");

        List<String> cl = new ArrayList<>();
        cl.add("The lab is well equipped with softwares for conducting " +
                "experiments based on Electronic design and automation. " +
                "Antenna design software HFSS and VLSI design software Xilinx " +
                "are the special softwares available.");

        List<String> pl = new ArrayList<>();
        pl.add("This lab is developed with best facilities for supporting the " +
                "development of innovative academic projects of students, " +
                "mainly miniprojects and main projects. It is partially funded " +
                "by TEQUIP fund and is equipped with facilities like PCB " +
                "fabrication machine,soldering station,etc. itcover also provides the " +
                "oppurtunity to use RF network analyzer for facilitating the " +
                "development of projects on sensor networks.");



        t1= findViewById(R.id.lblListHeader);
        t1.setText(listDataHeader.get(0));
        t2= findViewById(R.id.lblListItem);
        t2.setText(ele.get(0));
        view1 =findViewById(R.id.edd);

        t3= findViewById(R.id.lblListHeader1);
        t3.setText(listDataHeader.get(1));
        t4= findViewById(R.id.lblListItem1);
        t4.setText(acl.get(0));
        view2 =findViewById(R.id.edd1);

        t5= findViewById(R.id.lblListHeader2);
        t5.setText(listDataHeader.get(2));
        t6= findViewById(R.id.lblListItem2);
        t6.setText(acdc.get(0));
        view3 =findViewById(R.id.edd2);

        t7= findViewById(R.id.lblListHeader3);
        t7.setText(listDataHeader.get(3));
        t8= findViewById(R.id.lblListItem3);
        t8.setText(dcm.get(0));
        view4 =findViewById(R.id.edd3);

        t9= findViewById(R.id.lblListHeader4);
        t9.setText(listDataHeader.get(4));
        t10= findViewById(R.id.lblListItem4);
        t10.setText(cl.get(0));
        view5 =findViewById(R.id.edd4);

        t11= findViewById(R.id.lblListHeader5);
        t11.setText(listDataHeader.get(5));
        t12= findViewById(R.id.lblListItem5);
        t12.setText(pl.get(0));
        view6 =findViewById(R.id.edd5);







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


}
