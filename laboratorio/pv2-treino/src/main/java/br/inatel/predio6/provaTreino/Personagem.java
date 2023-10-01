package br.inatel.predio6.provaTreino;

public abstract class Personagem {

    private static int numPersonagens;

    public Personagem() {
        numPersonagens++;
        System.out.println("numero de personagens" + numPersonagens);
    }

    private int vida;
    private int idPersonagem = numPersonagens;

    public void mostrarInfos(){
        System.out.println("Vida do Personagem:" +getVida());
        System.out.println("Id do Personagem:"+ getIdPersonagem());
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getIdPersonagem() {
        return idPersonagem;
    }




}
