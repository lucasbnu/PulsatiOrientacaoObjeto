package com.mycompany.exemplointerface;

public class ExemploInterface {

    public static void main(String[] args) {
        moto objetoMoto = new moto();
        carro objetoCarro = new carro();
        
        objetoCarro.dirige();
        objetoMoto.dirige();
    }
}
