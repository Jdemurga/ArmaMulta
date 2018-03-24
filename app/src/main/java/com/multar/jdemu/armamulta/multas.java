package com.multar.jdemu.armamulta;

/**
 * Created by jdemu on 24/03/2018.
 */

public class multas {
    String nombre;
    String pago;
    String categoria;
    int cantidad;
    public multas(String nombre, String pago, String categoria,int cantidad){
        this.nombre = nombre;
        this.pago = pago;
        this.categoria = categoria;
        this.cantidad=cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPago() {
        return pago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
