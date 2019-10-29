package anoop.myprojects.gec_sfi.sfi_gec;


import android.*;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import anoop.myprojects.gec_sfi.CustomList;
import anoop.myprojects.gec_sfi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UnitMemers extends Fragment {

    ListView list;
    String[] Name = {
            "Ajil vijayan (S7ME)",
            "Muhammed sajid \nmusaliyar(S7IT)",
            "Akhil madhav(S7CSE)",
            "Fahmidha M(S5EEE)",
            "Rohith K (S5CSE)",
            "Dhilraj soza (S7ME)",
            "Jidhu krishna (S7CSE) ",
            "Ajana E A (S3EEE)","Arjun vijayan (S7ME)",
            "Krishnakanth R (S5EEE)",
            "Thoufiq Ameen Khan(S5 IT)",
            "T S Lakmesh Kumar (S5 ECE)","Akhil T (S5ME)",
            "Sanju S(S5ME)",
            "Anjali raj k(S5CSE)","Niranjan TB(S3CSE)",
            "Anoop CP (S3ECE)","Muhammed MS (S3ECE) ",
            "Rabiya(S3IT)","Akhil P(S3EEE)",
            "Akhilesh (S7ECE)","Rahul ks (S3ME)","Rajeesh T(S7IT)",
            "Roy Antony(S3ME)","Sabin Munavir KV(S5EEE)",
            "Gautham raj(S7CSE)","Sabik (S7ECE)"

    } ;
    Integer[] imageId = {
            R.mipmap.ajil,
            R.mipmap.sajid,
            R.mipmap.akhilmadav,
            R.mipmap.fahmi,
            R.mipmap.rohith,
            R.mipmap.dhilrajsoza,
            R.mipmap.jidhukrishna,
            R.mipmap.anjan,
            R.mipmap.arjunvijayan,
            R.mipmap.krishnakanth,
            R.mipmap.thoufeek,
            R.mipmap.lakku,
            R.mipmap.akhil,
            R.mipmap.sanju,
            R.mipmap.anjali,
            R.mipmap.niranjan,
            R.mipmap.anooppk,
            R.mipmap.muhammed,
            R.mipmap.rabia,
            R.mipmap.akhilp,
            R.mipmap.akhilesh,
            R.mipmap.rahul,R.mipmap.rajeesh,
            R.mipmap.roy,R.mipmap.sabin,
            R.mipmap.goutham,R.mipmap.sabik



    };
    String[] Title = {
            "Secretary",
            "President",
            "Vice president",
            "Vice president",
            "Joint secretary",
            "Joint secretary",
            "Member",
            "Member",
            "Member",
            "Member",
            "Member",
            "Member","Member","Member","Member","Member","Member","Member","Member",
            "Member",
            "Member",
            "Member",
            "Member","Member","Member","Member","Member"
    } ;
    String[] Mob = {
            "8089293163",
            "9061842389",
            "8891309613",
            "9895664298",
            "8943802456",
            "7736118919",
            "8289820401",
            "8156811291",
            "9947614935",
            "9895401009","9745796972","9497667622","8015890375",
            "8137898310","8547025321",
            "9496959327","9072252008","9526210113","7034522281","7034794427",
            "9497021050",
            "9544394188","7025504252","7907160314","9744560260","9496329344","8891284053"
    } ;



    public UnitMemers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_unit_memers, container, false);

        if(!runtime_permissions()){
            //Intent i =new Intent(getApplicationContext(),GPS_Service.class);
            //startService(i);
            enable_buttons();

        }

        CustomList adapter = new
                CustomList(getActivity(), Title,Name,Mob, imageId);
        list=(ListView)view.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(getContext(), "You Clicked at " +Mob[position], Toast.LENGTH_SHORT).show();
                try {

                    Intent intent = new Intent(Intent.ACTION_CALL);
                    if (ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }

                    try {
                        String mobbb=Mob[position];
                        mobbb =mobbb.trim();

                        intent.setData(Uri.parse("tel:"+mobbb));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }



                }
                catch(Exception e){

                    e.printStackTrace();
                }

            }
        });



        return view;
    }

    private boolean runtime_permissions() {

        try {
            if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(getContext(), android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                requestPermissions(new String[]{android.Manifest.permission.CALL_PHONE}, 100);

                return true;
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        try {

            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            if (requestCode == 100) {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                    enable_buttons();
                } else {
                    runtime_permissions();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void enable_buttons(){
        //nothing to do
    }





}
