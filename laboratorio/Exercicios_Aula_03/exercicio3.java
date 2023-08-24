
/*
Código feito por Matheus H. L. Bernardo
Engenharia de Software
Matricula 75

 */

package org.example;

import java.util.Scanner;

public class exercicio3 {
    public static final float VALOR_GASOLINA = 6.0F;
    public static final float VALOR_ALCOOL = 4.90F;


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de litros desejados: ");
        int litros = entrada.nextInt();
        char tipoCombustivel;
        float valorAjuste;
        float valorSemDesconto;

        if (litros > 20) {
            System.out.println("Informe o tipo de combustível, G para gasolina ou A para álcool?");
            tipoCombustivel = entrada.next().charAt(0);

            switch (tipoCombustivel) {
                case 'A':
                    valorSemDesconto = (litros * VALOR_ALCOOL);
                    valorAjuste = valorSemDesconto - ((valorSemDesconto * 5) / 100);
                    System.out.println("O valor a pagar é " + valorAjuste);
                    break;
                case 'G':
                    valorSemDesconto = (litros * VALOR_GASOLINA);
                    valorAjuste = valorSemDesconto - ((valorSemDesconto * 6) / 100);
                    System.out.println("O valor a pagar é " + valorAjuste);
                    break;
                default:
                    System.out.println("Opção incorreta!");
                    break;

            }


        } else if (litros<=20) {
            System.out.println("Informe o tipo de combustível, G para gasolina ou A para álcool?");
            tipoCombustivel = entrada.next().charAt(0);

            switch (tipoCombustivel) {
                case 'A':
                    valorSemDesconto = (litros * VALOR_ALCOOL);
                    valorAjuste = valorSemDesconto - ((valorSemDesconto * 3) / 100);
                    System.out.println("O valor a pagar é " + valorAjuste);
                    break;
                case 'G':
                    valorSemDesconto = (litros * VALOR_GASOLINA);
                    valorAjuste = valorSemDesconto - ((valorSemDesconto * 4) / 100);
                    System.out.println("O valor a pagar é " + valorAjuste);
                    break;
                default:
                    System.out.println("Opção incorreta!");
                    break;

            }
        }


    }
}
