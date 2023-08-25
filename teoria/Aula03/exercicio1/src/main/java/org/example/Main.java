package org.example;

public class Main {

    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida =100;
        zumbi1.nome = "Do mal";

        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida =100;
        zumbi2.nome = "Do bem";

        zumbi1.mostraVida();
        zumbi1.transfereVida(zumbi2,10);



    }
}
