package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MELab extends AppCompatActivity {


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

        listDataHeader.add("Machine Shop I  and II");
        listDataHeader.add("Basic Mechanical Workshop");
        listDataHeader.add("Fluids Lab");
        listDataHeader.add("Thermal Engineering Lab I and II");
        listDataHeader.add("Instrumentation Lab");
        listDataHeader.add("CADD Lab");

        //listDataHeader.add("CERD");

        List<String> mech = new ArrayList<>();
        mech.add("This lab is equipped with different cutting machines which include lathes,gear cutting machines and shaper etc.\n " +
                "Lab incharges:\n" +
                "1. Dr. A selvakumar\n" +
                "2. J Jayakrishnan.");

        List<String> BMW = new ArrayList<>();
        BMW.add("Basic mechanical workshops include smithy, turning, fitting, carpentary," +
                " welding, sheetmetal, foundary , which are intended to give short ideas to " +
                "students regarding their working procedure.mainly for first year students.\n" +
                "Lab incharges:\n" +
                "i) Smithy:    Murali\n" +
                "ii) Turning:  Jayaprakash\n" +
                "iii) Fitting:     Anjali\n" +
                "iv) Carpentary: Kishorekumar\n" +
                "v) Welding:  Ramesh\n" +
                "vi) Sheetmetal:Priyadarsan\n" +
                "vii) Foundry: Saravanan");

        List<String> fluid = new ArrayList<>();
        fluid.add("This fluid lab has been equipped with different flow " +
                "measuring instruments, turbines. Mainly used to study flow " +
                "charaterstics of fluids mainly water.\n" +
                "Lab incharges:\n" +
                "\t Rajan sir");

        List<String> thermal = new ArrayList<>();
        thermal.add("Mainly consists of heat flow measuring instruments," +
                " petrol engine study, diesel engine study, refrigerant characteristic study, and Many more.\n" +
                "Lab incharges:\n" +
                "\t Rajan sir");

        List<String> il = new ArrayList<>();
        il.add("This lab mainly focuses on the caliberation" +
                " of different instruments used in day to day applications in factories or households.\n" +
                "Lab incharges:\n" +
                "\tLeeju sir.");

        List<String> cadd = new ArrayList<>();
        cadd.add("Helps in the study of different cad softwares like nastran ,catia,auto CAD etc.\n" +
                "Lab incharges:\n" +
                "\tLeeju sir.");



        t1= findViewById(R.id.lblListHeader);
        t1.setText(listDataHeader.get(0));
        t2= findViewById(R.id.lblListItem);
        t2.setText(mech.get(0));
        view1 =findViewById(R.id.edd);

        t3= findViewById(R.id.lblListHeader1);
        t3.setText(listDataHeader.get(1));
        t4= findViewById(R.id.lblListItem1);
        t4.setText(BMW.get(0));
        view2 =findViewById(R.id.edd1);

        t5= findViewById(R.id.lblListHeader2);
        t5.setText(listDataHeader.get(2));
        t6= findViewById(R.id.lblListItem2);
        t6.setText(fluid.get(0));
        view3 =findViewById(R.id.edd2);

        t7= findViewById(R.id.lblListHeader3);
        t7.setText(listDataHeader.get(3));
        t8= findViewById(R.id.lblListItem3);
        t8.setText(thermal.get(0));
        view4 =findViewById(R.id.edd3);

        t9= findViewById(R.id.lblListHeader4);
        t9.setText(listDataHeader.get(4));
        t10= findViewById(R.id.lblListItem4);
        t10.setText(il.get(0));
        view5 =findViewById(R.id.edd4);

        t11= findViewById(R.id.lblListHeader5);
        t11.setText(listDataHeader.get(5));
        t12= findViewById(R.id.lblListItem5);
        t12.setText(cadd.get(0));
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
