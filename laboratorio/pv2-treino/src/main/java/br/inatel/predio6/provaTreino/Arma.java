package br.inatel.predio6.provaTreino;

public class Arma {

    private int forca;
    private String tipoArma;

    public void mostrarInfos(){
        System.out.println("força:"+getForca());
        System.out.println("Tipo da arma:" + getTipoArma());
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
