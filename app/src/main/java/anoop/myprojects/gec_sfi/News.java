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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class News extends Fragment{

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModelNews> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    private RecyclerView mRecyclerView;
    private ImageAdapter mAdapter;

    private ProgressBar mProgressCircle;

    private FirebaseStorage mStorage;
    private DatabaseReference mDatabaseRef;
    private ValueEventListener mDBListener;

    private List<Upload> mUploads;


    TextView error;
    int c=0;
    boolean liveStatus=false;
    LinearLayout liveLayout;

    LiveClass liveClass;

    TextView titleLiveTv,teamsLiveTv,venueLiveTv,team1LiveTv,over1LiveTv,team2LiveTv,over2LiveTv;

    String titleLive,teamsLive,venueLive,team1Live,over1Live,team2Live,over2Live,color1Live,color2Live;

    ImageView team1ColorLive,team2ColorLive;


    public News() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_news, container, false);
        error =view.findViewById(R.id.error);

        liveLayout =view.findViewById(R.id.liveLayout);


        team1ColorLive= view.findViewById(R.id.LiveTeamColor1);
        team2ColorLive= view.findViewById(R.id.LiveTeamColor2);

        titleLiveTv= view.findViewById(R.id.LiveHead);
        teamsLiveTv= view.findViewById(R.id.LiveTeams);
        venueLiveTv= view.findViewById(R.id.LiveVenue);
        team1LiveTv= view.findViewById(R.id.LiveTeam1);
        over1LiveTv= view.findViewById(R.id.LiveOver1);
        team2LiveTv= view.findViewById(R.id.LiveTeam2);
        over2LiveTv= view.findViewById(R.id.LiveOver2);



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

        DatabaseReference databaseReferencelive = FirebaseDatabase.getInstance().getReferenceFromUrl("https://gecapp-e3c7f.firebaseio.com/live");
        databaseReferencelive.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                System.out.println("status1:"+dataSnapshot.child("status").getValue(String.class));

                String status=dataSnapshot.child("status").getValue(String.class);
                if(status.equals("true")){
                    liveStatus=true;
                }else {
                    liveStatus=false;
                }
                if(liveStatus){
                    liveLayout.setVisibility(View.VISIBLE);
                    showLiveScores(dataSnapshot);
                }
                else {
                    liveLayout.setVisibility(View.GONE);
                }




            }

            @Override
            public void onCancelled(DatabaseError databaseError) {



            }
        });

        mRecyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view_noti);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

       // mProgressCircle = view.findViewById(R.id.progress_circle);

        mUploads = new ArrayList<>();

        mAdapter = new ImageAdapter(getContext(), mUploads);

        mRecyclerView.setAdapter(mAdapter);

        //mAdapter.setOnItemClickListener();

        mStorage = FirebaseStorage.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("uploads");

        mDBListener = mDatabaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                mUploads.clear();

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Upload upload = postSnapshot.getValue(Upload.class);
                    upload.setKey(postSnapshot.getKey());
                    mUploads.add(upload);
                }

                mAdapter.notifyDataSetChanged();

                //mProgressCircle.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(getContext(), databaseError.getMessage(), Toast.LENGTH_SHORT).show();
                //mProgressCircle.setVisibility(View.INVISIBLE);
            }
        });








/*
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://gecapp-e3c7f.firebaseio.com/uploads");

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



                c++;





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
        });*/

        return view;
    }

    private void showLiveScores(DataSnapshot dataSnapshot) {

        liveLayout.setVisibility(View.VISIBLE);

        titleLive=dataSnapshot.child("title").getValue(String.class);
        teamsLive=dataSnapshot.child("teams").getValue(String.class);
        venueLive=dataSnapshot.child("venue").getValue(String.class);
        team1Live=dataSnapshot.child("team1").getValue(String.class);
        over1Live=dataSnapshot.child("over1").getValue(String.class);
        team2Live=dataSnapshot.child("team2").getValue(String.class);
        over2Live=dataSnapshot.child("over2").getValue(String.class);
        color1Live=dataSnapshot.child("color1").getValue(String.class);
        color2Live=dataSnapshot.child("color2").getValue(String.class);

        titleLiveTv.setText(titleLive);
        teamsLiveTv.setText(teamsLive);
        venueLiveTv.setText(venueLive);
        team1LiveTv.setText(team1Live);
        over1LiveTv.setText(over1Live);
        team2LiveTv.setText(team2Live);
        over2LiveTv.setText(over2Live);




    }

    public class LiveClass{

        public String title,teams,team1,team2,color1,color2,venue,over1,over2,status;

        public LiveClass(String title, String teams, String team1, String team2, String color1, String color2, String venue, String over1, String over2, String status) {
            this.title = title;
            this.teams = teams;
            this.team1 = team1;
            this.team2 = team2;
            this.color1 = color1;
            this.color2 = color2;
            this.venue = venue;
            this.over1 = over1;
            this.over2 = over2;
            this.status=status;
        }
    }

}
