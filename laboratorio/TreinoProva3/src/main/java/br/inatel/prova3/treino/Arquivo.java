package br.inatel.prova3.treino;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    //métodos
    //Escrita
    public void escrever(Veiculo veiculo) throws IOException {
        OutputStream os = null;
        BufferedWriter bw = null;
        OutputStreamWriter osw = null;

        try {
            //estruturas básicas para escrita em um arquivo
            os = new FileOutputStream("Veiculos.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            //escrevendo as informaçãos do funcionário
            bw.write("+++ Veiculo +++");
            bw.newLine();
            bw.write(veiculo.getMarca()+ "\n");
            bw.write(veiculo.getModelo()+ "\n");
            bw.write(veiculo.getAno()+ "\n");
            bw.write(veiculo.getKmsRodados()+ "\n");


        }catch (Exception e){

        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //2.Leitura
    public ArrayList<Veiculo> ler(){
        //Coleção que armazena todos os funcionáiros encontrados no meu arquivo
        ArrayList<Veiculo> veiculosEncontradosNoArquivo = new ArrayList<>();

        //estrutura para a leitura de dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxiliarLeitura;//ponteiro do arquivo

        try {
            //Estrutura básica para leitura do arquivo
            is = new FileInputStream("Funcionarios.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            //realizando a leitura
            auxiliarLeitura = br.readLine();
            while (auxiliarLeitura!= null){
                if(auxiliarLeitura.equalsIgnoreCase("+++ Veiculo +++")){
                    //estrutura para tratas as infos do funcionário no Java
                    Veiculo auxVeiculo = new Veiculo();
                    auxVeiculo.setMarca(br.readLine());
                    auxVeiculo.setModelo(br.readLine());
                    auxVeiculo.setAno(Integer.parseInt(br.readLine()));
                    auxVeiculo.setKmsRodados(Double.parseDouble(br.readLine()));

                    //adicionando o funcinario no array
                    veiculosEncontradosNoArquivo.add(auxVeiculo);

                }
                auxiliarLeitura = br.readLine();//pula para a proxima linha
            }

        }catch (Exception e){

        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return veiculosEncontradosNoArquivo;

    }
}