package anoop.myprojects.gec_sfi.clubs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import anoop.myprojects.gec_sfi.R;

public class Sports_show_more extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_show_more);
        ImageView fb,tw,insta,you;

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sports_show_more.super.onBackPressed();
            }
        });

        fb=findViewById(R.id.fb);
        tw=findViewById(R.id.tw);
        insta=findViewById(R.id.insta);
        you=findViewById(R.id.you);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("http:www.google.com");
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("http:www.google.com");
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("http:www.google.com");
            }
        });

        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("http:www.google.com");
            }
        });
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
