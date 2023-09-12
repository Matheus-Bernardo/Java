package org.example;

import java.util.Scanner;

public class Computador {

    String marca;
    float preco;
    HardwareBasico hardware;
    SistemaOperacional sistemaOp;
    MemoriaUSB usb = new MemoriaUSB();



    public Computador(){
        hardware = new HardwareBasico();
        sistemaOp = new SistemaOperacional();

    }

    void mostraPCConfigs(){
        System.out.println("Marca:"+marca);
        System.out.println("Preço:" + preco);
        System.out.println("Sistema Operacional:" + sistemaOp.nome);
        System.out.println("tipo do Sistema operacional: "+sistemaOp.tipo);
        System.out.println("Hardware Basico: " +hardware.nome);
        System.out.println("Capacidade do Hardware:" + hardware.capacidade);
    }


    void addMemoriaUSB(MemoriaUSB usb){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a capacidade da memória USB:");
        usb.capacidade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Informe o nome da memória USB:");
        usb.nome = entrada.nextLine();
    }


}
