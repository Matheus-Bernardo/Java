package br.inatel.aula.getSetter;

public class Conta {

    Cliente [] cliente;
    public Conta() {
        setCliente(new Cliente[3]);
    }

    private int numero;
    private float saldo;
    private float limite;

    public void sacar(float quantia){
        if (saldo > quantia){
            saldo -= quantia;
            System.out.println("Saque realizado!Novo saldo é de:" + saldo);
        }else System.out.println("Saldo insuficiente");

    }

    public void deposita(float quantia){
        saldo += quantia;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }


    public Cliente[] getCliente() {
        return cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
}
