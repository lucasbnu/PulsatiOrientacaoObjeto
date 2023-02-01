package com.mycompany.exemplonecessidadeconstrutor;

public class ExemploNecessidadeConstrutor {
    
    public static void imprimePessoa(Pessoa parametro){
        System.out.println(parametro.getNome());
    }
    

    public static void main(String[] args) {
        
        imprimePessoa(new Pessoa("Joao") );
        
        Agenda agd = new Agenda();
        agd.adicionaInformacaoPessoa("Jonathan", 19);
        agd.setEmail("jonathan.silva@gmail.com");
        agd.setNumeroCelular(983123241);
        agd.imprime();
    }
}
