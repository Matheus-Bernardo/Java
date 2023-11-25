package br.inatel.trabalho.Locadora.DAO;

import br.inatel.trabalho.Locadora.Models.Dvd;
import br.inatel.trabalho.Locadora.Models.Filme;

import java.sql.SQLException;
import java.util.ArrayList;

public class DvdDAO extends ConnectionDAO {

    boolean sucesso = false; // sucesso para salvar no banco
    public boolean insertFilmeNoDvd(Dvd dvd){

        //abrir conexão com o banco
        conectaNoBanco();

        String sql = "INSERT INTO dvd(Filme_idFilme,alugado) values (?,NULL)";

        //parametros a serem inseridos no Banco de dados

        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, dvd.getIdFilme());

            pst.execute();
            sucesso = true;

            System.out.println("Filme cadastrado no dvd.");

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

    //listar dvds (Select)
    public ArrayList<Dvd> ListarFilmes() {
        ArrayList<Dvd> dvds = new ArrayList<>();
        conectaNoBanco();
        String sql = "SELECT Dvd.idDvd, Filme.idFilme, Filme.nome " +
                "FROM Locadora.Dvd " +
                "JOIN Locadora.Filme ON Dvd.Filme_idFilme = Filme.idFilme " +
                "WHERE Dvd.alugado IS NULL;";

        try {
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery(sql);
            System.out.println("Lista de DVDs disponíveis para alugar:");
            while (rs.next()) {
                Dvd dvdAux = new Dvd( rs.getInt("idDvd"),rs.getInt("idFilme"), null);  // Ajuste conforme sua classe Dvd
                dvds.add(dvdAux);
                System.out.println("Id do DVD: " + dvdAux.getIdDvd());
                System.out.println("Nome do filme gravado no DVD: " + rs.getString("nome"));
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
        return dvds;
    }


}
