package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PrivateMensHostelShowMore extends AppCompatActivity {

    TextView t1,t2;
    TextView t3,t4;
    TextView t5,t6;

    View view1;
    View view2;
    View view3;


    boolean c1=false;
    boolean c2=false;
    boolean c3=false;


    private List<String> listDataHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_mens_hostel_show_more);

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrivateMensHostelShowMore.super.onBackPressed();
            }
        });


        listDataHeader = new ArrayList<>();

        listDataHeader.add("Whitehouse Hostel");
        listDataHeader.add("Sabareesh Hostel");
        listDataHeader.add("Manjalangadan Hostel");


        //listDataHeader.add("CERD");

        List<String> wht = new ArrayList<>();
        wht.add("Contact :  9496393865 \n" +
                "Location : Infront of college\n" +
                "Advance 5000\n" +
                "Rent 800\n" +
                "Mess Available");
        List<String> sb = new ArrayList<>();
        sb.add("Contact : 9447075892\n" +
                "Advance :8000\n" +
                "Monthly : 4000 \n" +
                "1000 rent + 3000 food \n" +
                "(Accommodation with Food)\n" +
                "Distance : 1km from college \n" +
                "(Neelamangalam sabareesh hostel)\n" +
                "Current bill Extra");

        List<String> mj = new ArrayList<>();
        mj.add("Contact : 9746005816\n(Kunjappu)");




        //listDataHeader.add("CERD");

        t1= findViewById(R.id.lblListHeader);
        t1.setText(listDataHeader.get(0));
        t2= findViewById(R.id.lblListItem);
        t2.setText(wht.get(0));
        view1 =findViewById(R.id.edd);

        t3= findViewById(R.id.lblListHeader1);
        t3.setText(listDataHeader.get(1));
        t4= findViewById(R.id.lblListItem1);
        t4.setText(sb.get(0));
        view2 =findViewById(R.id.edd1);

        t5= findViewById(R.id.lblListHeader2);
        t5.setText(listDataHeader.get(2));
        t6= findViewById(R.id.lblListItem2);
        t6.setText(mj.get(0));
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
}
