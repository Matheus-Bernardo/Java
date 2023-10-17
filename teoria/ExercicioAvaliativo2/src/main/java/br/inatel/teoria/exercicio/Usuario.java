package br.inatel.teoria.exercicio;
import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String email;


    //lista de redes sociais do usuario
    RedeSocial[] redesSociaisUsuarios = new RedeSocial[2];

    //Ao criar um usuario juntamente cria uma rede social
    public Usuario(RedeSocial[]  redeSociais) {
        //verificação se vetor de redesSociaisUsuarios está vazio para receber o parametro
        for (int i = 0; i < redesSociaisUsuarios.length; i++) {
            if (redesSociaisUsuarios[i] == null){
                redesSociaisUsuarios[i] = redeSociais[i];
                break;
            }
        }
    }

    public void mostrarInfos(){
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
