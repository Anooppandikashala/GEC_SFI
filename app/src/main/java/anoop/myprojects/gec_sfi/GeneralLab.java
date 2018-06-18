package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneralLab extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_lab);



        t1= findViewById(R.id.lblListHeader);
        t2= findViewById(R.id.lblListItem);
        view1 =findViewById(R.id.edd);

        t3= findViewById(R.id.lblListHeader1);
        t4= findViewById(R.id.lblListItem1);
        view2 =findViewById(R.id.edd1);

        t5= findViewById(R.id.lblListHeader2);
        t6= findViewById(R.id.lblListItem2);
        view3 =findViewById(R.id.edd2);

        t7= findViewById(R.id.lblListHeader3);
        t8= findViewById(R.id.lblListItem3);
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
            c4=false;
            t8.setVisibility(TextView.GONE);
            view4.setVisibility(View.GONE);
        }
    }
}
