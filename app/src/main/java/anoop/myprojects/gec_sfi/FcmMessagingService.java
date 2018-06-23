package anoop.myprojects.gec_sfi;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.WorkerThread;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by anoop on 6/22/18.
 */

public class FcmMessagingService extends FirebaseMessagingService {


   // @Override
    //public void onMessageReceived(RemoteMessage remoteMessage) {
        /*super.onMessageReceived(remoteMessage);

        if(remoteMessage.getData().size()>0){

            String title = remoteMessage.getData().get("title");
            String message =remoteMessage.getData().get("message");

            System.out.println("Title :"+title);


            */

        @WorkerThread
        public void onMessageReceived(RemoteMessage remoteMessage) {
            super.onMessageReceived(remoteMessage);

            Global.badge=true;

            Log.d("msg", "onMessageReceived: " + remoteMessage.getData().get("message"));
            Intent intent = new Intent(this, Notifications.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
            String channelId = "Default";
            NotificationCompat.Builder builder = new  NotificationCompat.Builder(this, channelId)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle("Gec App Notifications")
                    .setContentText(remoteMessage.getNotification().getBody()).setAutoCancel(true).setContentIntent(pendingIntent);;
            NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(channelId, "Default channel", NotificationManager.IMPORTANCE_DEFAULT);
                manager.createNotificationChannel(channel);
            }
            manager.notify(0, builder.build());
        }

    }


        //}
    //}
//}
