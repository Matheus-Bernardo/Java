package org.example;

public class Zumbi {
    float vida;
    String nome;
    void mostraVida(){
        System.out.println("a vida do zumbi é:"+vida);
    }

    void transfereVida(Zumbi zumbiAlvo,float quantia){

        vida -=quantia;
        zumbiAlvo.vida += quantia;

        System.out.println("vida do" + nome +"após a transferencia de vida é" + vida);
        System.out.println("Vida do "+zumbiAlvo.nome +  "após a transferencia de vida é"+zumbiAlvo.vida);
    }

}
