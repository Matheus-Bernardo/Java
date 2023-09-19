package br.inatel.predio6.aulaHeranca;

public class Funcionario {

    protected String nome;
    private String cpf;
    public int idade;
    public double salario;

    //construtor


    public Funcionario(String nome, String cpf, int idade, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public void tirarFerias(){
        System.out.println("O funcionario "+this.nome +" tirou ferias");
    }
    public double calcularSalarioAnual(){
        return this.salario = salario*12;

    }

    public void mostrarInfos(){
        System.out.println("nome:" +this.nome);
        System.out.println("Idade: " + this.idade );
        System.out.println("Salário: " + this.salario );
        System.out.println("CPF: " + this.cpf );

    }

    public String getCpf() {
        return cpf;
    }

}
