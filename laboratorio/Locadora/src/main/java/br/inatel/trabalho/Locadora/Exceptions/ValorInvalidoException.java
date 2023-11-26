package br.inatel.trabalho.Locadora.Exceptions;

public class ValorInvalidoException extends Exception {

    public ValorInvalidoException(String msg) {
        System.out.println("Foi lançada uma Exceção.");
        System.out.println(msg);

    }
}