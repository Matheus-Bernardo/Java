package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Matheus";
        piloto1.vilao = true;

        piloto2.nome = "jorge";
        piloto2.vilao = false;

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "ferrari";
        kart2.nome = "maclaren";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.motor.cilindradas = "150";
        kart2.motor.cilindradas = "98";

        kart1.motor.velocidadeMaxima = 150;
        kart2.motor.velocidadeMaxima = 100;

        kart1.motor.mostrarInfo();


    }
}