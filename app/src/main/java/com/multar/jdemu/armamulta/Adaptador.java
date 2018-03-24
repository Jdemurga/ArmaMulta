package com.multar.jdemu.armamulta; /**
 * Created by jdemu on 24/03/2018.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.multar.jdemu.armamulta.R;
import com.multar.jdemu.armamulta.multas;

import java.util.ArrayList;

/**
 * Created by esj on 18/01/2018.
 */

public class Adaptador extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<multas> items;
    Spinner spinner;
    public Adaptador(Activity activity, ArrayList<multas> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        //Asociamos el layout de la lista que hemos creado
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.items, null);
        }

        final multas dir = items.get(position);
        TextView nombre = (TextView) v.findViewById(R.id.nombre);
        nombre.setText(dir.getNombre());
        TextView msm = (TextView) v.findViewById(R.id.precio);
        msm.setText(dir.getPago());
        TextView categoria = (TextView) v.findViewById(R.id.categoria);
        categoria.setText(dir.getCategoria());
        switch (dir.getCategoria()){
            case "Multa Leve":
                categoria.setTextColor(Color.GREEN);
                break;
            case "Multa Grave":
                categoria.setTextColor(Color.BLUE);
                break;
            case "Multa Muy Grave":
                categoria.setTextColor(Color.RED);
                break;
        }

        ArrayList total= new ArrayList();
        for (int i = 0; i < 100; i++) {
            total.add(i);
        }
        spinner= (Spinner)v.findViewById(R.id.cantidad);
        ArrayAdapter itemsAdapter = new ArrayAdapter(v.getContext(), android.R.layout.simple_list_item_1, total);
        spinner.setAdapter(itemsAdapter);
        spinner.setSelection(dir.getCantidad());
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int cantidad= (int)spinner.getItemAtPosition(position);
                dir.setCantidad(cantidad);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return v;
    }


    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }


}