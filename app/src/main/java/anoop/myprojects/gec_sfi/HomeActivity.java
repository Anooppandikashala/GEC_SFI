package anoop.myprojects.gec_sfi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button enquiry,union,credits,facilities;
    String msg="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        /*enquiry=(Button)findViewById(R.id.enquiry);
        union=(Button)findViewById(R.id.union);
        facilities=(Button)findViewById(R.id.facilities);
        credits=(Button)findViewById(R.id.credits);*/

    }

    public void Events(View view) {
        /*Intent i = new Intent(this, Palakkad.class);
        startActivity(i);*/
        msg = "event";
        System.out.println("hello");
        Intent intent = new Intent(HomeActivity.this, Navgation.class);
        intent.putExtra("message", msg);

        startActivity(intent);
    }

    public void Enquiry(View view) {
        /*Intent i = new Intent(this, Palakkad.class);
        startActivity(i);*/
        msg = "enq";
        System.out.println("hello");
        Intent intent = new Intent(HomeActivity.this, Navgation.class);
        intent.putExtra("message", msg);

        startActivity(intent);
    }

    public void unions(View view) {
        /*Intent i = new Intent(this, Palakkad.class);
        startActivity(i);*/
        msg = "union";
        System.out.println("hello");
        Intent intent = new Intent(HomeActivity.this, Navgation.class);
        intent.putExtra("message", msg);

        startActivity(intent);
    }




    @Override
    public void onBackPressed() {
        this.finish();
        Intent intent= new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);

        //super.onBackPressed();
    }
}
