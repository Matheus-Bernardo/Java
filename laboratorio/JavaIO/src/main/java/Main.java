import br.inatel.aula.javaIO.Arquivo;
import br.inatel.aula.javaIO.Model.Funcionario;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //criando objeto de Arquivo
        Arquivo arq = new Arquivo();

        //entrada de dados
        Scanner sc = new Scanner(System.in);
        //Controlador menu
        boolean executando = true;
        //Criando obj Funcionario
        Funcionario func = new Funcionario();

        while (executando){
            System.out.println("+++ Bem Vindo ao menu de Cadastro do Funcionário");
            System.out.println("1-Cadastrar Funcionarios");
            System.out.println("2-Listar Funcionarios");
            System.out.println("3-Sair");
            int op = sc.nextInt();


            //menu
            switch (op){
                case 1:
                    System.out.println("Nome: ");
                    func.setNome(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Cargo: ");
                    func.setCargo(sc.nextLine());
                    System.out.println("Idade: ");
                    func.setIdade(sc.nextInt());

                    //escrevendo funcionario no arquivo
                    //método escrita
                    arq.escrever(func);

                    break;
                case 2:
                    System.out.println("Informações do Funcionário:");
                    //método leitura
                    ArrayList<Funcionario> funcionarios = arq.ler();

                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println("Nome:" +funcionarios.get(i).getNome() );
                        System.out.println("Cargo:" + funcionarios.get(i).getCargo() );
                        System.out.println("Idade:" + funcionarios.get(i).getIdade());
                    }

                    break;
                case 3:
                    System.out.println("Saindo...");
                    executando = false;

                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }
    }
}
