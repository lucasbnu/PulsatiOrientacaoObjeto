package com.mycompany.exercicioencapsulamento2;

public class Aluno {
    private String nome;
    private double nota;
    
    public void imprimeAluno(){
        System.out.println("O Aluno "+getNome() + " Obteve a nota "+getNota());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
