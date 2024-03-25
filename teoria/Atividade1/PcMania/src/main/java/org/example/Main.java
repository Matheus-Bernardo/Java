package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);
    Computador pc1 = new Computador();
    Computador pc2 = new Computador();
    Computador pc3 = new Computador();
    Cliente cliente = new Cliente();

    //dados Pc1
    pc1.marca = "Positivo";
    pc1.preco = 2.300f;
    pc1.hardware.capacidade = 500;
    pc1.hardware.nome = " Pentium Core i3 (2200 Mhz)";
    pc1.sistemaOp.tipo = 32;
    pc1.sistemaOp.nome = "Sistema Operacional Linux Ubuntu";
    pc1.usb.nome = "Pen Drive";
    pc1.usb.capacidade = 16;


    //dados pc2
    pc2.marca = "Acer";
    pc2.preco = 5.800f;
    pc2.hardware.capacidade = 1;
    pc2.hardware.nome = " Pentium Core i5 (3370 Mhz)";
    pc2.sistemaOp.tipo = 64;
    pc2.sistemaOp.nome = "Sistema Operacional Windowns 8";
    pc2.usb.nome = "Pen Drive";
    pc2.usb.capacidade = 32;


    //dados pc3
    pc3.marca = "Vaio";
    pc3.preco= 1800f;
    pc3.hardware.capacidade = 32;
    pc3.hardware.nome = " Pentium Core i7 (4700 Mhz)";
    pc3.sistemaOp.tipo = 64;
    pc3.sistemaOp.nome = "Sistema Operacional Windowns 10";
    pc3.usb.nome = "HD Externo ";
    pc3.usb.capacidade = 1;

    //dados cliente
     cliente.nome = "Matheus";
     cliente.cpf = "155.155.155.81";


    boolean controle = false;

    while (controle == false){
        int opcao;
        System.out.println("Deseja comprar qual oferta? 1 - 2 - 3 ou deseja sair(0)?");
        opcao = entrada.nextInt();
        entrada.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Parabéns, voce comprou o computador da oferta 1");

                for (int i = 0; i < cliente.pcs.length; i++) {
                    if (cliente.pcs[i] == null){
                        cliente.pcs[i] = pc1;
                        break;
                    }
                }
                break;

            case 2:
                System.out.println("Parabéns, voce comprou o computador da oferta 2");

                for (int i = 0; i < cliente.pcs.length; i++) {
                    if (cliente.pcs[i] == null){
                        cliente.pcs[i] = pc2;
                        break;
                    }
                }
                break;

            case 3:
                System.out.println("Parabéns, voce comprou o computador da oferta 3");

                for (int i = 0; i < cliente.pcs.length; i++) {
                    if (cliente.pcs[i] == null){
                        cliente.pcs[i] = pc3;
                        break;
                    }
                }
                break;
            case 0:
                System.out.println("Finalizando Compras");
                controle = true;
        }
    }


        System.out.println("Cliente: " + cliente.nome);
        System.out.println("cpf:" + cliente.cpf);
        System.out.println("Informações dos pcs adquiridos:");
        for (int i = 0; i < cliente.pcs.length ; i++) {
            if (cliente.pcs[i] != null){
                cliente.pcs[i].mostraPCConfigs();
            }
        }
        System.out.println("Total da compra feita:" + cliente.calculaTotalCompra());

    }

}