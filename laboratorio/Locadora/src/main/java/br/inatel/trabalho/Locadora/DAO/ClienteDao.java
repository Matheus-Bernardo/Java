package br.inatel.trabalho.Locadora.DAO;
import br.inatel.trabalho.Locadora.Models.Cliente;
import java.sql.SQLException;

public class ClienteDao extends ConnectionDAO {
    boolean sucesso = false; // sucesso para salvar no banco
    //insert
    public boolean insertCliente(Cliente cliente){

        //abrir conexão com o banco
        conectaNoBanco();

        String sql = "INSERT INTO cliente(cpf,nome,endereco,telefone,email) values (?,?,?,?,?)";

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
