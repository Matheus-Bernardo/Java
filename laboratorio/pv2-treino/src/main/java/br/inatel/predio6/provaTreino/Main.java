package br.inatel.predio6.provaTreino;

public class Main {

    public static void main(String[] args) {

        Personagem[] personagensAux = new Personagem[2];


        //instanciando uma nova cidade
        Cidade cidade = new Cidade();
        //acrescentando nome para a nova cidade
        cidade.setNome("Santa Rita");

        //criando 2 persongagens especializados


        //criando personagem do tipo Humano
        Humano humano = new Humano();
        humano.setNome("Matheus");
        humano.setIdade(21);
        humano.setEnergia(100);
        humano.setVida(100);
        humano.setDistanciaEscuta(33);
        humano.setVagalume(false);
        //criando arma para o humano
        Arma arma = new Arma();
        arma.setTipoArma("Fuzil");
        arma.setForca(200);
        humano.setArma(arma);

        //Criando personagem do tipo zumbi
        Zumbi zumbi = new Zumbi();
        zumbi.setVida(200);
        zumbi.setDiasInfeccao(19);

        //inicializando os personagens com null
        for (int i = 0; i <personagensAux.length ; i++) {
            personagensAux[i] = null;
        }

        //ocupando array de personagens
        personagensAux[0] = humano;
        personagensAux[1]=zumbi;

        //passando array de persongaens para vetor dentro da cidade
        cidade.setPersonagens(personagensAux);
        //mostrando informações
        for (int i = 0; i < personagensAux.length; i++) {

            //verifica se a posição está preenchida
            if(personagensAux[i] != null){
                //verifica se é do tipo humano
                if(personagensAux[i] instanceof Humano){

                    //cria uma variavel auxiliar
                    Humano auxHumano = (Humano) personagensAux[i];
                    auxHumano.mostrarInfos();
                    auxHumano.modificarArma();
                    auxHumano.modificarHabilidade(10,"energia");

                } else if (personagensAux[i] instanceof Zumbi) {
                    Zumbi auxZumbi = (Zumbi) personagensAux[i];
                    auxZumbi.mostrarInfos();

                }
            }


        }












    }
}
