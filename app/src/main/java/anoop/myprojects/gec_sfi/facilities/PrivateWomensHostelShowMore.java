package anoop.myprojects.gec_sfi.facilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import anoop.myprojects.gec_sfi.R;

public class PrivateWomensHostelShowMore extends AppCompatActivity {

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


    boolean c1=false;
    boolean c2=false;
    boolean c3=false;
    boolean c4=false;
    boolean c5=false;



    private List<String> listDataHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_womens_hostel_show_more);

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrivateWomensHostelShowMore.super.onBackPressed();
            }
        });


        listDataHeader = new ArrayList<>();

        listDataHeader.add("Sarovaram Hostel");
        listDataHeader.add("Ramanilayam Hostel");
        listDataHeader.add("Aaramam Hostel");
        listDataHeader.add("Souparnika Hostel");
        listDataHeader.add("Parvathy Nilayam ");
        //listDataHeader.add("AC/DC lab");

        //listDataHeader.add("CERD");

        List<String> ele = new ArrayList<>();
        ele.add("Owner : 9947123341\n" +
                "Advance : 3000\n" +
                "Monthly : 2800\n" +
                "Accommodation with Food\n" +
                "Free WiFi\n" +
                "Distance : 20m from college");

        List<String> acl = new ArrayList<>();
        acl.add("Owner: 9961613286, 9447135436\n" +
                "Advance : 3000\n" +
                "Rent 800\n" +
                "Distance : 1km from college\n" +
                "Food available ");

        List<String> acdc = new ArrayList<>();
        acdc.add("Owner : 8301815803\n" +
                "Advance 3100\n" +
                "Monthly 3100\n" +
                "Accommodation with Food\n" +
                "Distance 50m from college");

        List<String> dcm = new ArrayList<>();
        dcm.add("Owner : 9744720998, 9745224088\n" +
                "Advance 5000\n" +
                "Rent 1000\n" +
                "Mess nearby");

        List<String> cl = new ArrayList<>();
        cl.add("Contact: 9895609803 \n" +
                "Fees : 3100/month\n" +
                "(2000 rent and 1100 mess bill)\n" +
                "Advance : 3100.\n" +
                "Current strength : 80 students.\n" +
                "Distance: 1.5 km from college.");





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


}
