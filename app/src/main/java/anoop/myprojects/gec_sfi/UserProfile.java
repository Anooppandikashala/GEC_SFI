package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Downloader;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserProfile extends Fragment {

    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthlistener;
    GoogleSignInAccount account;
    TextView Name,mail,pic;
    ImageView imageView;


    public UserProfile() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthlistener);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_profile, container, false);



        /*GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(getContext());
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();



            //Toast.makeText(this, "Name of the user :" + personName + " user id is : " + personId, Toast.LENGTH_SHORT).show();

        }*/

        pic = (TextView)view.findViewById(R.id.logout);
        Name = (TextView)view.findViewById(R.id.name);
        mail = (TextView)view.findViewById(R.id.email);
        TextView fname = (TextView) view.findViewById(R.id.fname);

        imageView = (ImageView) view.findViewById(R.id.profile_pic);
        account = GoogleSignIn.getLastSignedInAccount(getContext());
        if (account != null )
        {
            String pname = account.getDisplayName();
            Uri pphoto = account.getPhotoUrl();
            String pmail = account.getEmail();
            String image=pphoto.toString();
            String fname1=account.getGivenName();



            Name.setText(pname);
            mail.setText(pmail);
            fname.setText(fname1);


            ImageRequest imageRequest=new ImageRequest(image, new Response.Listener<Bitmap>() {
                @Override
                public void onResponse(Bitmap response) {
                    imageView.setImageBitmap(response);
                }
            }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getContext(),"switch on network....",Toast.LENGTH_LONG).show();
                    error.printStackTrace();                       }
            });
            Mysingleton.getMinstance(getContext()).addToRequestQue(imageRequest);


        }

        mAuth = FirebaseAuth.getInstance();

        mAuthlistener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null){
                    startActivity(new Intent(getActivity(),GoogleSignin.class));
                    getActivity().finish();
                }
            }
        };

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();

            }
        });

        return  view;
    }

}
