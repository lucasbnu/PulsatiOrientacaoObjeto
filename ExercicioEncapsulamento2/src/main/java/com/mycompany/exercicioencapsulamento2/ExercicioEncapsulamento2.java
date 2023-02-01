/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioencapsulamento2;

/**
 *
 * @author mac
 */
public class ExercicioEncapsulamento2 {

    public static void main(String[] args) {
        //Criar uma classe Aluno
        // Com os atributos Nota e nome
        // fazer um metodo para imprimir o nome e a nota do aluno
        // Encapsular os campos
        // criar um objeto dessa classe Aluno na classe principal
        // definir os valores, e imprimir o objeto
        Aluno objeto1 = new Aluno();
        objeto1.setNome("Lucas");
        objeto1.setNota(9.0);
        objeto1.imprimeAluno();
    }
}
