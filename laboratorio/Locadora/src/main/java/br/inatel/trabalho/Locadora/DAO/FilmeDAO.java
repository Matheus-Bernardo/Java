package br.inatel.trabalho.Locadora.DAO;

import br.inatel.trabalho.Locadora.Models.Filme;

import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeDAO extends ConnectionDAO{
    boolean sucesso = false; // sucesso para salvar no banco
    //insert
    public boolean insertFilme(Filme filme){

        //abrir conexão com o banco
        conectaNoBanco();

        String sql = "INSERT INTO filme(nome,lancamento) values (?,?)";

        //parametros a serem inseridos no Banco de dados

        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, filme.getNomeFilme());
            pst.setString(2, filme.getDataLancamento());

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

    public ArrayList<Filme> listarFilmes() {
        ArrayList<Filme> filmes = new ArrayList<>();
        conectaNoBanco();
        String sql = "SELECT Filme.idFilme, Filme.nome, Filme.lancamento " +
                "FROM Locadora.Filme";
        try {
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery(sql);
            System.out.println("Lista de Filmes:");
            while (rs.next()) {
                Filme filmeAux = new Filme(rs.getInt("idFilme"),rs.getString("nome"),rs.getString("lancamento"));  // Ajuste conforme sua classe Filme
                filmes.add(filmeAux);
                System.out.println("Nome do Filme: " + rs.getString("nome") + " - id:" + rs.getInt("idFilme"));
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                conexao.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return filmes;
    }


}
