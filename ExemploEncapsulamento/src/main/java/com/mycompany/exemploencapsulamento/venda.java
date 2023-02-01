package com.mycompany.exemploencapsulamento;

public class venda {
    public void executaVenda(){
        pessoa obj1 = new pessoa();
        obj1.setNome("joao");
        obj1.setIdade(13);
        
        System.out.println("O Cliente "+obj1.getNome()+" tem "+obj1.getIdade() +"anos");
    }
    
}
