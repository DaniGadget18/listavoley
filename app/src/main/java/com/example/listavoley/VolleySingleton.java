package com.example.listavoley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    private static VolleySingleton VolleyS = null;
    private RequestQueue rq;

    public VolleySingleton(Context c){
        rq = Volley.newRequestQueue(c);
    }

    public static VolleySingleton getInstance(Context c){
        if (VolleyS == null){
            VolleyS = new VolleySingleton(c);
        }
        return VolleyS;
    }

    public RequestQueue getRequestQueue(){
        return rq;
    }


}
