package org.example;

public class Equipamento {

    int numSerie;
    String nome;
    String marca;
    double valorAquisicao;
    String status;

    void mostrarInfos() {
        System.out.println("Numero de série:" + numSerie);
        System.out.println("nome:" + nome);
        System.out.println("Marca:" + marca);
        System.out.println("valor de Aquisição:" + valorAquisicao);
        System.out.println("Status: "+ status);
    }

}
