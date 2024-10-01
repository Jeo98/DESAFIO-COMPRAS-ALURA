package com.aluradesafio.compras.clases;

import java.util.List;

public class Tarjeta {

    private List<Articulos> ListadoDeArticulos; //lista donde cargo objetos tipo Articulos
    private double limite=0;
    private double saldo=0;

    public Tarjeta(){

    }
    public Tarjeta(double limite, double saldoinicial){//Constructor

        this.limite=limite;
        this.saldo=saldoinicial;

    }

    public double getSaldo() {
        return limite;
    }

    public boolean verificarCompra(Articulos Articulo){

        if(this.saldo >= Articulo.getPrecioArticulo()) {
            this.saldo -= Articulo.getPrecioArticulo();
            ListadoDeArticulos.add(Articulo); //agrego articulo comprado a la lista
            return true;
        }
        else
            return false;//
    }

}
