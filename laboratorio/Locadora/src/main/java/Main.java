import br.inatel.trabalho.Locadora.DAO.*;
import br.inatel.trabalho.Locadora.Models.Ator;
import br.inatel.trabalho.Locadora.Models.Cliente;
import br.inatel.trabalho.Locadora.Models.Dvd;
import br.inatel.trabalho.Locadora.Models.Filme;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);//Entrada de dados

        boolean controle = true;//variavel de controle do menu

        Filme filme;
        FilmeDAO novoFilme = new FilmeDAO();
        DvdDAO filmeGravadoDvd;
        ClienteDao novoCliente = new ClienteDao();
        AtoresDAO atoresdao = new AtoresDAO();
        Ator ator;
        ParticipaDAO participa;

        //inicio do Menu
        while (controle) {

            //menu Inicial
            System.out.println("Bem vindo a locadora");
            System.out.println("1- Gerenciar Clientes ");
            System.out.println("2- Gerenciar filmes ");
            System.out.println("3- Gerenciar Atores");
            System.out.println("4- Sair");

            System.out.println("Informe a opção escolhida");
            int opcao = entradaDados.nextInt();
            entradaDados.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("1- cadastrar novo Cliente");
                    System.out.println("2- Listar Clientes");
                    System.out.println("3- remover cliente");
                    System.out.println("4- editar cliente");


                    opcao = entradaDados.nextInt();
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
                            Cliente cliente = new Cliente(cpf, nome, endereco, telefone, email);//cria novo cliente

                            //inserindo cliente no banco

                            novoCliente.insertCliente(cliente);
                            break;

                        case 2:
                            System.out.println("Clientes cadastrados no sistema");
                            novoCliente.listarCliente();
                            break;

                        case 3:
                            //remover cliente
                            novoCliente.listarCliente();
                            System.out.println("Informe o cpf do cliente que deseja excluir: ");
                            cpf = entradaDados.nextLine();
                            novoCliente.excluirCliente(cpf);


                            break;

                        case 4:
                            //alterar dados do cliente(telefone ou endereço)

                            System.out.println("Informe seu cpf:");
                            cpf = entradaDados.nextLine();

                            System.out.println("Informe o novo telefone:: ");
                            telefone = entradaDados.nextLine();

                            novoCliente.AtualizaCelularCliente(cpf,telefone);


                            break;

                        default:
                            System.out.println("opção Inválida");
                            break;
                    }


                    break;
                case 2:
                    System.out.println("1- Adicionar um filme no catálogo da locadora");
                    System.out.println("2- Gravar filme no Dvd ");
                    System.out.println("3- Alugar filme ");
                    opcao = entradaDados.nextInt();
                    entradaDados.nextLine();

                    switch (opcao){
                        case 1:
                            //dados dos filmes

                            System.out.println("Entre com o nome do Filme:");
                            String nomeFilme = entradaDados.nextLine();

                            System.out.println("Informe a data de lançamento: ");
                            String dataLancamento = entradaDados.nextLine();

                            //cria novo filme
                            filme = new Filme(nomeFilme, dataLancamento);

                            //inserindo filme no banco

                            novoFilme.insertFilme(filme);


                            break;

                        case 2:
                            novoFilme.listarFilmes();
                            System.out.println("Entre com o ID do filme que você deseja gravar no DVD:");
                            int idFilmeDvd = entradaDados.nextInt();


                            //grava um novo filme no dvd
                            Dvd novoDvd = new Dvd(idFilmeDvd, "NULL");

                            //insere novo Dvd no banco
                            filmeGravadoDvd = new DvdDAO();
                            filmeGravadoDvd.insertFilmeNoDvd(novoDvd);


                            break;

                        case 3://alugar filme

                            System.out.println("Informe seu cpf:");
                            String cpf = entradaDados.nextLine();
                            filmeGravadoDvd = new DvdDAO();
                            filmeGravadoDvd.ListarFilmes();

                            System.out.println("Informe o Id do dvd que irá alugar: ");
                            int dvdId = entradaDados.nextInt();
                            entradaDados.nextLine();
                            novoCliente.AlugaFilme(cpf, dvdId);
                            break;

                        default:
                            System.out.println("opção incorreta");
                            break;
                    }

                    break;

                case 3:

                    System.out.println("1- Remover ator");
                    System.out.println("2- Adicionar ator");
                    System.out.println("3- Adicionar ator ao Filme");

                    opcao = entradaDados.nextInt();
                    entradaDados.nextLine();

                    switch (opcao) {
                        case 1:
                            //Listando atores disponiveis
                            atoresdao.listarAtores();

                            System.out.println("Informe o id do Ator a ser removido");
                            int idAtor = entradaDados.nextInt();
                            entradaDados.nextLine();

                            atoresdao.excluirAtor(idAtor);
                            break;

                        case 2:
                            System.out.println("Informe o id do ator: ");
                            idAtor = entradaDados.nextInt();
                            entradaDados.nextLine();

                            System.out.println("Informe o nome do Ator");
                            String nomeAtor = entradaDados.nextLine();

                            ator = new Ator(idAtor,nomeAtor);
                            atoresdao.inserirAtor(ator);

                            break;

                        case 3:

                            novoFilme = new FilmeDAO();
                            novoFilme.listarFilmes();

                            atoresdao = new AtoresDAO();
                            atoresdao.listarAtores();

                            System.out.println("De acordo com a lista de atores e filmes presentes, defina qual ator fará parte de qual filme.");
                            System.out.println("Entre com o ID do ator: ");
                            idAtor = entradaDados.nextInt();
                            entradaDados.nextLine();

                            System.out.println("Entre com o ID do filme: ");
                            int idFilme = entradaDados.nextInt();
                            entradaDados.nextLine();

                            participa = new ParticipaDAO();

                            participa.adicionarAtorFilme(idAtor,idFilme);

                            break;
                        default:
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Saindo");
                    controle = false;
                    break;
                default:
                    System.out.println("Opção Incorreta");
                    break;

            }

        }
    }
}
