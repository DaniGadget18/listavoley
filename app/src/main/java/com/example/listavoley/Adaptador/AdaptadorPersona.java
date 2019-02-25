package com.example.listavoley.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.listavoley.Modelos.Persona;
import com.example.listavoley.R;

import java.util.List;

public class AdaptadorPersona extends BaseAdapter {
    List<Persona> lp;
    Context c;

    Public AdaptadorPersona(List<Persona> lp, Context c){
        this.lp = lp;
        this.c = c;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater li = LayoutInflater.from(c);
        convertView = li.inflate(R.layout.item,null);
        Persona p = (Persona)getItem(position);

        return
    }
}
