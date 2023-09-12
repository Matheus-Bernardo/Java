package org.example;

public class Cantina {

    String nome;
    Salgado[] salgado = new Salgado[3];

    void addSalgado (Salgado novoSalgado){

        for (int i = 0; i < salgado.length; i++) {
            if (salgado[i] == null){
                salgado[i] = novoSalgado;
                break;
            }
        }
    }
    void mostrarInfo(){
        for (int i = 0; i < salgado.length ; i++) {
            System.out.println("Salgado "+(i+1)+ ": "+ salgado[i].nome);
        }
    }
}
