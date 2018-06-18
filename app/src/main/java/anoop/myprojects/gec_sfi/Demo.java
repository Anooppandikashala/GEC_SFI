package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Demo extends AppCompatActivity {

    TextView t1,t2;
    View view1;
    boolean c=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        t1= findViewById(R.id.lblListHeader);
        t2= findViewById(R.id.lblListItem);
        view1 =findViewById(R.id.edd);

    }

    public void headerClick(View view) {

        if(c == false){
            c=true;
            t2.setVisibility(TextView.VISIBLE);
            view1.setVisibility(View.VISIBLE);
        }
        else {
            c=false;
            t2.setVisibility(TextView.GONE);
            view1.setVisibility(View.GONE);
        }

    }
}
