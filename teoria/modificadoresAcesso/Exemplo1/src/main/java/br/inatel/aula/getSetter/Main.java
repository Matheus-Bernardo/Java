package br.inatel.aula.getSetter;

public class Main {
    public static void main(String[] args) {

        Conta contaPoupanca = new Conta();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Matheus");
        cliente1.setCpf(1234);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("jonas");
        cliente2.setCpf(4321);

        //Array auxiliar para guardar cliente 1 e 2
        Cliente [] clientes = new Cliente[2];
        clientes[0]= cliente1;
        clientes[1]= cliente2;


        contaPoupanca.setCliente(clientes);
        contaPoupanca.setLimite(500);
        contaPoupanca.setNumero(4000);
        contaPoupanca.deposita(1550.00f);
        contaPoupanca.sacar(50f);

        System.out.println(contaPoupanca.getSaldo());



    }
}
