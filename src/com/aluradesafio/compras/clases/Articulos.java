package com.aluradesafio.compras.clases;

import java.util.ArrayList;

public class Articulos {


    private String nombreArticulo;
    private double precioArticulo;
    private String descripcionArticulo;



    public Articulos(String nombre, double Precio, String descripcion){

        this.nombreArticulo=nombre;
        this.precioArticulo=Precio;
        this.descripcionArticulo=descripcion;

    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    @Override
    public String toString() {
        return "Articulo: \n" + this.nombreArticulo + "Precio:$ "+this.precioArticulo;
    }
}
