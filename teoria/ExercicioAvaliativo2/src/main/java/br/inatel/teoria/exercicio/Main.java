package br.inatel.teoria.exercicio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //vetor auxiliar de rede social
        RedeSocial[] redeSociais = new RedeSocial[2];

        //instanciando duas redes Sociais Para o usuario 1
        //criando(Instanciando) facebook
        Facebook fbUser1 = new Facebook();
        fbUser1.setSenha("senha123");
        fbUser1.setNumAmigos(13);

        //criando(Instanciando) Instagram
        Instagram instaUser1 = new Instagram();
        instaUser1.setSenha("123Senha");
        instaUser1.setNumAmigos(15);

        redeSociais[0] = fbUser1;
        redeSociais[1] = instaUser1;


        //criando usuario com as redes sociais
        Usuario user1 = new Usuario(redeSociais);
        user1.setEmail("matheus@inatel.br");
        user1.setNome("Matheus");


        user1.mostrarInfos();













    }


}
