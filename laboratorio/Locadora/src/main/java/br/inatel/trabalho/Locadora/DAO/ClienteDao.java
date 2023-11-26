package br.inatel.trabalho.Locadora.DAO;
import br.inatel.trabalho.Locadora.Interfaces.MsgAlugaFilme;
import br.inatel.trabalho.Locadora.Models.Cliente;
import br.inatel.trabalho.Locadora.Models.Filme;

import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDao extends ConnectionDAO implements MsgAlugaFilme {
    boolean sucesso = false; // sucesso para salvar no banco

    //insert(create)
    public boolean insertCliente(Cliente cliente){
        //abrir conexão com o banco
        conectaNoBanco();
        String sql = "INSERT INTO cliente(CPF,nome,endereco,telefone,email) values (?,?,?,?,?)";

        //parametros a serem inseridos no Banco de dados
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getCpf());
            pst.setString(2, cliente.getNome());
            pst.setString(3, cliente.getEndereco());
            pst.setString(4, cliente.getTelefone());
            pst.setString(5, cliente.getEmail());

            pst.execute();
            sucesso = true;

            System.out.println("Cliente "+ cliente.getNome() + " cadastrado.");

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

    @Override
    public void AlugouFilme() {
        System.out.println("Parabens pela Escolha, bom Filme.");
    }

    //UPDATE
    public void AlugaFilme(String cpfCliente, int idDvd) {
        conectaNoBanco();

        // Atualizar o campo alugado na tabela Dvd para "sim"
        String sqlUpdateDvd = "UPDATE Locadora.Dvd SET alugado = 'sim' WHERE idDvd = ?";

        // Salvar cpf e dvd alugado na tabela 'dvd_alugado'
        String sqlUpdateCliente = "INSERT INTO Locadora.dvd_alugado VALUES(?,?)";

        try {
            // Atualizar tabela Dvd
            pst = conexao.prepareStatement(sqlUpdateDvd);
            pst.setInt(1, idDvd);
            pst.executeUpdate();

            // Atualizar tabela Cliente
            pst = conexao.prepareStatement(sqlUpdateCliente);
            pst.setString(1, cpfCliente);
            pst.setInt(2, idDvd);
            pst.executeUpdate();

            System.out.println("Filme alugado.");

            AlugouFilme();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
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

    //Select(read)
    public ArrayList<Cliente> listarCliente() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        conectaNoBanco();
        String sql = "SELECT Cliente.nome,Cliente.cpf FROM Locadora.Cliente";
        try {
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Cliente clienteAux = new Cliente(rs.getString("nome"),rs.getString("cpf"));  // Ajuste conforme sua classe Cliente
                clientes.add(clienteAux);
                System.out.println(rs.getString("nome")+ ", cpf: " + rs.getString("cpf")); // imprime nome do cliente
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
        return clientes;
    }

    //delete(remove)
    public void excluirCliente(String cpf) {
        conectaNoBanco();
        String sql = "DELETE FROM Locadora.Cliente WHERE CPF = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cpf);
            int linhasAfetadas = pst.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Cliente excluído com sucesso!");
                sucesso = true;
            } else {
                System.out.println("Nenhum cliente encontrado com o cpf especificado.");
                sucesso = false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao excluir o cliente: " + e.getMessage());
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


    public void AtualizaCelularCliente(String cpfCliente, String celular) {
        conectaNoBanco();
        // Atualizar o campo alugado na tabela Dvd para "sim"
        String sqlUpdateCliente = "UPDATE Locadora.Cliente SET telefone = ? WHERE CPF = ?";
        try {
            // Atualizar tabela Dvd
            pst = conexao.prepareStatement(sqlUpdateCliente);
            pst.setString(1, celular);
            pst.setString(2, cpfCliente);
            pst.executeUpdate();
            System.out.println("Telefone atualizado.");
            sucesso = true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
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

    public void listarFilmesAlugados(String cpfCliente) {
        conectaNoBanco();
        String sql = "SELECT c.nome AS nome_cliente, f.nome AS nome_filme, d.idDvd " +
                "FROM dvd_alugado da " +
                "JOIN Cliente c ON da.cpf_cliente = c.CPF " +
                "JOIN Dvd d ON da.id_dvd = d.idDvd " +
                "JOIN Filme f ON d.Filme_idFilme = f.idFilme " +
                "WHERE c.CPF = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,cpfCliente);
            rs = pst.executeQuery();

            sucesso = true;

            while (rs.next()){
                String nomeCliente = rs.getString("nome_cliente");
                String nomeFilme = rs.getString("nome_filme");
                int idDvd =rs.getInt("idDvd");
                System.out.println("Cliente: " + nomeCliente + " - Filme: " + nomeFilme + " - ID do DVD: " + idDvd);
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
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

    public void devolverFilme(String cpfCliente, int idDvd) {
        conectaNoBanco();
        // Atualizar o campo alugado na tabela Dvd para "sim"
        String sqlUpdateDvd = "UPDATE Dvd SET alugado = NULL WHERE idDvd = ? AND EXISTS (SELECT * FROM dvd_alugado WHERE id_dvd = ? AND cpf_cliente = ?)";

        try {
            conexao.setAutoCommit(false);
            // Atualizar o campo alugado para NULL na tabela Dvd
            pst = conexao.prepareStatement(sqlUpdateDvd);
            pst.setInt(1,idDvd);
            pst.setInt(2,idDvd);
            pst.setString(3,cpfCliente);

            int linhasAfetadas = pst.executeUpdate();

            //deletar a linha correspondente na tabela DVD_alugado
            String sqlDeleteDvdAlugado = "DELETE FROM dvd_alugado WHERE id_dvd = ? AND cpf_cliente = ?";

            pst = conexao.prepareStatement(sqlDeleteDvdAlugado);
            pst.setInt(1,idDvd);
            pst.setString(2,cpfCliente);

            int linhasAfetadasDvdAlugado = pst.executeUpdate();

            if (linhasAfetadas > 0 && linhasAfetadasDvdAlugado > 0) {
                System.out.println("Filme devolvido com sucesso!");
                conexao.commit(); // Confirma a transação
            } else {
                System.out.println("Erro ao devolver filme ou filme não está alugado para o cliente.");
                conexao.rollback(); // Desfaz a transação em caso de erro
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
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
