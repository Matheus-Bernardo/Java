package org.example;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();//cria uma instancia de Conta
        Conta conta2 = new Conta();

        conta1.nomeDono = "Matheus";
        conta1.limite =1000;
        conta1.numero = 1;
        conta1.saldo = 1000.50f;

        conta2.nomeDono = "Marcos";
        conta2.limite =2500;
        conta2.numero = 2;
        conta2.saldo = 1000.50f;

        conta1.transferir(conta2,100);
        System.out.println("o saldo da conta 1 é:" +conta1.saldo);
        System.out.println("o saldo da conta 2 é:" +conta2.saldo);

    }
}
