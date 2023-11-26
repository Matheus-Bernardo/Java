package br.inatel.trabalho.Locadora.Models;

public class Filme {
    //atributos da classe filme
    private int idFillme;
    private String nomeFilme;
    private String dataLancamento;

    //construtores
    public Filme( String nomeFilme, String dataLancamento) {
        this.nomeFilme = nomeFilme;
        this.dataLancamento = dataLancamento;
    }
    public Filme( int idFillme,String nomeFilme, String dataLancamento) {
        this.nomeFilme = nomeFilme;
        this.idFillme = idFillme;
        this.dataLancamento = dataLancamento;
    }

    //getters e setters
    public int getIdFillme() {
        return idFillme;
    }

    public void setIdFillme(int idFillme) {
        this.idFillme = idFillme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
