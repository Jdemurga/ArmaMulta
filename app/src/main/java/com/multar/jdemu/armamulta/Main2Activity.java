package com.multar.jdemu.armamulta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView lista;
    Button reset;
    ArrayList datos;
    TextView txt;
    String total;
    String accion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        datos=getIntent().getStringArrayListExtra("datos");
        total=getIntent().getStringExtra("total");
        txt=(TextView)findViewById(R.id.Suma);
        lista=(ListView)findViewById(R.id.lista2);
        reset=(Button)findViewById(R.id.reset);
        ArrayAdapter itemsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, datos);
        lista.setAdapter(itemsAdapter);
        txt.setText("Total: "+total);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList vacio =new ArrayList();
                ArrayAdapter itemsAdapter = new ArrayAdapter(Main2Activity.this, android.R.layout.simple_list_item_1, vacio);
                lista.setAdapter(itemsAdapter);
                txt.setText("Total: 0");
                accion="1";
                getIntent().putExtra("accion",accion);
            }
        });
    }

    @Override
    public void onBackPressed() {
        accion="0";
        getIntent().putExtra("accion",accion);
        super.onBackPressed();
    }
}
