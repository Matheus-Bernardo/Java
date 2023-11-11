package br.inatel.trabalho.Locadora.DAO;
import br.inatel.trabalho.Locadora.Models.Ator;
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

        String sql = "DELETE FROM Locadora.Ator WHERE idAtor = ?";

        try {
            pst = conexao.prepareStatement(sql);
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

}
