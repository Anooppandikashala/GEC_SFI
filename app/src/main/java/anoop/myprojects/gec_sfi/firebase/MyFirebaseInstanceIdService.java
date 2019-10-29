package anoop.myprojects.gec_sfi.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.support.constraint.Constraints.TAG;

/**
 * Created by anoop on 6/22/18.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    /*@Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        sendNewTokenToServer(FirebaseInstanceId.getInstance().getToken());
    }

    private void sendNewTokenToServer(String token) {

        Log.d(TAG, "Refreshed token: " + token);


    }*/


    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        sendRegistrationToServer(refreshedToken);
    }
    // [END refresh_token]

    /**
     * Persist token to third-party servers.
     *
     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     * maintained by your application.
     *
     * @param token The new token.
     */
    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }


}
