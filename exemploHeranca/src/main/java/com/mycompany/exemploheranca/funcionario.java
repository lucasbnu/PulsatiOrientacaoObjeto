/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploheranca;

/**
 *
 * @author mac
 */
public class funcionario extends pessoa{
    private int cracha;
    
    @Override
    public void imprimePessoa(){
        System.out.println(getNome()+" tem "+getIdade()+" anos e "+getAltura()+" Altura" + " e com o cracha "+getCracha());
        
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
    
    
}
