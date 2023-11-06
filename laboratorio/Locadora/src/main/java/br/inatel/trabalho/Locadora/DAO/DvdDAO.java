package br.inatel.trabalho.Locadora.DAO;

import br.inatel.trabalho.Locadora.Models.Dvd;
import br.inatel.trabalho.Locadora.Models.Filme;

import java.sql.SQLException;

public class DvdDAO extends ConnectionDAO {

    boolean sucesso = false; // sucesso para salvar no banco
    public boolean insertFilmeNoDvd(Dvd dvd){

        //abrir conexão com o banco
        conectaNoBanco();

        String sql = "INSERT INTO dvd(idDvd,Filme_idFilme) values (?,?)";

        //parametros a serem inseridos no Banco de dados

        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, dvd.getIdDvd());
            pst.setInt(2, dvd.getIdFilme());


            pst.execute();
            sucesso = true;

            System.out.println("Filme cadastrado no dvd " + dvd.getIdDvd() + ".");

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
