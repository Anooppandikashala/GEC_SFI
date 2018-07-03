package anoop.myprojects.gec_sfi;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class News extends Fragment {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModelNews> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;
    TextView error;
    int c=0;


    public News() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_news, container, false);
        error =view.findViewById(R.id.error);


       // final ProgressDialog progressDialog =new ProgressDialog(getContext());
        //progressDialog.setMessage("Loading News....");
        //progressDialog.show();


        recyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view_noti);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataModelNews>();

        //removedItems = new ArrayList<Integer>();

        adapter = new CustomAdapterNews(getContext(),data);
        recyclerView.setAdapter(adapter);





        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://gecapp-e3c7f.firebaseio.com/notifications");




        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

               // progressDialog.dismiss();

                String key=dataSnapshot.getKey();

                String value=dataSnapshot.getValue(String.class);


                data.add(new DataModelNews(
                        key,
                        value,
                        c,value
                ));
                adapter.notifyDataSetChanged();

                /*listDataHeader.add(key);
                listDataDesc.add(value);

                listHash.put(listDataHeader.get(count),listDataDesc.get(count));

                listAdapter.notifyDataSetChanged();*/

                c++;



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

        return view;
    }

}
