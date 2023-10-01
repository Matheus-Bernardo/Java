package br.inatel.predio6.provaTreino;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Cidade {

    private String nome;//nome da cidade
    private Personagem [] personagens;

    public Cidade() {
        personagens = new Personagem[2];
    }



    //método para adionar novos personagens
    public void adicionarPersonagens(Personagem p){
        for (int i = 0; i < personagens.length ; i++) {
            if (personagens[i] == null){
                personagens[i] = p;
                break;
            }

        }
    }

    //método para exibir informações dos personagens no vetor
    public void listarPersonagens(){
        for (int i = 0; i < personagens.length; i++) {
            System.out.println("personagem "+i+":");
            personagens[i].mostrarInfos();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Personagem[] getPersonagens() {
        return personagens;
    }

    public void setPersonagens(Personagem[] personagens) {
        this.personagens = personagens;
    }
}
