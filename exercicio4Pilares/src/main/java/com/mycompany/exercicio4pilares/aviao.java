package com.mycompany.exercicio4pilares;

public class aviao extends veiculo {
   private int quantidadePorta;
   private int quantidadeJanela;

    public int getQuantidadePorta() {
        return quantidadePorta;
    }

    public void setQuantidadePorta(int quantidadePorta) {
        this.quantidadePorta = quantidadePorta;
    }

    public int getQuantidadeJanela() {
        return quantidadeJanela;
    }

    public void setQuantidadeJanela(int quantidadeJanela) {
        this.quantidadeJanela = quantidadeJanela;
    }

    @Override
    public void imprime() {
        System.out.println("o aviao tem "+getQuantidadeJanela()+" Janelas");
    }
   
    
}
