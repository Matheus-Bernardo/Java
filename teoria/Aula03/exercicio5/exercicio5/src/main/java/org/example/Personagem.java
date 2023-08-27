package org.example;

public class Personagem {
    Arma arma = new Arma();
    String nome;
    int pontos;
    void usarArma(){

        arma.resistencia -= 2;
        System.out.println("A resistencia da arma é de: "+arma.resistencia);
    }
    void tomarDano()
    {
         pontos -=5;
        System.out.println("A vida do personagem "+nome+ "é de: "+pontos);
    }


}
