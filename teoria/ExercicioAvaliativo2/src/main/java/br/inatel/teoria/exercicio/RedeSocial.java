package br.inatel.teoria.exercicio;

public abstract class RedeSocial {
    //atributos rede social
    protected String senha; // senha da rede social
    protected int numAmigos; // número de amigos

    //métodos abstratos de RedeSocial
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
