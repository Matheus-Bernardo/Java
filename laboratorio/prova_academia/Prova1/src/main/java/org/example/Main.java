package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Equipamento equipamento = new Equipamento();
        Academia academia = new Academia();
        boolean sair = false;

        academia.nome = "Academia1";
        academia.numTelefone = "(35) 99999-8888";



        while (sair != true){
            System.out.println("Bem vindo ao menu!");
            System.out.println("1- Adicionar equipamentos na Academia");
            System.out.println("2- mostras informações da academia e de seus equipamentos");
            System.out.println("3- quantidade de equipamentos / % em manutenção");
            System.out.println("4- Infos do equipamento de maior custo");
            System.out.println("5- Sair");
            int controle = entrada.nextInt();
            switch (controle){
                case 1:

                    System.out.println("valor de aquisição: ");
                    equipamento.valorAquisicao = entrada.nextDouble();

                    entrada.nextLine();
                    System.out.println("nome do equipamento: ");
                    equipamento.nome = entrada.nextLine();

                    System.out.println("numero de série: ");
                    equipamento.numSerie = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Marca:");
                    equipamento.marca = entrada.nextLine();


                    System.out.println("Status:");
                    equipamento.status = entrada.nextLine();

                    academia.cadastrarEquipamentos(equipamento);

                    break;

                case 2:

                    for (int i = 0; i < academia.equipamento.length ; i++) {
                        if (academia.equipamento[i] != null){
                            academia.equipamento[i].mostrarInfos();

                        }else {
                            break;
                        }
                    }

                    break;

                case 3:
                    academia.infosEquipamentosManutencao();
                    break;

                case 4:

                    academia.mostrarMaisCaroMaisBarato();
                    break;

                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("opção invalida!");
                    break;
            }


        }



    }
}