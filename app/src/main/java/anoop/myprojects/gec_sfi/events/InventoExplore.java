package anoop.myprojects.gec_sfi.events;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import anoop.myprojects.gec_sfi.R;

public class InventoExplore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invento_explore);
        ImageView fb,tw,insta,you;

        ImageView back;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InventoExplore.super.onBackPressed();
            }
        });

        fb=findViewById(R.id.fb);
        insta=findViewById(R.id.insta);
        you=findViewById(R.id.you);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.facebook.com/inventogec/");
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.instagram.com/inventogecpalakkad/");
            }
        });

        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://youtu.be/Nv475uSp0RI");
            }
        });
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
