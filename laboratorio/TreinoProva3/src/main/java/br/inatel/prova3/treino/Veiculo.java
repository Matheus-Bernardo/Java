package br.inatel.prova3.treino;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double kmsRodados;
    private Motor motor;

    public Veiculo() {
        this.motor = new Motor();
    }

    public void mostrarInfos(){
        System.out.println("Marca do veículo: "+ getMarca());
        System.out.println("Modelo do veículo: "+ getModelo());
        System.out.println("Ano do veículo: "+ getAno());
        System.out.println("quilometros rodados: "+getKmsRodados());
        System.out.println("cilindros:" + getMotor().getNumCilindros());
        System.out.println("Potencia do motor:" + getMotor().getPotencia());

    };

    //getters e setters


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

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
