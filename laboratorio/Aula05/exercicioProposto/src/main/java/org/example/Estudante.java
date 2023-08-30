package org.example;

public class Estudante {

    //atributos do estudante
    String nome;
    String anoLetivo;
    int idade;

    //métodos dos estudantes
    public void mostrarInfos(){
        System.out.println("-----------Infos do Estudante---------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Ano Letivo: "+ anoLetivo);
        System.out.println("Idade: "+ idade);
    }
}
