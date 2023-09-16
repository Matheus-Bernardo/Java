package org.example;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {

        Conta[] conta1 = new Conta[2];

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Matheus");
        cliente1.setId(12);


        Cliente cliente2 = new Cliente();
        cliente1.setNome("Leandro");
        cliente1.setId(1);

        //vetor auxiliar
        Cliente[] clientes = new Cliente[2];
        clientes[0]=cliente1;
        clientes[1]=cliente2;

        conta1[0].setClientes(cliente1);
        conta1[0].deposita(1500);
        conta1[0].saca(200);
        conta1[0].extrato();

        conta1[1].setClientes(cliente2);
        conta1[1].deposita(1500);
        conta1[1].saca(200);
        conta1[1].extrato();










    }
}