package br.inatel.teoria.exercicio;

public class Facebook extends RedeSocial implements Compartilhamento,VideoConferencia{



    //métodos reescritos da classe mãe/interface
    @Override
    public void compartilhar() { System.out.println("Compartilhando publicação no facebook");}//método da interface
    @Override
    public void fazStreaming() {
        System.out.println("realizou uma vídeo conferência no Facebook");}//método da interface
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Facebook");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Facebook");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Facebook");
    }

    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
    }



}
