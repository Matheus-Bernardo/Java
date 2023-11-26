package br.inatel.trabalho.Locadora.DAO;
import br.inatel.trabalho.Locadora.Models.Ator;
import br.inatel.trabalho.Locadora.Models.Cliente;

import java.sql.SQLException;
import java.util.ArrayList;

public class AtoresDAO extends ConnectionDAO{

    boolean sucesso = false;

    //listar dvds (Select)
    public ArrayList<Ator> listarAtores() {
        ArrayList<Ator> atores = new ArrayList<>();
        conectaNoBanco();
        String sql = "SELECT * from Ator";

        try {
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery(sql);
            System.out.println("Lista de atores:");
            while (rs.next()) {
                Ator atorAux = new Ator(rs.getInt("idAtor"), rs.getString("nomeAtor"));  // Ajuste conforme sua classe Ator
                atores.add(atorAux);
                System.out.println("Id do ator: " + atorAux.getIdAtor());
                System.out.println("Nome do ator: " + rs.getString("nomeAtor"));
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
        return atores;
    }

    // Método para excluir um ator com base no ID
    public void excluirAtor(int idAtor) {
        conectaNoBanco();
        try {
            // Verificar se há registros associados na tabela Participa antes de excluir o ator
            String sqlVerificarParticipacao = "SELECT COUNT(*) AS qtd FROM Participa WHERE Ator_idAtor = ?";
            pst = conexao.prepareStatement(sqlVerificarParticipacao);
            pst.setInt(1, idAtor);
            rs = pst.executeQuery();

            if (rs.next()) {
                int quantidadeParticipacoes = rs.getInt("qtd");

                if (quantidadeParticipacoes > 0) {
                    // Se houver participações, exclua primeiro as entradas relacionadas na tabela Participa
                    String sqlExcluirParticipacao = "DELETE FROM Participa WHERE Ator_idAtor = ?";
                    pst = conexao.prepareStatement(sqlExcluirParticipacao);
                    pst.setInt(1, idAtor);
                    pst.executeUpdate();
                }
            }
            // Em seguida, exclua o ator após remover as entradas relacionadas na Participa
            String sqlExcluirAtor = "DELETE FROM Locadora.Ator WHERE idAtor = ?";
            pst = conexao.prepareStatement(sqlExcluirAtor);
            pst.setInt(1, idAtor);
            int linhasAfetadas = pst.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Ator excluído com sucesso!");
                sucesso = true;
            } else {
                System.out.println("Nenhum ator encontrado com o ID especificado.");
                sucesso = false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao excluir o ator: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                conexao.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }


    public boolean inserirAtor(Ator ator){

        //abrir conexão com o banco
        conectaNoBanco();

        String sql = "INSERT INTO ator(nomeAtor) values (?)";

        //parametros a serem inseridos no Banco de dados

        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, ator.getNomeAtor());


            pst.execute();
            sucesso = true;

            System.out.println("Ator "+ ator.getNomeAtor() + " cadastrado.");

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
