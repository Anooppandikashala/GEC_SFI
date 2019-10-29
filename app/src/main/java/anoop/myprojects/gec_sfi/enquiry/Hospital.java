package anoop.myprojects.gec_sfi.enquiry;


import android.Manifest;
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
import android.widget.LinearLayout;
import android.widget.Toast;

import anoop.myprojects.gec_sfi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hospital extends Fragment {

    LinearLayout skp,ktp,mgd,pkm;


    public Hospital() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hospital, container, false);

        skp=view.findViewById(R.id.skp);
        ktp=view.findViewById(R.id.ktp);
        mgd=view.findViewById(R.id.mgd);
        pkm=view.findViewById(R.id.pkm);

        skp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        ktp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        mgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        pkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });

        if(!runtime_permissions()){
            //Intent i =new Intent(getApplicationContext(),GPS_Service.class);
            //startService(i);
            enable_buttons();

        }


        return  view;
    }
    private boolean runtime_permissions() {

        try {
            if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 100);

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
    public void click(View view) {

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


            switch (view.getId()) {

                case R.id.skp:


                    try {

                        intent.setData(Uri.parse("tel:04662260198"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.ktp:


                    try {

                        intent.setData(Uri.parse("tel:04662267267"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.pkm:


                    try {

                        intent.setData(Uri.parse("tel:04662260193"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.mgd:


                    try {

                        intent.setData(Uri.parse("tel:04662344601"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;








            }
        }
        catch(Exception e){

            e.printStackTrace();
        }



    }

}
