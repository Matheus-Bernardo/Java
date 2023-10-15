package br.inatel.teoria.exercicio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //instanciando duas redes Sociais Para o usuario 1
        //criando(Instanciando) facebook
        Facebook fbUser1 = new Facebook();
        fbUser1.setSenha("senha123");
        fbUser1.setNumAmigos(13);

        //criando(Instanciando) Instagram
        Instagram instaUser1 = new Instagram();
        instaUser1.setSenha("123Senha");
        instaUser1.setNumAmigos(15);


        //printando informações
        Usuario user1 = new Usuario(fbUser1,instaUser1);
        user1.redesSociaisUsuarios[0].curtirPublicacao();
        user1.redesSociaisUsuarios[0].postarFoto();
        user1.redesSociaisUsuarios[0].postarVideo();

        user1.redesSociaisUsuarios[1].postarVideo();
        user1.redesSociaisUsuarios[1].curtirPublicacao();









    }


}
