/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package view;

import dao.PessoaDAO;
import dto.PessoaDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Pessoaview {

    public static void main(String[] args) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id:"));
        int idade =  Integer.parseInt(JOptionPane.showInputDialog("Insira a idade:"));
        String nome = JOptionPane.showInputDialog("insira o nome:");
        int Ativo =  Integer.parseInt(JOptionPane.showInputDialog("Isira a situacao:"));
        
        PessoaDTO pessoa = new PessoaDTO();
        pessoa.setId(id);
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setAtivo(Ativo);
        
        JOptionPane.showMessageDialog(null, PessoaDAO.atualizaPessoa(pessoa));
    }
}
