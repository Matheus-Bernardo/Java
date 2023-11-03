package br.inatel.trabalho.Locadora.Models;

public class Cliente {
    //atributos cliente
    private String cpf;//chave primaria
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    //construtor


    public Cliente(String cpf, String nome, String endereco, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //getters
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }


}
