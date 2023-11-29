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
    public void adicionarProjeto(String nomeProjeto, double nota) throws ValoresInvalidosExceptions {

        if (projetos.containsKey(nomeProjeto) ) {
            throw  new ValoresInvalidosExceptions("Projeto ja existente.");
        }else if (nota<6){
            throw  new ValoresInvalidosExceptions("com essa nota o projeto está reprovado e nao foi acrescentado no Map.");
        }else {
            projetos.put(nomeProjeto, nota);
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
