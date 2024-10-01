package com.aluradesafio.compras.clases;

public class Articulo {

    private String nombreArticulo;
    private double precioArticulo;
    private String descripcionArticulo;

    public Articulo(String nombre, double Precio, String descripcion){

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
        return "Articulo: \n" + this.nombreArticulo + "Descripcion: \n"+this.descripcionArticulo + "Precio:$ "+this.precioArticulo;
    }
}
