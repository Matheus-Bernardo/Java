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

    //sobreEscrita do Construtor
    public Cliente(String nome,String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //getters
    public String getCpf() {return this.cpf;}
    public String getNome() {return this.nome;}
    public String getEndereco() {return this.endereco;}
    public String getTelefone() {return this.telefone;}
    public String getEmail() {return this.email;}


}
