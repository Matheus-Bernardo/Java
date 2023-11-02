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
                    System.out.println("cadastrando cliente");
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
