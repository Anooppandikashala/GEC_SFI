package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSELab extends AppCompatActivity {

    private ExpandableListView listView1,listView2,listView3,listView4;
    private ExpandableListAdapter listAdapter1,listAdapter2,listAdapter3,listAdapter4;
    private List<String> listDataHeader1,listDataHeader2,listDataHeader3,listDataHeader4;
    private HashMap<String,List<String>> listHash1,listHash2,listHash3,listHash4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cselab);


        listView1 = (ExpandableListView)findViewById(R.id.lvExpnet);
        listView2 = (ExpandableListView)findViewById(R.id.lvExpproject);
        listView3 = (ExpandableListView)findViewById(R.id.lvExpsoft);
        listView4 = (ExpandableListView)findViewById(R.id.lvExphard);
        initData();
        listAdapter1 = new ExpandableListAdapter(this,listDataHeader1,listHash1);
        listView1.setAdapter(listAdapter1);


        listAdapter2 = new ExpandableListAdapter(this,listDataHeader2,listHash2);
        listView2.setAdapter(listAdapter2);

        listAdapter3 = new ExpandableListAdapter(this,listDataHeader3,listHash3);
        listView3.setAdapter(listAdapter3);


        listAdapter4 = new ExpandableListAdapter(this,listDataHeader4,listHash4);
        listView4.setAdapter(listAdapter4);



    }

    private void initData() {
        listDataHeader1 = new ArrayList<>();
        listHash1 = new HashMap<>();


        listDataHeader2 = new ArrayList<>();
        listHash2 = new HashMap<>();

        listDataHeader3 = new ArrayList<>();
        listHash3 = new HashMap<>();

        listDataHeader4 = new ArrayList<>();
        listHash4 = new HashMap<>();

        listDataHeader1.add("Network Lab");
        listDataHeader2.add("Project Lab");
        listDataHeader3.add("Software Lab");
        listDataHeader4.add("Hardware Lab");

        //listDataHeader.add("CERD");

        List<String> network = new ArrayList<>();
        network.add("To conduct labs based on networking.\n" +
                "Lab in-charge:Mr. Sasikumar");

        List<String> project = new ArrayList<>();
        project.add("For students to work on their project implementations\n" +
                "Lab in-charge: Mr. Sasikumar");

        List<String> soft = new ArrayList<>();
        soft.add("To practice and conduct labs on programming languages. \n" +
                "Lab in-charge: Mr. Pradeep");
        List<String> hard = new ArrayList<>();
        hard.add("To practice and work on hardware equipment and machine language " +
                "programming including 8086 microprocessor and MASM assembler.\n" +
                "Lab in-charge: Mr. Ajith");





        listHash1.put(listDataHeader1.get(0),network);
        listHash2.put(listDataHeader2.get(0),project);
        listHash3.put(listDataHeader3.get(0),soft);
        listHash4.put(listDataHeader4.get(0),hard);

    }
}
