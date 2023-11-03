import br.inatel.trabalho.Locadora.DAO.ClienteDao;
import br.inatel.trabalho.Locadora.Models.Cliente;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner entradaDados = new Scanner(System.in);
        //variavel de controle do menu
        boolean controle = true;

        //inicio do Menu
        while(controle){

            System.out.println("Bem vindo a locadora");
            System.out.println("1- Cadastrar novo Cliente");
            System.out.println("2- Cadastrar novo filme");
            System.out.println("3- Alugar filme");
            System.out.println("4- Sair");

            System.out.println("Informe a opção escolhida");
            int opcao = entradaDados.nextInt();

            switch (opcao){
                case 1:

                    //dados dos clientes
                    System.out.println("Nome do cliente:");
                    String nome = entradaDados.nextLine();
                    entradaDados.nextLine();

                    System.out.println("cpf do cliente:");
                    String cpf = entradaDados.nextLine();

                    System.out.println("endereço do cliente:");
                    String endereco = entradaDados.nextLine();

                    System.out.println("telefone do cliente:");
                    String telefone = entradaDados.nextLine();

                    System.out.println("email do cliente:");
                    String email = entradaDados.nextLine();

                    Cliente cliente = new Cliente(cpf,nome,endereco,telefone,email);


                    //inserindo cliente no banco
                    ClienteDao novoCliente = new ClienteDao();

                    novoCliente.insertCliente(cliente);




                    break;
                case 2:
                    System.out.println("filme novo cadastrado");
                    break;
                case 3:
                    System.out.println("filme alugado");
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
