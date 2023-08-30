package org.example;

public class Funcionario {
    //atributos
    String nome;
    String cpf;
    double salario;

    //ações - métodos - funções
    void mostrarInfos(){
        System.out.println("Nome:" + nome);
        System.out.println("Cpf:" + cpf);
        System.out.println("Salário:" + salario);
    }
}
