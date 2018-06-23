package anoop.myprojects.gec_sfi;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.support.constraint.Constraints.TAG;

/**
 * Created by anoop on 6/22/18.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        sendNewTokenToServer(FirebaseInstanceId.getInstance().getToken());
    }

    private void sendNewTokenToServer(String token) {

        Log.d(TAG, "Refreshed token: " + token);


    }


}
