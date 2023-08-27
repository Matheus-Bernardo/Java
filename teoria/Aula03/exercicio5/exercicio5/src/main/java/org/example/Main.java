package org.example;
public class Main {
    public static void main(String[] args) {

        Arma arma1 = new Arma();
        Personagem p1 = new Personagem();


        arma1.resistencia = 50;
        arma1.nome = "ak-47";
        arma1.desc = "fuzil";
        arma1.poder = 90;

        p1.arma = arma1;
        p1.nome = "matheus";
        p1.pontos =100;

        p1.tomarDano();
        p1.usarArma();



    }
}