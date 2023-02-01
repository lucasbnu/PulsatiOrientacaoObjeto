package com.mycompany.execicioencapsulamento;

public class carro {
    private String montadora;
    private int cilindrada;
    private String paisOrigem;

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        if (!paisOrigem.equals("fraca")){
          this.paisOrigem = paisOrigem;
        }else{
            System.out.println("Cadastro para carros franceses bloqueado.");
        }
    }
    
}
