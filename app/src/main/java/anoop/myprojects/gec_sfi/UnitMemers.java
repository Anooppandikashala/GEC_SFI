package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


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
    Integer[] imageId = {
            R.drawable.info,
            R.drawable.user,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.info,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.user,
            R.drawable.info,
            R.drawable.info

    };


    public UnitMemers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_unit_memers, container, false);

        CustomList adapter = new
                CustomList(getActivity(), Title,Name,Mob, imageId);
        list=(ListView)view.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getContext(), "You Clicked at " +Mob[position], Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }

}
