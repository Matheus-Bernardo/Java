import br.inatel.prova3.treino.AnoVeiculoException;
import br.inatel.prova3.treino.Arquivo;
import br.inatel.prova3.treino.Veiculo;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //entrada de dados
        Scanner entradaDeDados = new Scanner(System.in);

        //objeto de arquivo
        Arquivo arq = new Arquivo();

        //objeto de veiculo
        Veiculo veiculo = new Veiculo();

        boolean controle = true;

        while (controle == true){

            System.out.println("Bem vindo a concessionária");
            System.out.println("1-Cadastrar novo veículo: ");

            int opcao;
            opcao = entradaDeDados.nextInt();
            entradaDeDados.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Entre com a marca do carro:");
                    veiculo.setMarca(entradaDeDados.nextLine());

                    System.out.println("Entre com a modelo do carro:");
                    veiculo.setModelo(entradaDeDados.nextLine());

                    try {
                        System.out.println("Entre com o ano do carro:");
                        veiculo.setAno(entradaDeDados.nextInt());
                        entradaDeDados.nextLine();
                        if (veiculo.getAno() < 1960 || veiculo.getAno()>2024){
                            throw new AnoVeiculoException();
                        }
                    }catch (Exception e){
                        break;
                    };

                    try {
                        System.out.println("Entre com a quatindade de kms rodados");
                        veiculo.setKmsRodados(entradaDeDados.nextDouble());
                        entradaDeDados.nextLine();
                        if (veiculo.getKmsRodados() <= 0 ){
                            throw new AnoVeiculoException();
                        }
                    }catch (Exception e){
                        break;
                    };

                    arq.escrever(veiculo);
                    break;

                default:
                    break;
            }

        }


    }





}
