import br.inatel.prova3.treino.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
            System.out.println("1-Cadastrar novo veículo ");
            System.out.println("2-mostrar veículos cadastrados ");
            System.out.println("3- Mostrar quantidade de veiculos de cada marca");

            int opcao;
            opcao = entradaDeDados.nextInt();
            entradaDeDados.nextLine();
            ArrayList<Veiculo> veiculos = arq.ler();

            switch (opcao){
                case 1:
                    try {
                        System.out.println("Entre com a marca do carro:");
                        veiculo.setMarca(entradaDeDados.nextLine());

                        if (!veiculo.getMarca().equalsIgnoreCase("Rolls-Royce") && !veiculo.getMarca().equalsIgnoreCase("Bentley")){
                            throw new ValorInvalidoException("Marca invalida, aceitamos somente Rolls-Royce e Bentley ");
                        }
                    }catch (Exception e){
                        break;
                    };

                    System.out.println("Entre com a modelo do carro:");
                    veiculo.setModelo(entradaDeDados.nextLine());

                    try {
                        System.out.println("Entre com o ano do carro:");
                        veiculo.setAno(entradaDeDados.nextInt());
                        entradaDeDados.nextLine();
                        if (veiculo.getAno() < 1960 || veiculo.getAno()>2024){
                            throw new ValorInvalidoException("O carro tem que ser fabricado entre 1960 e 2024");
                        }
                    }catch (Exception e){
                        break;
                    };

                    try {
                        System.out.println("Entre com a quatindade de kms rodados");
                        veiculo.setKmsRodados(entradaDeDados.nextDouble());
                        entradaDeDados.nextLine();
                        if (veiculo.getKmsRodados() <= 0 ){
                            throw new ValorInvalidoException("O veiculo não pode ter 0 quilometros rodados");
                        }
                    }catch (Exception e){
                        break;
                    };

                    try {
                        System.out.println("Entre com o numero de cilindros do carro:");
                        veiculo.getMotor().setNumCilindros(entradaDeDados.nextInt());
                        entradaDeDados.nextLine();
                        if (veiculo.getMotor().getNumCilindros() <= 0){
                            throw new ValorInvalidoException("o veiculo deve possuir pelo menos 1 cilindro");
                        }
                    }catch (Exception e){
                        break;
                    };

                    try {
                        System.out.println("Entre com a potencia do motor do carro:");
                        veiculo.getMotor().setPotencia(entradaDeDados.nextDouble());
                        entradaDeDados.nextLine();
                        if (veiculo.getMotor().getPotencia() <= 0){
                            throw new ValorInvalidoException("O veiculo deve conter pelo menos 1 de potencia");
                        }
                    }catch (Exception e){
                        break;
                    };
                    arq.escrever(veiculo);
                    break;
                case 2:
                    System.out.println("Veiculos disponiveis e suas informações");
                    for (int i = 0; i <veiculos.size(); i++) {
                        System.out.println("Marca: "+veiculos.get(i).getMarca());
                        System.out.println("Modelo: "+veiculos.get(i).getModelo());
                        System.out.println("Ano: "+veiculos.get(i).getAno());
                        System.out.println("kms rodados: "+veiculos.get(i).getKmsRodados());
                        System.out.println("Cilindros: "+veiculos.get(i).getMotor().getNumCilindros());
                        System.out.println("potencia do motor: "+veiculos.get(i).getMotor().getPotencia());
                    }

                    break;
                case 3:
                    // Ordenando em ordem decrescente
                    Collections.reverse(veiculos);
                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("Marca: "+veiculos.get(i).getMarca());
                        System.out.println("Modelo: "+veiculos.get(i).getModelo());
                        System.out.println("Ano: "+veiculos.get(i).getAno());
                        System.out.println("kms rodados: "+veiculos.get(i).getKmsRodados());
                        System.out.println("Cilindros: "+veiculos.get(i).getMotor().getNumCilindros());
                        System.out.println("potencia do motor: "+veiculos.get(i).getMotor().getPotencia());
                    }
                    break;
                default:
                    break;
            }

        }


    }





}
