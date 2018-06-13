package com.smartcount.smart_count.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by jeremiah.imo on 6/12/2018.
 */

public class API {
    SharedPreferences session;
    Context context;



    public static boolean isConnectedToInternet(Context c) {


        try {
            ConnectivityManager cm = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo ni = cm.getActiveNetworkInfo();
            return (ni != null) && (ni.isConnected());
        }
        catch (Exception x){
            return false;
        }
    }
    public API(Context context) {
        this.context = context;
//		session = context.getSharedPreferences("SkyeEncore", Context.MODE_PRIVATE);
        session = context.getSharedPreferences("smartcount", Context.MODE_PRIVATE);
    }
}
