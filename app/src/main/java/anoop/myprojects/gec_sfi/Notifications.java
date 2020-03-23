package anoop.myprojects.gec_sfi;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Collections;

import anoop.myprojects.gec_sfi.adapters.CustomAdapterNotification;
import anoop.myprojects.gec_sfi.data_models.DataModelNotification;

public class Notifications extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModelNotification> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;
    TextView error;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        error =findViewById(R.id.error);

        if(Global.badge ==true){

            Global.badge=false;
        }

        final ProgressDialog progressDialog =new ProgressDialog(this);
        progressDialog.setMessage("Loading Notifications....");
        progressDialog.show();

        myOnClickListener = new MyOnClickListener(this);

        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view_noti);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataModelNotification>();

        //removedItems = new ArrayList<Integer>();

        adapter = new CustomAdapterNotification(data);
        recyclerView.setAdapter(adapter);





        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://gecapp-e3c7f.firebaseio.com/notifications");




        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                progressDialog.dismiss();

                String key=dataSnapshot.getKey();

                String value=dataSnapshot.getValue(String.class);


                data.add(new DataModelNotification(
                        key,
                        value,
                        c++
                ));

                if(c>0)
                {
                    //progressDialog.dismiss();
                    error.setVisibility(TextView.GONE);
                }

                Collections.reverse(data);

                adapter.notifyDataSetChanged();

                /*listDataHeader.add(key);
                listDataDesc.add(value);

                listHash.put(listDataHeader.get(count),listDataDesc.get(count));

                listAdapter.notifyDataSetChanged();*/

                //c++;



                //String result=key+":\n"+value;

                //mProductList.add(new Product(count++,key,value));



                //mUsername.add(result);
                //arrayAdapter.notifyDataSetChanged();

                //adapter.notifyDataSetChanged();

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

                error.setVisibility(TextView.VISIBLE);
            }
        });


        if(0==c)
        {
            progressDialog.dismiss();
            error.setVisibility(TextView.VISIBLE);
        }




    }

    private static class MyOnClickListener implements View.OnClickListener {

        private final Context context;

        private MyOnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            removeItem(v);
        }

        private void removeItem(View v) {
            int selectedItemPosition = recyclerView.getChildPosition(v);
            RecyclerView.ViewHolder viewHolder
                    = recyclerView.findViewHolderForPosition(selectedItemPosition);
            TextView textViewid
                    = (TextView) viewHolder.itemView.findViewById(R.id.textViewid);
            int selectedid = Integer.valueOf(textViewid.getText().toString());
            /*int selectedItemId = -1;
            for (int i = 0; i < MyData.id_.length; i++) {
                if (selectedName.equals(MyData.nameArray[i])) {
                    selectedItemId = MyData.id_[i];
                }
            }*/

            //Toast.makeText(context,MyData.nameArray[selectedid],Toast.LENGTH_SHORT).show();
            Toast.makeText(context,String.valueOf(selectedid),Toast.LENGTH_SHORT).show();



            //removedItems.add(selectedItemId);

            //data.remove(selectedItemPosition);
            //adapter.notifyItemRemoved(selectedItemPosition);
        }
    }


    /*private void addRemovedItemToList() {
        int addItemAtListPosition = 3;
        data.add(addItemAtListPosition, new DataModel(
                MyData.nameArray[removedItems.get(0)],
                MyData.versionArray[removedItems.get(0)],
                MyData.id_[removedItems.get(0)],
                MyData.drawableArray[removedItems.get(0)]
        ));
        adapter.notifyItemInserted(addItemAtListPosition);
        removedItems.remove(0);
    }*/
}
