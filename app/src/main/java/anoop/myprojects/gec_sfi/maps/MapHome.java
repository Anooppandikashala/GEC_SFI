package anoop.myprojects.gec_sfi.maps;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import anoop.myprojects.gec_sfi.R;
import pl.polidea.view.ZoomView;

//import com.github.chrisbanes.photoview.PhotoView;

public class MapHome extends AppCompatActivity {

    //PhotoView photoView;

    private ZoomView zoomView;
    RelativeLayout main_container;

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_home);

        fragmentTransaction=getSupportFragmentManager().beginTransaction();

        Maps ldf = new Maps();
        Bundle args = new Bundle();
        args.putString("message", "enquery");
        ldf.setArguments(args);


        fragmentTransaction.add(R.id.container,ldf);
        fragmentTransaction.commit();



        //photoView = (PhotoView) findViewById(R.id.photo_view);
        //photoView.setImageResource(R.drawable.hospitalenquiryoptimised);
    }


}
