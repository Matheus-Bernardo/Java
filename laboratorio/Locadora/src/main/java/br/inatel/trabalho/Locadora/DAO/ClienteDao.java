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

}
