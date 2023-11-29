import br.inatel.exercicio.Exceptions.ValoresInvalidosExceptions;
import br.inatel.exercicio.np2.Fetin;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Fetin gerenciador = new Fetin();

        // Adicionar projetos e notas ao mapa

        try {
            gerenciador.adicionarProjeto("projeto Homem a Lua",10.8);
            gerenciador.adicionarProjeto("teste",7.8);
            gerenciador.adicionarProjeto("teste",9.8);
            gerenciador.adicionarProjeto("projeto Homem a Lua",10.8);


        } catch (ValoresInvalidosExceptions e) {
            System.out.println(e.getMessage());
        }


        // Obter todos os projetos e suas notas

        Map<String, Double> todosProjetos = gerenciador.obterTodosProjetos();
        System.out.println("Todos os projetos e suas notas:");
        for (Map.Entry<String, Double> projeto : todosProjetos.entrySet()) {
            System.out.println(projeto.getKey() + " - Nota: " + projeto.getValue());
        }


    }
}
