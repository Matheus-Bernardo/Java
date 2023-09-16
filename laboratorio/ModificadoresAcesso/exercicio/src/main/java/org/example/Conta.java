package org.example;

public class Conta {

    Cliente clientes = new Cliente();

    private double saldo;
    private static int qtdClientes;

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public void deposita(double valor){
        saldo += valor;

    }
    public void saca(double valor){
        if (saldo >= valor){
            saldo -= valor;
        }else System.out.println("Saldo Insuficiente!");
    }
    public void extrato(){
        System.out.println("Extrato/ saldo na conta: "+saldo);
    }


}
