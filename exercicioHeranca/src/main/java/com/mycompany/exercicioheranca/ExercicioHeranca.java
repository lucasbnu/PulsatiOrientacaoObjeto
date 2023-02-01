package com.mycompany.exercicioheranca;

public class ExercicioHeranca {
    
    
    public static void imprimeMenssagem(veiculo v){
        System.out.println("Quantidade passageiros: "+v.getQuantidadePassageiros());
    }
    
     

    public static void main(String[] args) {
        aviao objetoAviao = new aviao();
        moto objetoMoto = new moto();
        objetoAviao.setQuantidadePassageiros(120);
        objetoMoto.setQuantidadePassageiros(2);
        imprimeMenssagem(objetoMoto);
        imprimeMenssagem(objetoAviao);
    }
}
