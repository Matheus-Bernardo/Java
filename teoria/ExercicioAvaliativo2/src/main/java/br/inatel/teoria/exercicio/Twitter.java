package br.inatel.teoria.exercicio;

public class Twitter extends RedeSocial implements Compartilhamento{
    //métodos abstratos da classe mãe e interface
    //reescrita desses métodos
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando tweet");
    }//interface
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no twitter");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no twitter");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no twitter");
    }
}
