package com.multar.jdemu.armamulta;

/**
 * Created by jdemu on 24/03/2018.
 */

public class multas {
    String nombre;
    String pago;
    String categoria;

    public multas(String nombre, String pago, String categoria) {
        this.nombre = nombre;
        this.pago = pago;
        this.categoria = categoria;
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
}
