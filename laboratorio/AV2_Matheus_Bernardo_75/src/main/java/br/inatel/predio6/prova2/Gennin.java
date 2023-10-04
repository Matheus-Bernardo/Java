package br.inatel.predio6.prova2;

public class Gennin extends Ninja implements Treinamento,Batalhar{
    //atributos
    private String NomeSensei;

    public void realizarMissao(){

        System.out.println(" está realizando uma missão");

    }
    public void treinarJutsu(){
        if(super.getJutsu().getTipo().equalsIgnoreCase("Kekkei-Genkai")){
            int novoPoder = getPoder() + 15;
            setPoder(novoPoder);
        } else if (super.getJutsu().getTipo().equalsIgnoreCase("taijutsu")) {
            int novoPoder = getPoder() + 5;
            setPoder(novoPoder);
        }
        System.out.println("O " + getNome() + "realizou um treinamento para do seu jutsu e seu poder agora é de "+ getPoder());
    }
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Nome Sensei:" + getNomeSensei());


    }

    //poliformismo da interface treinamento
    @Override
    public void treinarParaExame(){
        if(getNomeSensei().equalsIgnoreCase("Kakashi")){
            int novoPoder = getPoder() + 10;
            setPoder(novoPoder);

        }else System.out.println("Está em treinamento");
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
        System.out.println("Ataque fraco, sem chakra utilizado");
        System.out.println("Nome do ninja: "+getNome());
        System.out.println("chakra do ninja: "+getChakra());

    }


    //getter e setters


    public String getNomeSensei() {
        return NomeSensei;
    }

    public void setNomeSensei(String nomeSensei) {
        NomeSensei = nomeSensei;
    }
}
