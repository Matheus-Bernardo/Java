package org.example;
public class Main {
    public static void main(String[] args) {
        //Array de primitivos - declarações
        int [] idades ={1,2,3,4,5};
        char[] iniciaisDoNome = new char[10];
        float [] salario ;
        double [] valores ;

        //mostrando os valores dos arrays
        for (int i = 0; i < idades.length ; i++) {
            System.out.println(idades[i]);
        }

        //array de referencias
        Funcionario funcionario1 = new Funcionario();//instanciou o objeto
        funcionario1.nome = "matheus";
        funcionario1.cpf = "123.345.876-81";
        funcionario1.salario = 1250.0;
        Funcionario[] arrayDeFuncionarios = new Funcionario[10]; //array de referência

        //adionando no array
        arrayDeFuncionarios[1] = funcionario1;
        for (int i = 0; i < arrayDeFuncionarios.length ; i++) {
            if (arrayDeFuncionarios[i]==null)
                arrayDeFuncionarios[i] = funcionario1;
        }

        //imprimindo os valores dos arrays de funcionario
        for (int i = 0; i < arrayDeFuncionarios.length ; i++) {
            //controle de fluxo para só mostras valores diferentes de null
            if (arrayDeFuncionarios[i] != null)
                arrayDeFuncionarios[i].mostrarInfos();
        }




    }
}