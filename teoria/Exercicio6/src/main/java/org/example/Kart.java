package org.example;

public class Kart {

    Motor motor;
    Piloto piloto;
    String nome;

    public Kart(){
        motor = new Motor();

    }

    void pular(){
        System.out.println("pulando....");
    }

    void turbo(){
        System.out.println("Turbo acionado");
    }

    void drift(){
        System.out.println("fazendo drift");
    }
}
