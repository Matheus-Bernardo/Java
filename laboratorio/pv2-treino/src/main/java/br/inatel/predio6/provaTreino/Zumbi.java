package br.inatel.predio6.provaTreino;

public class Zumbi extends Personagem implements Infectar,Lutar{

    private int diasInfeccao;
    private boolean cego;

    //mostra as informações do zumbi
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Dias infectados:" + getDiasInfeccao());
        transformacao();
        System.out.println("Cego: "+ isCego());
    }


    //método para verificar a transformação do zumbi
    public void transformacao(){
        if (diasInfeccao >1 && diasInfeccao<15){
            System.out.println("tipo do Zumbi: Corredor");
            this.cego = false;
        } else if (diasInfeccao >14 && diasInfeccao<366) {
            System.out.println("tipo do Zumbi: Perseguidor");
            this.cego = false;
        } else if (diasInfeccao > 365) {
            System.out.println("tipo do Zumbi: Estaladores");
            this.cego = true;
        }
    }


    //reescrita do método infectou da interface Infectar
    @Override
    public void infectou(){
        System.out.println("O zumbi mordeu e infectou um Humano");
    }



    //métodos para a interface Lutar
    @Override
    public void atacar(){
        mostrarInfos();
    }

    @Override
    public void defender() {
        System.out.println("Defendendo de Humano");
    }


    //getter e setters
    public int getDiasInfeccao() {
        return diasInfeccao;
    }

    public void setDiasInfeccao(int diasInfeccao) {
        this.diasInfeccao = diasInfeccao;
    }

    public boolean isCego() {
        return cego;
    }

}
