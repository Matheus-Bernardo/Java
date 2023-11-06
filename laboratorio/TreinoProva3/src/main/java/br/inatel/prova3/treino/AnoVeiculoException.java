package br.inatel.prova3.treino;

public class AnoVeiculoException extends Exception {

    public AnoVeiculoException() {
        System.out.println("Não é permitido cadastrar veiculos com um ano de lançamento <1960 e > 2024 e sua quilometragem não pode ser 0 ");

    }
}
