package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //objeto escola
        Escola escola = new Escola();
        escola.nome = "Inatel";
        escola.endereco = "rua 10";
        escola.numTelefone = 99998888;
        escola.email = "inatel@gmail.com";

        //criando Menu
        boolean controle = true;

        while (controle){
            System.out.println("Bem vindo ao sistema de Cadastro");
            System.out.println("1 - adionar alunos");
            System.out.println("2 - Mostrar informações");
            System.out.println("3- Mostrar quantidade por Ano");
            System.out.println("4 - Sair");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    Estudante aluno = new Estudante();
                    System.out.println("Nome do aluno: ");
                    aluno.nome = entrada.nextLine();
                    System.out.println("Idade do Aluno: ");
                    aluno.idade = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Ano em que o aluno estuda:");
                    aluno.anoLetivo = entrada.nextLine();
                    //adicionando estudante
                    escola.addEstudante(aluno);

                    break;
                case 2:
                    escola.mostrarInfos();
                    break;
                case 3:
                    escola.qtdAlunosPorAno();
                    break;
                case 4:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        }

    }
}
