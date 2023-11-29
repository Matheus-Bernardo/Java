package br.inatel.exercicio.np2;

import br.inatel.exercicio.Exceptions.ValoresInvalidosExceptions;

import java.util.HashMap;
import java.util.Map;

public class Fetin {
    private Map<String, Double> projetos;

    public Fetin() {
        this.projetos = new HashMap<>();
    }

    // Adicionar um projeto com sua nota ao mapa
    public boolean adicionarProjeto(String nomeProjeto, double nota) throws ValoresInvalidosExceptions {
        if (projetos.containsKey(nomeProjeto)) {
            System.out.println("Projeto já existente.");
            return false;
        } else if (nota < 6) {
            System.out.println("Com essa nota o projeto está reprovado e não foi acrescentado no Map.");
            return false;
        } else {
            projetos.put(nomeProjeto, nota);
            return true;
        }
    }

    // Obter a nota de um projeto específico
    public Double obterNotaDoProjeto(String nomeProjeto) {
        return projetos.get(nomeProjeto);
    }

    // Obter todos os projetos e suas notas
    public Map<String, Double> obterTodosProjetos() {
        return projetos;
    }

}
