package com.example.listavoley.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listavoley.Modelos.Persona;
import com.example.listavoley.R;

import java.util.List;

public class AdaptadorPersona extends BaseAdapter {
    private List<Persona> lp;
    private Context c;
    private View convertView;

    public AdaptadorPersona(Context context, List<Persona> lp){
        this.lp = lp;
        this.c = context;
    }

    @Override
    public int getCount() {
        return lp.size();
    }

    @Override
    public Object getItem(int position) {
        return lp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lp.get(position).getId();
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup viewGroup) {
        LayoutInflater li = LayoutInflater.from(c);
        convertView = (View) li.inflate(R.layout.itmedesign,null);
        Persona p = (Persona)getItem(position);
        TextView txtnombre = (TextView) convertView.findViewById(R.id.setxt);
        TextView txtedad = (TextView) convertView.findViewById(R.id.setedad);
        TextView txtapellido = (TextView) convertView.findViewById(R.id.setApellido);
        txtnombre.setText(p.getNombre());
        txtapellido.setText(p.getApellido());
        txtedad.setText(String.valueOf(p.getEdad()));

        return  convertView;

    }
}
