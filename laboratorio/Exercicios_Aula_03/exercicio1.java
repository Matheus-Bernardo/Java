
/*
Código feito por Matheus H. L. Bernardo
Engenharia de Software
Matricula 75

 */



package org.example;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        char opcao;
        int num1;
        int num2;
        int resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha a operação desejada de acordo com o Menu abaixo: ");
        System.out.println("1- Soma, 2- Subtração , 3-Multiplicação, 4-Exponencial");
        opcao = teclado.next().charAt(0);

        switch (opcao) {
            case '1':
                System.out.println("Entre com dois numeros para a soma:");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
                resultado = num1 + num2;
                System.out.println("O resultado é " + resultado);
                break;
            case '2':
                System.out.println("Entre com dois numeros para a subtração:");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
                resultado = num1 - num2;
                System.out.println("O resultado é " + resultado);
                break;
            case '3':
                System.out.println("Entre com dois numeros para a multiplicação:");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
                resultado = num1 * num2;
                System.out.println("O resultado é " + resultado);
                break;
            case '4':
                System.out.println("Entre com a base e o expoente :");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
                if (num2 == 0) {
                    System.out.println("O resultado é 1");
                }
                if (num2 > 0) {
                    resultado = num1;
                    for (int i = 1; i < num2; i++) {

                        resultado = resultado * num1;
                    }
                    System.out.println("O resultado é " + resultado);
                }
                if (num2 < 0) {
                    resultado = num1;
                    if (num2 % 2 == 0) {
                        for (int i = num2; i < -1; i++) {
                            resultado = resultado * num1;
                        }
                        System.out.println("O resultado é " + resultado);

                    }
                    if (num2 % 2 != 0) {
                        resultado = num1;
                        for (int i = num2; i < -1; i++) {
                            resultado = resultado * num1;
                        }
                        System.out.println("O resultado é -" + resultado);

                    }
                }

                break;
            default:
                System.out.println("Revise a opção");
                break;


        }
    }
}
