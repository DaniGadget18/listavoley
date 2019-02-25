package com.example.listavoley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.listavoley.Adaptador.AdaptadorPersona;
import com.example.listavoley.Modelos.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView ltf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ltf = findViewById(R.id.listapersona);
    }

    public void click_btn(View view) {
        JsonArrayRequest jar = new JsonArrayRequest(Request.Method.GET, "http://nuevo.rnrsiilge-org.mx/lista", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Gson g = new Gson();
                Type t = new TypeToken<List<Persona>>(){}.getType();
                List<Persona> lp = g.fromJson(response.toString(), t);
                AdaptadorPersona ap = new AdaptadorPersona(getApplicationContext(),lp);
                ltf.setAdapter(ap);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        VolleySingleton.getInstance(this).getRequestQueue().add(jar);


    }
}
