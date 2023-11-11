package br.inatel.trabalho.Locadora.Models;

public class Ator {
    private int idAtor;
    private String nomeAtor;

    //construtor


    public Ator(int idAtor, String nomeAtor) {
        this.idAtor = idAtor;
        this.nomeAtor = nomeAtor;
    }

    //getter e setters
    public int getIdAtor() {
        return idAtor;
    }
    public void setIdAtor(int idAtor) {
        this.idAtor = idAtor;
    }
    public String getNomeAtor() {
        return nomeAtor;
    }
    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

}
