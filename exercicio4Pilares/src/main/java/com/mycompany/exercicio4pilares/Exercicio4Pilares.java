/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4pilares;

/**
 *
 * @author mac
 */
public class Exercicio4Pilares {
    
    public static void imprimeVeiculo(veiculo v){
        v.imprime();
    }

    public static void main(String[] args) {
        aviao av = new aviao();
        moto mt = new moto();
        
        av.setQuantidadeJanela(24);
        mt.setQuantidadeRetrovisor(2);
        imprimeVeiculo(av);
        imprimeVeiculo(mt);
        
    }
}
