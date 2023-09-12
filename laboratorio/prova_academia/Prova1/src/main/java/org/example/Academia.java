package org.example;

public class Academia {

    String nome;
    String numTelefone;
    Equipamento[] equipamento = new Equipamento[40];


    void mostrarInfos(){
        int cont = 0;//variavel implicita para contar qtd de equipamentos no array equipamento
        System.out.println("Nome da Academia:" + nome);
        System.out.println("telefone da Academia " + nome + "é: " + numTelefone);

        for (int i = 0; i < equipamento.length ; i++) {
            equipamento[i].mostrarInfos();
            if (equipamento[i] != null){
                cont++;
            }
        }
        System.out.println("Quantidade de equipamentos na academia: "+cont );

    }

    void cadastrarEquipamentos(Equipamento e){
        for (int i = 0; i < equipamento.length; i++) {
            if (equipamento[i] == null){
                equipamento[i]=e;
                break;
            }
        }
    }

    void infosEquipamentosManutencao(){
        int cont = 0;//variavel implicita para contar qtd de equipamentos no array equipamento
        int qtdManutencao = 0;//variavel auxiliar
        float porcentagem;
        for (int i = 0; i < equipamento.length; i++) {
            if(equipamento[i] != null){
                if(equipamento[i].status.equalsIgnoreCase("Manutencao")){
                    qtdManutencao++;

                }
            }

        }
        for (int i = 0; i < equipamento.length; i++) {
            if (equipamento[i] != null){
                cont++;

            }
        }
        porcentagem = (qtdManutencao / cont) * 100;

        System.out.println("Quantidade de equipamentos: " + cont);
        System.out.println("Porcentagem dos que estão em manutenção:" + porcentagem);



    }

    void mostrarMaisCaroMaisBarato(){
        double maisCaro= -9999;
        double maisBarato = 1000000;
        for (int i = 0; i < equipamento.length ; i++) {

            if (equipamento[i] != null){
                if (equipamento[i].valorAquisicao > maisCaro){
                    maisCaro = equipamento[i].valorAquisicao;

                }
                if (equipamento[i].valorAquisicao < maisBarato) {
                    maisBarato = equipamento[i].valorAquisicao;

                }

            }

        }

        System.out.println("Equipamento mais Barato:" + maisBarato);
        System.out.println("Equipamento mais Caro:" + maisCaro);
    }

}
