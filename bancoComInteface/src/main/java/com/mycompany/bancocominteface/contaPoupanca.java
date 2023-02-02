package com.mycompany.bancocominteface;

public class contaPoupanca extends Conta implements  movimentaSaldo{

    @Override
    public void depositar(double valor) {
        this.setSaldo( this.getSaldo() + valor );
    }

    @Override
    public void sacar(double valor) {
         if (this.getSaldo() >= valor){
             this.setSaldo( this.getSaldo() - valor );
         }
    }
    
}
