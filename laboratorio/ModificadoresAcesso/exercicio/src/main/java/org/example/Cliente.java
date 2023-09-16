package org.example;

public class Cliente {


    private String nome;
    private int id;
    private static int cont;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCont() {
        return cont;
    }

}
