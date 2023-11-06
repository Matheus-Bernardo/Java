package br.inatel.prova3.treino;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double kmsRodados;


    public void mostrarInfos(){
        System.out.println("Marca do veículo: "+ getMarca());
        System.out.println("Modelo do veículo: "+ getModelo());
        System.out.println("Ano do veículo: "+ getAno());
        System.out.println("quilometros rodados: "+getKmsRodados());

    };

    //getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKmsRodados() {
        return kmsRodados;
    }

    public void setKmsRodados(double kmsRodados) {
        this.kmsRodados = kmsRodados;
    }
}
