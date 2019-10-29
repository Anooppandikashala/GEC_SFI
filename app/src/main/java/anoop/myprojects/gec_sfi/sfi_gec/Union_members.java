package anoop.myprojects.gec_sfi.sfi_gec;


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
public class Union_members extends Fragment {

    LinearLayout chair,lvc,ranjith,minhaj,reshma,finearts,editor,ec,it,cse,me,eee,first,second,third,mtech;


    public Union_members() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_union_members, container, false);

        chair=view.findViewById(R.id.chairman);
        lvc =view.findViewById(R.id.lvc);
        ranjith=view.findViewById(R.id.ranjith);
        minhaj=view.findViewById(R.id.minhaj);
        reshma=view.findViewById(R.id.jointsecretary);
        finearts=view.findViewById(R.id.finearts);
        editor=view.findViewById(R.id.editor);
        ec=view.findViewById(R.id.ec);
        it=view.findViewById(R.id.it);
        cse=view.findViewById(R.id.cse);
        me=view.findViewById(R.id.me);
        eee=view.findViewById(R.id.eee);
        first=view.findViewById(R.id.first);
        second=view.findViewById(R.id.second);
        third=view.findViewById(R.id.third);
        mtech=view.findViewById(R.id.mtech);



        /*chair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });

        lvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        ranjith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        minhaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        reshma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        finearts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        editor.setOnClickListener(new View.OnClickListener() {
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
        it.setOnClickListener(new View.OnClickListener() {
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
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });
        mtech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click(v);

            }
        });*/


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

                case R.id.chairman:


                    try {

                        intent.setData(Uri.parse("tel:7907069259"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.lvc:


                    try {

                        intent.setData(Uri.parse("tel:9742583510"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.ranjith:


                    try {

                        intent.setData(Uri.parse("tel:9605799688"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.minhaj:


                    try {

                        intent.setData(Uri.parse("tel:9895347246"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.jointsecretary:


                    try {

                        intent.setData(Uri.parse("tel:9544519864"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.finearts:


                    try {

                        intent.setData(Uri.parse("tel:7736118919"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.editor:


                    try {

                        intent.setData(Uri.parse("tel:7907140627"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.ec:


                    try {

                        intent.setData(Uri.parse("tel:9447968952"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.me:


                    try {

                        intent.setData(Uri.parse("tel:8113067549"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.cse:


                    try {

                        intent.setData(Uri.parse("tel:8593858494"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.it:


                    try {

                        intent.setData(Uri.parse("tel:7034994977"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.eee:


                    try {

                        intent.setData(Uri.parse("tel:9744560260"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.first:


                    try {

                        intent.setData(Uri.parse("tel:9947208919"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.second:


                    try {

                        intent.setData(Uri.parse("tel:9947614935"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.third:


                    try {

                        intent.setData(Uri.parse("tel:9744763706"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.mtech:


                    try {

                        intent.setData(Uri.parse("tel:9495542243"));
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
