package org.example;

public class Cliente {

    String nome;
    String cpf;
    Computador[] pcs = new Computador[10];
    float totalCompra = 0;

    float calculaTotalCompra() {
        totalCompra = 0;
        for (int i = 0; i < pcs.length; i++) {
            if (pcs[i] != null) {
                totalCompra = totalCompra + pcs[i].preco;
            }
        }
        return totalCompra;
    }

}

