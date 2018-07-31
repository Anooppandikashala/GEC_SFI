package anoop.myprojects.gec_sfi;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class AntiRaging extends Fragment {

    ListView list;
    String[] Name = {
            "Goutham Raj (S7 CSE)",
            "Rohith K (S5 CSE)",
            "T S Lakmesh Kumar (S5 ECE)",
            "Akhil T (S5 ME)",
            "Anoop CP (S3 ECE)",
            "Muhammed MS (S3 ECE)",
            "Roy Antony(S3 ME)",
            "Bahir (S3 ME",
            "Ajana E A (S3EEE)",
            "Rabia (S3 IT)",
            "Hemang (S3 CSE)"


    } ;
    Integer[] imageId = {
            R.mipmap.goutham,
            R.mipmap.rohith,
            R.mipmap.lakku,
            R.mipmap.akhil,
            R.mipmap.anooppk,
            R.mipmap.muhammed,
            R.mipmap.roy,
            R.drawable.user,
            R.mipmap.anjan,
            R.mipmap.rabia,
            R.mipmap.hemang





    };
    String[] Title = {
            "Convener",
            "Joint Convener",
            "Member",
            "Member",
            "Member",
            "Member",
            "Member",
            "Member","Member","Member","Member"
    } ;
    String[] Mob = {
            "9496329344",
            "8943802456",
            "9497667622",
            "8015890375",
            "9072252008",
            "9526210113",
            "7907160314",
            "9846800773",
            "8156811291",
            "7034522281",
            "9447806863"
    } ;


    public AntiRaging() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_anti_raging, container, false);


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
                Toast.makeText(getContext(), "You Clicked at " +Mob[position], Toast.LENGTH_SHORT).show();
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
