package br.inatel.predio6.prova2;

public class Main {
    public static void main(String[] args) {

       //instanciando objeto Aldeia
        Aldeia aldeia = new Aldeia();
        aldeia.setNome("Yalahar");
        aldeia.setPaisLocalizacao("Brasil");

        //instanciando derivações de Ninjas
        Gennin gennin = new Gennin();
        gennin.setNome("Ninja1");
        gennin.setChakra(12);
        gennin.setIdade(13);
        gennin.setPoder(200);
        gennin.setNumMissoesCompletas(2);

        gennin.jutsu.setTipo("Kekkei-Genkai");




        Jonnin jonnin = new Jonnin();
        jonnin.setNome("Ninja2");
        jonnin.setChakra(20);
        jonnin.setIdade(19);
        jonnin.setPoder(230);
        jonnin.setNumMissoesCompletas(2);

        jonnin.jutsu.setTipo("Kekkei-Genkai");



        //registrando os ninjas na aldeia
        aldeia.registrarNinja(jonnin);//ninja 1
        aldeia.registrarNinja(gennin);//ninja 2


        aldeia.listarNinjas();



    }
}
