package com.mycompany.desafiobanco;

public class ContaEspecial extends Conta {
    private double limite;
    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        if(this.getSaldo()+this.getLimite() >= valor){
            contaDestino.depositar(valor);
            this.sacar(valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    
    
    

    @Override
    public void sacar(double valor) {
        if(this.getSaldo()+this.getLimite() >= valor){
            this.setSaldo(this.getSaldo()-valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
