package br.inatel.teoria.exercicio;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;


    //métodos
    public abstract void  postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação");
    }

    //getter e setters

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
}
