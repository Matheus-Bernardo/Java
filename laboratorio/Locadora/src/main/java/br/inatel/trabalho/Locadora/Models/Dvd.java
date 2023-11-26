package br.inatel.trabalho.Locadora.Models;

public class Dvd {
    //atributos
    private int idDvd;
    private String alugado;
    private int idFilme;

    //construtores
    public Dvd(int idFilme , String alugado) {
        this.idFilme = idFilme;
    }
    public Dvd(int idDvd,int idFilme , String alugado) {
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

    public String getAlugado() {
        return alugado;
    }

    public void setAlugado(String alugado) {
        this.alugado = alugado;
    }
}
