package com.mycompany.desafiobanco;

public class DesafioBanco {

    public static void main(String[] args) {
        ContaEspecial objetoContaEspecial = new ContaEspecial();
        objetoContaEspecial.setLimite(200);
        objetoContaEspecial.setSaldo(100);
        
        ContaPoupanca objetoContaPoupanca = new ContaPoupanca();
        objetoContaPoupanca.setSaldo(100);
        
        objetoContaEspecial.tranferir(250, objetoContaPoupanca);
        
    }
}
