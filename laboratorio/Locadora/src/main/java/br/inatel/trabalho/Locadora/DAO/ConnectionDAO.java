package br.inatel.trabalho.Locadora.DAO;

import com.mysql.cj.jdbc.result.UpdatableResultSet;

import java.sql.*;

//classe responsável por realizar a conexão com o banco de dados
public class ConnectionDAO {
    Connection conexao; //conexão para o banco de dados
    PreparedStatement pst; // declaração(query) preparada  responsável pela codificação sql
    Statement st; //declaração(query) código em sql
    ResultSet rs;//resposta do banco

    //parametros usados para o banco local
    String dataBase = "Locadora";//nome do banco de dados que iremos conectar
    String user = "root";//nome do user
    String senha = "1234";
    String url = "jdbc:mysql://localhost:3306/" + dataBase + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";


    public void conectaNoBanco(){
        try {
            conexao = DriverManager.getConnection(url,user,senha);
            System.out.println("Conexão feita");

        }catch (SQLException exc){
            System.out.println("Erro:" + exc.getMessage());

        }
    }

}


