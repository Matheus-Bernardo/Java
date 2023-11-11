package br.inatel.trabalho.Locadora.DAO;

import br.inatel.trabalho.Locadora.Models.Ator;
import br.inatel.trabalho.Locadora.Models.Dvd;

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

}
