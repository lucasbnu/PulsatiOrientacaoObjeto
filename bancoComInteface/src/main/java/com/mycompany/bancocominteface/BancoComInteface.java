package com.mycompany.bancocominteface;

public class BancoComInteface {

    public static void main(String[] args) {
        contaEspecial conta = new contaEspecial();
        conta.setLimite(300);
        conta.setSaldo(300);
        
        conta.sacar(601);
    }
}
