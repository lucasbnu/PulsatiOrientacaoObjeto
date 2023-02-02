package dao;

import dto.PessoaDTO;

public class PessoaDAO {
    public static String apagaPessoa(PessoaDTO pessoa){
        return "DELETE FROM PESSOA WHERE ID = "+pessoa.getId();
    }
    
    public static String inserePessoa(PessoaDTO pessoa){
        return "insert into pessoa ( nome,idade, ativo) values ('"+
                pessoa.getNome()+"',"+pessoa.getIdade()+","+pessoa.getAtivo()+")";
    }
    
    public static String atualizaPessoa(PessoaDTO pessoa){
        return "UPDATE PESSOA SET"+
                " \n NOME = '"+pessoa.getNome()+
                "', \n IDADE = "+pessoa.getIdade()+
                ", \n ATIVO = "+pessoa.getAtivo()+
                "\n WHERE ID = "+pessoa.getId();
    }
}
