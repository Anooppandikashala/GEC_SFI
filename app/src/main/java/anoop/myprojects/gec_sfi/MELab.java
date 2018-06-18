package anoop.myprojects.gec_sfi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MELab extends AppCompatActivity {

    private ExpandableListView listView1,listView2,listView3,listView4;
    private ExpandableListAdapter listAdapter1,listAdapter2,listAdapter3,listAdapter4;
    private List<String> listDataHeader1,listDataHeader2,listDataHeader3,listDataHeader4;
    private HashMap<String,List<String>> listHash1,listHash2,listHash3,listHash4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melab);


        listView1 = (ExpandableListView)findViewById(R.id.lvExpnet);
        initData();
        listAdapter1 = new ExpandableListAdapter(this,listDataHeader1,listHash1);
        listView1.setAdapter(listAdapter1);






    }

    private void initData() {
        listDataHeader1 = new ArrayList<>();
        listHash1 = new HashMap<>();


        listDataHeader1.add("Network Lab");
        listDataHeader1.add("Project Lab");
        listDataHeader1.add("Software Lab");
        listDataHeader1.add("Hardware Lab");

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
        listHash1.put(listDataHeader1.get(1),project);
        listHash1.put(listDataHeader1.get(2),soft);
        listHash1.put(listDataHeader1.get(3),hard);

    }
}
