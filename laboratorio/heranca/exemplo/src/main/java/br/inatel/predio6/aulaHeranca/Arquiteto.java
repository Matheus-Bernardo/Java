package br.inatel.predio6.aulaHeranca;

public class Arquiteto extends Funcionario{

    public String especialidade;

    public Arquiteto(String nome, String cpf, int idade, double salario, String especialidade) {
        super(nome, cpf, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInfos(){
        System.out.println("Informações do Arquiteto");
        super.mostrarInfos();
        System.out.println("Especialidade: "+especialidade);

    }
    public void mostrarNomeCpf(){
        System.out.println("Nome" + nome);//protecded
        System.out.println("Cpf:" + this.getCpf());//private
    }

    @Override
    public double calcularSalarioAnual(){
        if(especialidade.equalsIgnoreCase("Design"))
            return (12*salario)+1500;
        else return (12*salario);
    }
}
