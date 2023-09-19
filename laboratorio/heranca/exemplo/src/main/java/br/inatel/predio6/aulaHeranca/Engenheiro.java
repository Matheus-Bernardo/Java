package br.inatel.predio6.aulaHeranca;

public class Engenheiro extends Funcionario{
    //atributo específico do engenheiro
    public String ramo;

    public Engenheiro(String nome, String cpf, int idade, double salario, String ramo) {
        super(nome, cpf, idade, salario);//referencia classe mae
        this.ramo = ramo;
    }

    //método vindo da classe mãe(Funcionario)

    //poliformismo
    @Override
    public void mostrarInfos(){
        System.out.println("Informações do Engenheiro");
        super.mostrarInfos();
        System.out.println("Ramo de atuação: "+ramo);

    }
}
