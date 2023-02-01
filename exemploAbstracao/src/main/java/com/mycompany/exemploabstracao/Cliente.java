package com.mycompany.exemploabstracao;

public class Cliente extends Pessoa{
    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void imprime() {
        System.out.println("O cliente "+getNome()+" tem "+getIdade()+" anos e possui o codigo "+getCodigoCliente());
    }
    
}
