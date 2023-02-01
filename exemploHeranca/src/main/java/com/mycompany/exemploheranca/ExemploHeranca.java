package com.mycompany.exemploheranca;

public class ExemploHeranca {

    public static void main(String[] args) {
        funcionario obj = new funcionario();
        obj.setAltura(180.0);
        obj.setIdade(35);
        obj.setNome("Joao");
        obj.setCracha(15);
        obj.imprimePessoa();
        
        cliente obj2 = new cliente();
        obj2.setAltura(160.0);
        obj2.setIdade(15);
        obj2.setNome("Fransisco");
        obj2.imprimePessoa();
    }
}
