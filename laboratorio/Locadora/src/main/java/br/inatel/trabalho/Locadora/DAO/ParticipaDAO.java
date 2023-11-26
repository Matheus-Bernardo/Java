package br.inatel.trabalho.Locadora.DAO;

import br.inatel.trabalho.Locadora.Models.Ator;
import br.inatel.trabalho.Locadora.Models.Filme;

import java.sql.SQLException;

public class ParticipaDAO extends ConnectionDAO {

    //objetos
    FilmeDAO filmeDAO = new FilmeDAO();
    AtoresDAO atoresDAO = new AtoresDAO();
    boolean sucesso = false; // sucesso para salvar no banco

    //função para adicionar atores a um filme
    public boolean adicionarAtorFilme(int idAtor, int idFilme){

        conectaNoBanco();
        String sql = "INSERT INTO Participa (Ator_idAtor, Filme_idFilme) VALUES (?, ?)";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idAtor);
            pst.setInt(2, idFilme);

            pst.execute();
            sucesso = true;
            System.out.println("Ator adicionado ao elenco.");

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
