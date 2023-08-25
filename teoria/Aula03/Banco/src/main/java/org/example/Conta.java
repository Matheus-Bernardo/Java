package org.example;

public class Conta {

    //atributos(variaveis)
    int numero;
    String nomeDono;
    float saldo;
    float limite;

    void transferir(Conta contaDestino, float quantia){

        saldo -= quantia;
        contaDestino.saldo +=quantia;

    }

}
