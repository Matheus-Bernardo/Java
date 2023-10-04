package br.inatel.predio6.prova2;

public abstract  class Ninja {

    //instanciando Jutsu
    Jutsu jutsu;

    //atributos
    private static int numTotalNinjas;
    private int registroNinja;
    private String nome;
    private int idade;
    private char rank;
    private double chakra;
    private int numMissoesCompletas;
    private int poder;

    //construtor
    public Ninja() {
        registroNinja = numTotalNinjas;
        numTotalNinjas++;
        jutsu = new Jutsu();
        System.out.println("Ninjas na aldeia: " + numTotalNinjas );

    }


    public void mostrarInfos(){
        //chamando metodo antes de exibir infos
        classificar();

        System.out.println("Nome:" + getNome());
        System.out.println("idade:" + getIdade());
        System.out.println("Rank:" + getRank());
        System.out.println("Chakra:" + getChakra());
        System.out.println("Jutsu:" + getJutsu());
        System.out.println("Missões cumpridas: " + getNumMissoesCompletas());
        System.out.println("Poder:" + getPoder());
        System.out.println("Registro do ninja" + getRegistroNinja());


    }


    public void classificar(){

        if(getNumMissoesCompletas() > 20 && getNumMissoesCompletas() < 41){
            rank = 'a';

        } else if (getNumMissoesCompletas() > 10 && getNumMissoesCompletas() < 21) {
            rank = 'b';
        } else if (getNumMissoesCompletas() > 40 ) {
            rank = 's';

        } else if (getNumMissoesCompletas() > 3) {
            System.out.println("Ninja ainda não tem ranking");
        }


    }

    //getter e setters


    public Jutsu getJutsu() {
        return jutsu;
    }

    public void setJutsu(Jutsu jutsu) {
        this.jutsu = jutsu;
    }

    public int getRegistroNinja() {
        return registroNinja;
    }

    public void setRegistroNinja(int registroNinja) {
        this.registroNinja = registroNinja;
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

    public char getRank() {
        return rank;
    }


    public double getChakra() {
        return chakra;
    }

    public void setChakra(double chakra) {
        this.chakra = chakra;
    }

    public int getNumMissoesCompletas() {
        return numMissoesCompletas;
    }

    public void setNumMissoesCompletas(int numMissoesCompletas) {
        this.numMissoesCompletas = numMissoesCompletas;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
