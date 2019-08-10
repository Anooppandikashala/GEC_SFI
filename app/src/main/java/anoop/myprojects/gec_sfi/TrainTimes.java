package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrainTimes extends Fragment {

    TextView btnPalakkad;


    public TrainTimes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_train_times, container, false);
        btnPalakkad =view.findViewById(R.id.train);






        btnPalakkad.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                goToUrl( "https://indianrailways.info/trains_between_stations/");
            }
        });

        return  view;
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
