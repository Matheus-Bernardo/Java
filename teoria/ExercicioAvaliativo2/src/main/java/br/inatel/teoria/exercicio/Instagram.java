package br.inatel.teoria.exercicio;

public class Instagram extends RedeSocial{
    //reescrita de métodos da classe mãe
    @Override
    public void postarFoto() {System.out.println("Postou uma foto no instagram");}
    @Override
    public void postarVideo() {System.out.println("Postei um video no instagram");}
    @Override
    public void postarComentario() {System.out.println("comentei no instagram");}
}
