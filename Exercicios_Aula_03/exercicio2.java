
/*
Código feito por Matheus H. L. Bernardo
Engenharia de Software
Matricula 75

 */



package org.example;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a Np1 e Np2:");

        float np1 = entrada.nextFloat();
        float np2 = entrada.nextFloat();
        float media = (np1+np2)/2;
        int resultado = (int)media;

        System.out.println("Média Final: "+resultado);

    }
}
