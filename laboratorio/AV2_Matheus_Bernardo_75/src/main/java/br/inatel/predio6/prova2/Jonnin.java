package br.inatel.predio6.prova2;

public class Jonnin extends Ninja implements Batalhar,Lideranca{

    private String habilidadeEspecial;

    public void treinarJutsu(){

        if(super.getJutsu().getTipo().equalsIgnoreCase("Kekkei-Genkai")){
            int novoPoder = getPoder() + 100;
            setPoder(novoPoder);
        } else if (super.getJutsu().getTipo().equalsIgnoreCase("taijutsu")) {
            int novoPoder = getPoder() + 40;
            setPoder(novoPoder);
        }

        System.out.println("O " + getNome() + "realizou um treinamento para do seu jutsu e seu poder agora é de "+ getPoder());

    }
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("habilidade Especial:" +getHabilidadeEspecial() );

    }
    //poliformismo da interface Batalhar
    @Override
    public void lutar(){
        System.out.println("Está acontecendo uma luta");
        System.out.println("Informações de quem está lutando");
        this.mostrarInfos();
    }
    @Override
    public void atacar(){
        //decrementos dos chakras
        if(habilidadeEspecial.equalsIgnoreCase("clones")){
             double novoChakra = getChakra() - (getChakra()*0.05);
             setChakra(novoChakra);

        } else if (habilidadeEspecial.equalsIgnoreCase("teletransporte")) {
            double novoChakra = getChakra() - (getChakra()*0.07);
            setChakra(novoChakra);
        }

    }
    //poliformismo da interface Liderar
    @Override
    public void liderarTime(){
        System.out.println("Liderando");
    }

    //getter e setters

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
