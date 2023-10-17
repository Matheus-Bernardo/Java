package br.inatel.teoria.exercicio;

public class GooglePlus extends RedeSocial implements Compartilhamento,VideoConferencia{

    //reescrita de métodos da classe mãe/ interface
    @Override
    public void compartilhar() {System.out.println("Compartilhando publicação no Google Plus");}//interface
    @Override
    public void fazStreaming() {
        System.out.println("Você está stremando no Google Plus");
    }//interface
    @Override
    public void postarFoto() {System.out.println("Postou foto no Google Plus");}
    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Google Plus");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Google Plus");
    }
}
