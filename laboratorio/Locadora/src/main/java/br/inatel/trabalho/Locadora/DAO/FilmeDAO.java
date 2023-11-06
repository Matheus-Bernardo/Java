package br.inatel.trabalho.Locadora.DAO;

import br.inatel.trabalho.Locadora.Models.Filme;

import java.sql.SQLException;

public class FilmeDAO extends ConnectionDAO{
    boolean sucesso = false; // sucesso para salvar no banco
    //insert
    public boolean insertFilme(Filme filme){

        //abrir conexão com o banco
        conectaNoBanco();

        String sql = "INSERT INTO filme(idFilme,nome,lancamento) values (?,?,?)";

        //parametros a serem inseridos no Banco de dados

        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, filme.getIdFillme());
            pst.setString(2, filme.getNomeFilme());
            pst.setString(3, filme.getDataLancamento());

            pst.execute();
            sucesso = true;

            System.out.println("Filme "+ filme.getNomeFilme() + " cadastrado.");

        }catch (SQLException exc){
            System.out.println("Erro: " + exc);

        }finally {
            try {
                conexao.close();//termina a conexão com o banco de dados
                pst.close();
                System.out.println("Conexão com o banco fechada");
            }catch (SQLException exc){
                System.out.println("Erro: "+ exc);
            }
        }

        return sucesso;
    }
}
