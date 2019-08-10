package anoop.myprojects.gec_sfi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAchievements extends Fragment {
    WebView webView;


    public FragmentAchievements() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_achievements, container, false);

        webView = view.findViewById(R.id.web);
        // webView.loadUrl("android.assets://anoop.myprojects.gec_sfi/assets/index.html");
        webView.loadUrl("file:///android_asset/index.html");

        return view;
    }

}
