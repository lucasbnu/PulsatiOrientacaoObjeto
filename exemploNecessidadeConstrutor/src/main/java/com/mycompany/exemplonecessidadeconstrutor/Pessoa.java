package com.mycompany.exemplonecessidadeconstrutor;

public class Pessoa {
   Pessoa(){}
   
   
   Pessoa(String nome){
       this.nome = nome;
   }
   private String nome;
   private int idade;
   
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
