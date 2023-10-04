package br.inatel.predio6.prova2;

public class Aldeia {


    //atributos
    private String nome;
    private String paisLocalizacao;
    private String lider;
    private Ninja[] ninjas = new Ninja[2];


    public void registrarNinja(Ninja ninjas){
        //estrutura de varredura para verificação e inserção dos ninjas no vetor de ninjas
        for (int i = 0; i < this.ninjas.length ; i++) {
            if(this.ninjas[i] == null){
                this.ninjas[i] = ninjas;
                break;
            }
        }

    }

    public void listarNinjas(){
        for (int i = 0; i < this.ninjas.length; i++) {
            if (this.ninjas[i] instanceof Gennin){
                //cria uma variavel auxiliar
                Gennin auxGennin = (Gennin) this.ninjas[i];
                auxGennin.mostrarInfos();
                auxGennin.treinarJutsu();
                auxGennin.realizarMissao();
                
            } else if (this.ninjas[i] instanceof Jonnin) {
                Jonnin auxJonnin = (Jonnin) this.ninjas[i];
                auxJonnin.mostrarInfos();
                auxJonnin.treinarJutsu();

            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisLocalizacao() {
        return paisLocalizacao;
    }

    public void setPaisLocalizacao(String paisLocalizacao) {
        this.paisLocalizacao = paisLocalizacao;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public Ninja[] getNinjas() {
        return ninjas;
    }

    public void setNinjas(Ninja[] ninjas) {
        this.ninjas = ninjas;
    }
}
