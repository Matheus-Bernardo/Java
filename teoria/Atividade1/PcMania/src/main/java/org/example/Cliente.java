package org.example;

public class Cliente {

    String nome;
    String cpf;
    Computador pc1 = new Computador();

    float calculaTotalCompra(){
        return pc1.preco;
    }


}
