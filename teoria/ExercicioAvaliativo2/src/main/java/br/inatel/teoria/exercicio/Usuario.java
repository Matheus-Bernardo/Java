package br.inatel.teoria.exercicio;
import java.util.ArrayList;

public class Usuario {

    //atributos do Usuario
    private String nome;//nome do usuario
    private String email;//email do usuario


    //lista de redes sociais do usuario
    RedeSocial[] redesSociaisUsuarios = new RedeSocial[2];

    //Ao criar um usuario juntamente cria uma rede social
    public Usuario(RedeSocial[]  redeSociais) {
        //verificação se vetor de redesSociaisUsuarios está vazio para receber o parametro
        for (int i = 0; i < redesSociaisUsuarios.length; i++) {
            if (redesSociaisUsuarios[i] == null){
                redesSociaisUsuarios[i] = redeSociais[i];

            }
        }
    }

    //vetor auxiliar para mostrar as redes sociais que o user possuí
    public void mostrarInfos(){

        System.out.println("Usuario ativo:" + getNome());

        for (int i = 0; i < redesSociaisUsuarios.length ; i++) {
            if (redesSociaisUsuarios[i] instanceof Facebook ){
                //caso a rede social seja Facebook
                Facebook auxFB = (Facebook) redesSociaisUsuarios[i];
                auxFB.compartilhar();
                auxFB.curtirPublicacao();
                auxFB.fazStreaming();
            } else if (redesSociaisUsuarios[i] instanceof  Instagram) {
                Instagram auxInstagram = (Instagram) redesSociaisUsuarios[i];
                auxInstagram.postarVideo();
                auxInstagram.postarComentario();
                auxInstagram.postarFoto();
            } else if (redesSociaisUsuarios[i] instanceof  GooglePlus) {
                GooglePlus auxGoogle = (GooglePlus) redesSociaisUsuarios[i];
                auxGoogle.compartilhar();
                auxGoogle.fazStreaming();
                auxGoogle.postarComentario();
            } else if (redesSociaisUsuarios[i] instanceof  Twitter) {
               Twitter auxTw = (Twitter) redesSociaisUsuarios[i];
               auxTw.postarVideo();
               auxTw.curtirPublicacao();
               auxTw.curtirPublicacao();
            }
        }
    }


    //getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
