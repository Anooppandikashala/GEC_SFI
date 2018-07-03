package anoop.myprojects.gec_sfi;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class Staffs extends Fragment {

    LinearLayout princi,it,ec,me,eee,cse,phy,maths,civil;


    public Staffs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_staffs, container, false);

        princi=view.findViewById(R.id.princi);
        me =view.findViewById(R.id.me_hod);
        eee=view.findViewById(R.id.eee_hod);
        cse=view.findViewById(R.id.cse_hod);
        phy=view.findViewById(R.id.phy);
        maths=view.findViewById(R.id.maths);
        civil=view.findViewById(R.id.civil);
        ec=view.findViewById(R.id.ec_hod);
        it=view.findViewById(R.id.it_hod);

        princi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        civil.setOnClickListener(new View.OnClickListener() {
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

                case R.id.princi:


                    try {

                        intent.setData(Uri.parse("tel:04662260350"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.ec_hod:


                    try {

                        intent.setData(Uri.parse("tel:9495822605"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.it_hod:


                    try {

                        intent.setData(Uri.parse("tel:9746475534"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.cse_hod:


                    try {

                        intent.setData(Uri.parse("tel:9495785370"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.eee_hod:


                    try {

                        intent.setData(Uri.parse("tel:9495070478"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.me_hod:


                    try {

                        intent.setData(Uri.parse("tel:9447236580"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.phy:


                    try {

                        intent.setData(Uri.parse("tel:9846272290"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.maths:


                    try {

                        intent.setData(Uri.parse("tel:9037189624"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.civil:


                    try {

                        intent.setData(Uri.parse("tel:9446148112"));
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
