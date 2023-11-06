import br.inatel.trabalho.Locadora.DAO.ClienteDao;
import br.inatel.trabalho.Locadora.DAO.DvdDAO;
import br.inatel.trabalho.Locadora.DAO.FilmeDAO;
import br.inatel.trabalho.Locadora.Models.Cliente;
import br.inatel.trabalho.Locadora.Models.Dvd;
import br.inatel.trabalho.Locadora.Models.Filme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);//Entrada de dados

        boolean controle = true;//variavel de controle do menu

        //inicio do Menu
        while(controle){

            //menu Inicial
            System.out.println("Bem vindo a locadora");
            System.out.println("1- Cadastrar novo Cliente");
            System.out.println("2- Adicionar filme ao catálogo da Locadora");
            System.out.println("3- Alugar filme");
            System.out.println("4- Sair");

            System.out.println("Informe a opção escolhida");
            int opcao = entradaDados.nextInt();
            entradaDados.nextLine();

            switch (opcao){
                case 1:
                    //dados dos clientes
                    System.out.println("Nome do cliente:");
                    String nome = entradaDados.nextLine();
                    //entradaDados.nextLine();

                    System.out.println("cpf do cliente:");
                    String cpf = entradaDados.nextLine();

                    System.out.println("endereço do cliente:");
                    String endereco = entradaDados.nextLine();

                    System.out.println("telefone do cliente:");
                    String telefone = entradaDados.nextLine();

                    System.out.println("email do cliente:");
                    String email = entradaDados.nextLine();

                    //criando um cliente a ser inserido no banco
                    Cliente cliente = new Cliente(cpf,nome,endereco,telefone,email);//cria novo cliente

                    //inserindo cliente no banco
                    ClienteDao novoCliente = new ClienteDao();
                    novoCliente.insertCliente(cliente);

                    break;
                case 2:
                    System.out.println("filme novo cadastrado");
                    //dados dos filmes
                    System.out.println("Entre com o ID único do filme: ");
                    int idFilme=entradaDados.nextInt();
                    entradaDados.nextLine();

                    System.out.println("Entre com o nome do Filme:");
                    String nomeFilme = entradaDados.nextLine();

                    System.out.println("Informe a data de lançamento: ");
                    String dataLancamento = entradaDados.nextLine();

                    //cria novo filme
                    Filme filme = new Filme(idFilme,nomeFilme,dataLancamento);

                    //inserindo filme no banco
                    FilmeDAO novoFilme = new FilmeDAO();
                    novoFilme.insertFilme(filme);


                    break;
                case 3:

                    System.out.println("Entre com o ID único do DVD:");
                    int idDvd = entradaDados.nextInt();
                    entradaDados.nextLine();

                    System.out.println("Entre com o ID do filme que você deseja gravar no DVD:");
                    int idFilmeDvd = entradaDados.nextInt();

                    //grava um novo filme no dvd
                    Dvd novoDvd = new Dvd(idDvd,idFilmeDvd);

                    //insere novo Dvd no banco
                    DvdDAO filmeGravadoDvd = new DvdDAO();
                    filmeGravadoDvd.insertFilmeNoDvd(novoDvd);

                    break;
                case 4:
                    System.out.println("Saindo");
                    controle=false;
                    break;
                default:
                    System.out.println("Opção Incorreta");
                    break;

            }
        }
    }
}
