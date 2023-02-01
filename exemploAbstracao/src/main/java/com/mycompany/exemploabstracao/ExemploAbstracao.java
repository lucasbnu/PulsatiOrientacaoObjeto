package com.mycompany.exemploabstracao;

public class ExemploAbstracao {
    
    public static void imprimePessoa(Pessoa param){
        param.imprime();
    }

    public static void main(String[] args) {
        Funcionario objetoFuncionario = new Funcionario();
        Cliente objetoCliente = new Cliente();
        
        objetoCliente.setNome("Paulo");
        objetoCliente.setIdade(30);
        objetoCliente.setCodigoCliente(9230);
        
        objetoFuncionario.setNome("Ana");
        objetoFuncionario.setIdade(20);
        objetoFuncionario.setCracha(6002);
        
        imprimePessoa(objetoCliente);
        imprimePessoa(objetoFuncionario);
        
    }
}
