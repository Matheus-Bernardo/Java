package br.inatel.trabalho.Locadora.Models;

public class Dvd {
    //atributos
    private int idDvd;

    private int idFilme;

    public Dvd(int idDvd, int idFilme) {
        this.idDvd = idDvd;
        this.idFilme = idFilme;
    }

    //getters e setters

    public int getIdFilme() {
        return idFilme;
    }
    public int getIdDvd() {
        return idDvd;
    }



}
