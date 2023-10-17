package br.inatel.predio6.aula;

import java.sql.SQLOutput;

public class SemSaldoException extends Exception{


    public SemSaldoException(String mensagem, float valorSaque) {
        System.out.println("Sem saldo na conta");
    }
}
