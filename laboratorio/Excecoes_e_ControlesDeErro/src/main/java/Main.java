import br.inatel.predio6.aula.Funcionario;
import br.inatel.predio6.aula.Modelos.Conta;
import br.inatel.predio6.aula.SemSaldoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        //lançando algumas exceções conhecidas

        Funcionario func1 = new Funcionario("Matheus","tecnico",21);
        Funcionario func2 = new Funcionario("Eliana","tecnico teleco",23);
        Funcionario func3 = new Funcionario("jorge","tecnico enf",43);


        //criando array de funciarios
        Funcionario[] funcionarios = new Funcionario[10];

        //adicionar os funcionarios
        funcionarios[0] = func1;
        funcionarios[1] = func2;

        //ArrayIndexOutOfBoundsException
        try {
            funcionarios[11] = func3;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Deu ruim mas vou seguir");
            //e.printStackTrace(); //mostra o erro
        }




        try {
            for (int i = 0; i < funcionarios.length; i++) {
                if (funcionarios[i]!= null){
                    //o trecho de código que potencialmente pode gerar erro
                    System.out.println("Nome:" + funcionarios[i].getNome());
                    System.out.println("Cargo:" + funcionarios[i].getCargo());
                    System.out.println("Idade:" + funcionarios[i].getIdade());
                }

            }
        }catch(NullPointerException e){
            System.out.println("Deu ruim");
        }



        System.out.println("Continua rodando ");

        //variavel entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Tratamento de erro aritmetico
        int media;//media da divisão
        media = 0;
        try {
            System.out.println("Entre com um valor de n1 > ");
            int n1 = entrada.nextInt();

            System.out.println("Entre com um valor de n2 > ");
            int n2 = entrada.nextInt();

            media = n1/n2;
        }catch (ArithmeticException e){
            System.out.println("Seu código está com divisão por 0");
        }catch (InputMismatchException input){
            System.out.println("Deu erro no tipo de entrada de dados");
        }finally {
            media = media;
            System.out.println("A média é " + media);
        }
        System.out.println("depois da divisão");

        */

        //exceções personalizadas
        Conta conta1 = new Conta(1000,"Matheus");

        try {
            conta1.sacar(1200);
        } catch (SemSaldoException e) {
            throw new RuntimeException(e);
        }


    }
}
