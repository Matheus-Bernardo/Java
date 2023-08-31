package org.example;
public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        Salgado sg1 = new Salgado();
        Salgado sg2 = new Salgado();
        Salgado sg3 = new Salgado();

        cantina.nome = "Cantina do Inatel";
        sg1.nome = "coxinha";
        sg2.nome = "esfirra";
        sg3.nome = "enroladinho";

        cantina.addSalgado(sg1);
        cantina.addSalgado(sg2);
        cantina.addSalgado(sg3);

        cantina.mostrarInfo();
    }
}