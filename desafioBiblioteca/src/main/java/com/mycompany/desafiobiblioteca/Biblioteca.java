package com.mycompany.desafiobiblioteca;

public class Biblioteca {
    public void alugar(Item i){
        if (i.getNumeroExemplares() > 0){
          i.setNumeroExemplares(i.getNumeroExemplares()-1);
          System.out.println(i.getTitulo()+" foi alugado!");
        }else{
            System.out.println("infelizmente todos nosso exemplares foram alugados.");  
        }
    }
    
    public void devolver(Item i){
        i.setNumeroExemplares(i.getNumeroExemplares()+1);
        System.out.println(i.getTitulo()+" foi devolvido!");
    }
    
}
