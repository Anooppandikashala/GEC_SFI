package anoop.myprojects.gec_sfi;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by sebin vincent on 25-02-2018.
 */

class Mysingleton {

    private  static Mysingleton minstance;
    private static RequestQueue requestQueue;
    private static Context mctx;

    private Mysingleton(Context context){
        mctx=context;
        requestQueue=getRequestQueue();
    }


    public RequestQueue getRequestQueue(){

        if(requestQueue==null)
        {
            requestQueue= Volley.newRequestQueue(mctx.getApplicationContext());
        }
        return requestQueue;
    }
    public static synchronized Mysingleton getMinstance(Context context){
        if(minstance==null){
            minstance=new Mysingleton(context);

        }
        return minstance;
    }

    public <T> void addToRequestQue(Request<T> request)
    {
        requestQueue.add(request);
    }
}
