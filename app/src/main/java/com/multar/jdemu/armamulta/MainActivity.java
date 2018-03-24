package com.multar.jdemu.armamulta;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.support.v7.widget.SearchView;
import android.widget.ListView;
import android.widget.SearchView.OnQueryTextListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements android.support.v7.widget.SearchView.OnQueryTextListener {
    ListView lista;
    ArrayList<multas> mls;
    private android.support.v7.widget.SearchView mSearchView;
    Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.lista);
        mls = new ArrayList<multas>();
        añadir();
        adapter = new Adaptador(this, mls);
        lista.setAdapter(adapter);
    }

    public void añadir() {
        mls.add(new multas("Exceso de velocidad", "2000$", "Multa Leve"));
        mls.add(new multas("Conducir en dirección contraria", "2500$", "Multa Leve"));
        mls.add(new multas("Mal estacionamiento", " 1000$", "Multa Leve"));
        mls.add(new multas("Conducción temeraria", "3500$", "Multa Leve"));
        mls.add(new multas("Conducción campo a través", "2500$", "Multa Leve"));
        mls.add(new multas("Conducción de vehículos no homologados", "2000$", "Multa Leve"));
        mls.add(new multas("Romper mobiliario público", " 3000$", "Multa Leve"));
        mls.add(new multas("Faltas de respeto", "2000$", "Multa Leve"));
        mls.add(new multas("Amenazas", "2500$", "Multa Leve"));
        mls.add(new multas("Agresión", "3500$", "Multa Leve"));
        mls.add(new multas("Conducir sin luces", "1000$", "Multa Leve"));
        mls.add(new multas("Conducir  sin el casco reglamentario", "750$", "Multa Leve"));
        mls.add(new multas("Conducir sin carnet o licencia necesaria", "1000$", "Multa Leve"));
        mls.add(new multas("Alterar el orden público", "1500$", "Multa Leve"));
        mls.add(new multas("Porte de objetos ilegales(ganzúas, bridas, etc…)", "300$(cada uno)", "Multa Leve"));
        mls.add(new multas("Porte de drogas o sustancias ilícitas(marihuana,oro,cocaina, uranio...)", "450$(cada uno)", "Multa Leve"));
        mls.add(new multas("Enardecer el terrorismo", "2500$", "Multa Leve"));
        mls.add(new multas("Hurto a personas", "3500$", "Multa Leve"));
        mls.add(new multas("Hurto de vehículo", "5500$", "Multa Leve"));
        mls.add(new multas("Hurto de vehículo policial", "9000$", "Multa Leve"));
        mls.add(new multas("Disturbios en vía pública en pequeña escala", "4000$", "Multa Leve"));
        mls.add(new multas("Disturbios en vía pública en gran escala", "8000$", "Multa Leve"));
        mls.add(new multas("Saquear cadáveres", " 1500$", "Multa Leve"));
        mls.add(new multas("Falsa denuncia o falso testimonio", "3000$", "Multa Leve"));
        mls.add(new multas("Violación", "3500$", "Multa Leve"));
        mls.add(new multas("Suplantar identidad", "5000$", "Multa Leve"));
        mls.add(new multas("Atropellar intencionadamente", "10000$ (Sin muerte: 7000$)", "Multa Grave"));
        mls.add(new multas("Fuga de policía", "A pie/5000$\nEn vehículo/7500$", "Multa Grave"));
        mls.add(new multas("Robo a mano armada o con intimidación", "7000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Conducción de vehículos no homologados artillados", "15000$", "Multa Grave"));
        mls.add(new multas("Robo de pequeños establecimientos", "10000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Robo de grandes establecimientos", "15000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Robo de vehículo(violencia o intimidación)", "6000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Robo de vehículo policial", "9000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Desacato a la autoridad", "3000 a 6000$", "Multa Grave"));
        mls.add(new multas("Faltas de respeto a la autoridad", "4000$", "Multa Grave"));
        mls.add(new multas("Obstrucción a las labores de la justicia", "5000$", "Multa Grave"));
        mls.add(new multas("Porte ilícito de armas(PISTOLA SIN LICENCIA)", "5000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Porte ilícito de armas(SUBFUSILES)", "10000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Porte ilícito de armas(FUSILES+)", "15000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Porte ilícito de material o armamento explosivo", "25000$\nRetirada del material", "Multa Grave"));
        mls.add(new multas("Homicidio", "20000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("Intento de homicidio", "7000$\nRetirada de arma", "Multa Grave"));
        mls.add(new multas("ntrusión o Robo en domicilios", "10000$", "Multa Grave"));
        mls.add(new multas("Tráfico de drogas", "12000$", "Multa Grave"));
        mls.add(new multas("Extorsión", "6000$", "Multa Grave"));
        mls.add(new multas("Secuestro", "30000$", "Multa Muy Grave"));
        mls.add(new multas("Homicidio a un agente de la autoridad", "45000$", "Multa Muy Grave"));
        mls.add(new multas("Intento de homicidio a un agente de la autoridad", "20000$\nRetirada de arma", "Multa Muy Grave"));
        mls.add(new multas("Atentado", "Ejecucion", "Multa Muy Grave"));
        mls.add(new multas("Uso de vehículos artillados", "20000$", "Multa Muy Grave"));
        mls.add(new multas("Suplantar identidad de policía", "10000$", "Multa Muy Grave"));

    }

    /*
    */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);


        android.support.v7.widget.SearchView searchView = (android.support.v7.widget.SearchView)menu.findItem(R.id.search).getActionView();
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        // User pressed the search button
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String z = newText.toLowerCase();
        if(!z.equals("")){
            ArrayList buscado = new ArrayList();
            int longitud = z.length();
            for (int i = 0; i < mls.size(); i++) {
                multas m = mls.get(i);
                int longitud2 = m.getNombre().length();
                if (longitud2 >= longitud) {
                    String d = m.getNombre().substring(0, longitud).toLowerCase();
                    if (d.equals(z)) {
                        buscado.add(m);
                    }
                }
            }
            adapter = new Adaptador(MainActivity.this, buscado);
            lista.setAdapter(adapter);
        }else{
            adapter = new Adaptador(MainActivity.this, mls);
            lista.setAdapter(adapter);
        }        return false;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.leve) {
            ArrayList buscado = new ArrayList();
            for (int i = 0; i < mls.size(); i++) {
                multas m = mls.get(i);
                if(m.getCategoria().equals("Multa Leve")){
                    buscado.add(m);
                }
            }
            adapter = new Adaptador(MainActivity.this, buscado);
            lista.setAdapter(adapter);
            return true;
        }
        if (id == R.id.grave) {
            ArrayList buscado = new ArrayList();
            for (int i = 0; i < mls.size(); i++) {
                multas m = mls.get(i);
                if(m.getCategoria().equals("Multa Grave")){
                    buscado.add(m);
                }
            }
            adapter = new Adaptador(MainActivity.this, buscado);
            lista.setAdapter(adapter);
            return true;
        }
        if (id == R.id.MuyGrave) {
            ArrayList buscado = new ArrayList();
            for (int i = 0; i < mls.size(); i++) {
                multas m = mls.get(i);
                if(m.getCategoria().equals("Multa Muy Grave")){
                    buscado.add(m);
                }
            }
            adapter = new Adaptador(MainActivity.this, buscado);
            lista.setAdapter(adapter);
            return true;
        }
        if (id == R.id.todo) {
            adapter = new Adaptador(MainActivity.this, mls);
            lista.setAdapter(adapter);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}