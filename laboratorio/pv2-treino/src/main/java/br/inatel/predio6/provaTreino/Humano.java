package br.inatel.predio6.provaTreino;

import java.util.Scanner;

public class Humano extends Personagem implements Aprimorar,Lutar {

    Arma arma = new Arma();

    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;


    //mostra as informações do Humano
    public void mostrarInfos(){
        super.mostrarInfos();//mostra as informaçãoes da classe mãe
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Vagalume:" + isVagalume());
        System.out.println("Energia: " +getEnergia());
        System.out.println("Distancia da escuta: "+getDistanciaEscuta());
        System.out.println("arma:" + getArma().getTipoArma());
        System.out.println("Força arma:" +getArma().getForca());


    }

    //método para adicionar uma arma
    public void addArma(Arma arma){
        this.arma = arma;
    }

    //reescrevendo o método modificar arma da interface "Aprimorar"
    @Override
    public void modificarArma(){
        int novaForca = arma.getForca() + 5;
        this.arma.setForca(novaForca);
        System.out.println("Informaçãoes da arma após Modificações");
        this.arma.mostrarInfos();
    }


    //método para modificar habilidade do Humano usando polimorfismo
    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade){

        //verifica se a quantidade de pílulas é válida para prosseguir
        while(qtdPilulas <0){
            System.out.println("Informe um número de pílulas válido, maior que 0!");
            Scanner entrada = new Scanner(System.in);
            qtdPilulas = entrada.nextInt();
        }

        //verificação para saber qual habilidade quer modificar
        if(tipoHabilidade.equalsIgnoreCase("energia")){

            //verifica a porcentagem de aumento de energia com base na quantidade de pilulas tomadas
            if(qtdPilulas <=10){
                double energiaNova = getEnergia() + (getEnergia() * 0.02);
                this.setEnergia(energiaNova);
                System.out.println("Energia Nova: " +getEnergia());
            }else {
                double energiaNova = getEnergia() + (getEnergia() * 0.04);
                this.setEnergia(energiaNova);
                System.out.println("Energia Nova: " +getEnergia());
            }
        }


        if(tipoHabilidade.equalsIgnoreCase("escuta")){
            //verifica a porcentagem de aumento de distancia de escuta do personagem com base na quantidade de pilulas tomadas
            if(qtdPilulas <=10){
                double escutaNova = getDistanciaEscuta() + (getDistanciaEscuta() * 0.02);
                this.setDistanciaEscuta(escutaNova);
                System.out.println("escuta Nova: " +getDistanciaEscuta());
            }else {
                double escutaNova = getDistanciaEscuta() + (getDistanciaEscuta() * 0.05);
                System.out.println("escuta Nova: " +getDistanciaEscuta());
            }
        }

    }




    //métodos para a interface Lutar
    @Override
    public void atacar(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Arma:" +getArma());
    }

    @Override
    public void defender() {
        System.out.println("Defendendo de zumbi");
    }


    //getter e setters
    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVagalume() {
        return vagalume;
    }

    public void setVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getDistanciaEscuta() {
        return distanciaEscuta;
    }

    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }
}
