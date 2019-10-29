package anoop.myprojects.gec_sfi.others;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import anoop.myprojects.gec_sfi.R;

public class AchievementsShowMore extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements_show_more);

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AchievementsShowMore.super.onBackPressed();
            }
        });

        webView =findViewById(R.id.web);
       // webView.loadUrl("android.assets://anoop.myprojects.gec_sfi/assets/index.html");
        webView.loadUrl("file:///android_asset/index.html");


    }


}
