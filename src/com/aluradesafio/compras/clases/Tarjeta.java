package com.aluradesafio.compras.clases;

public class Tarjeta {

    private String tipoDetarjeta; //Credito o debito
    private double limite=0;
    private double saldo=0;

    public Tarjeta(){

    }
    public Tarjeta(String tipotarjeta, Double saldoinicial){//Constructor

        this.tipoDetarjeta=tipotarjeta;
        this.limite=saldoinicial;

    }

    public String getTipoDetarjeta() {
        return tipoDetarjeta;
    }

    public double getSaldo() {
        return limite;
    }


}
