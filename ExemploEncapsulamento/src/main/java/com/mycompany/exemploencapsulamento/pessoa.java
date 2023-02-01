package com.mycompany.exemploencapsulamento;

public class pessoa {
    private String nome;
    private int idade;


    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 18){
          this.idade = idade;
        }else{
            System.out.println("A pessoa deve ser de maior");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
}