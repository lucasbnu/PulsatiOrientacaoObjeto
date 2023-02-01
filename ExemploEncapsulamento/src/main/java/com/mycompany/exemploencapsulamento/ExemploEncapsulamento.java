package com.mycompany.exemploencapsulamento;


public class ExemploEncapsulamento {

    public static void main(String[] args) {
        pessoa objeto1 = new pessoa();
        objeto1.setNome("Lucas");
        objeto1.setIdade(23);
        objeto1.setIdade(23);
        
        
        venda  objetoVenda = new venda();
        objetoVenda.executaVenda();
        
        
    }
}
