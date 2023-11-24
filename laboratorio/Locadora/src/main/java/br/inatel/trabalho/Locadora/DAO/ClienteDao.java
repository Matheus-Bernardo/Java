package br.inatel.trabalho.Locadora.DAO;
import br.inatel.trabalho.Locadora.Interfaces.MsgAlugaFilme;
import br.inatel.trabalho.Locadora.Models.Cliente;
import br.inatel.trabalho.Locadora.Models.Filme;

import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDao extends ConnectionDAO implements MsgAlugaFilme {
    boolean sucesso = false; // sucesso para salvar no banco
    //insert
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

    //UPDATE
    public void AlugaFilme(String cpfCliente, int idDvd) {
        conectaNoBanco();

        // Atualizar o campo alugado na tabela Dvd para "sim"
        String sqlUpdateDvd = "UPDATE Locadora.Dvd SET alugado = 'sim' WHERE idDvd = ?";

        // Atualizar o campo Dvd_idDvd na tabela Cliente
        String sqlUpdateCliente = "UPDATE Locadora.Cliente SET Dvd_idDvd = ? WHERE CPF = ?";

        try {
            // Atualizar tabela Dvd
            pst = conexao.prepareStatement(sqlUpdateDvd);
            pst.setInt(1, idDvd);
            pst.executeUpdate();

            // Atualizar tabela Cliente
            pst = conexao.prepareStatement(sqlUpdateCliente);
            pst.setInt(1, idDvd);
            pst.setString(2, cpfCliente);
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


    //Select
    public ArrayList<Cliente> listarCliente() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        conectaNoBanco();
        String sql = "SELECT Cliente.nome FROM Locadora.Cliente";
        try {
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Cliente clienteAux = new Cliente(rs.getString("nome"));  // Ajuste conforme sua classe Cliente
                clientes.add(clienteAux);
                System.out.println(rs.getString("nome")); // imprime nome do cliente
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

    @Override
    public void AlugouFilme() {
        System.out.println("Parabens pela Escolha, bom Filme.");
    }
}
