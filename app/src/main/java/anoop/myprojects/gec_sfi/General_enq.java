package anoop.myprojects.gec_sfi;


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
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class General_enq extends Fragment {

    TextView music,dance,drama,media,design,sports,beauti;


    public General_enq() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_general_enq, container, false);

        music = view.findViewById(R.id.ca);
        dance= view.findViewById(R.id.c1);
        drama= view.findViewById(R.id.c2);
        media= view.findViewById(R.id.c3);
        design= view.findViewById(R.id.c4);
        sports= view.findViewById(R.id.sergeant);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
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

                case R.id.ca:


                    try {

                        intent.setData(Uri.parse("tel:9495450661"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.c1:


                    try {

                        intent.setData(Uri.parse("tel:9747700598"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.c2:


                    try {

                        intent.setData(Uri.parse("tel:8089494197"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.c3:


                    try {

                        intent.setData(Uri.parse("tel:9400566754"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.c4:


                    try {

                        intent.setData(Uri.parse("tel:9747442801"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.sergeant:


                    try {

                        intent.setData(Uri.parse("tel:9744930340"));
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
