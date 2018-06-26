package anoop.myprojects.gec_sfi;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomeActivity extends AppCompatActivity {

    Button enquiry,union,credits,facilities;
    //public static boolean badge=false;
    String msg="";
    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);





        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://gecapp-e3c7f.firebaseio.com/notifications");



        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

               // progressDialog.dismiss();

                //Global.badge=true;



            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                //error.setVisibility(TextView.VISIBLE);
            }
        });





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
    public void facilities(View view) {
        /*Intent i = new Intent(this, Palakkad.class);
        startActivity(i);*/
        msg = "fac";
        System.out.println("hello");
        Intent intent = new Intent(HomeActivity.this, Navgation.class);
        intent.putExtra("message", msg);

        startActivity(intent);
    }
    public void credits(View view) {
        /*Intent i = new Intent(this, Palakkad.class);
        startActivity(i);*/
        msg = "crd";
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
