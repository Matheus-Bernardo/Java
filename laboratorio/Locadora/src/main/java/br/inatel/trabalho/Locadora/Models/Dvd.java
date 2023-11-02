package br.inatel.trabalho.Locadora.Models;

public class Dvd {
    //atributos
    private int idDvd;
    private int idFilmeCorrespondende;// id do filme que está gravado no dvd

    //getters e setters
    public int getIdDvd() {
        return idDvd;
    }

    public void setIdDvd(int idDvd) {
        this.idDvd = idDvd;
    }

    public int getIdFilmeCorrespondende() {
        return idFilmeCorrespondende;
    }

    public void setIdFilmeCorrespondende(int idFilmeCorrespondende) {
        this.idFilmeCorrespondende = idFilmeCorrespondende;
    }
}
