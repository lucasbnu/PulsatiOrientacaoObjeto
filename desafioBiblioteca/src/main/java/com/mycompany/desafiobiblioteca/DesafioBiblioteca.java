package com.mycompany.desafiobiblioteca;

public class DesafioBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro();
        Revista revista = new Revista();
        
        livro.setAutor("Colleen Hoover");
        livro.setISBN(63052);
        livro.setNumPaginas(368);
        livro.setNumeroExemplares(5);
        livro.setTitulo("É assim que acaba");
        
        revista.setAutor("Times");
        revista.setNumEdicao(6231);
        revista.setNumeroExemplares(130);
        revista.setTitulo("Times");
        System.out.println(livro.getNumeroExemplares());
        System.out.println(revista.getNumeroExemplares());
        biblioteca.alugar(livro);
        biblioteca.alugar(revista);
        System.out.println(livro.getNumeroExemplares());
        System.out.println(revista.getNumeroExemplares());
        
        
        
    }
}
