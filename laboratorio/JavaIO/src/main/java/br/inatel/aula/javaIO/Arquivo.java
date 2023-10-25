package br.inatel.aula.javaIO;
//pacotes do java IO
import br.inatel.aula.javaIO.Model.Funcionario;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    //métodos
    //Escrita
    public void escrever(Funcionario func) throws IOException {
        OutputStream os = null;
        BufferedWriter bw = null;
        OutputStreamWriter osw = null;

        try {
            //estruturas básicas para escrita em um arquivo
            os = new FileOutputStream("Funcionarios.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            //escrevendo as informaçãos do funcionário
            bw.write("+++ Funcionario +++");
            bw.newLine();
            bw.write(func.getNome()+ "\n");
            bw.write(func.getCargo()+ "\n");
            bw.write(func.getIdade()+ "\n");

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
    public ArrayList<Funcionario> ler(){
        //Coleção que armazena todos os funcionáiros encontrados no meu arquivo
        ArrayList<Funcionario> funcionariosEncontradosNoArquivo = new ArrayList<>();

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
                if(auxiliarLeitura.equalsIgnoreCase("+++ Funcionario +++")){
                    //estrutura para tratas as infos do funcionário no Java
                    Funcionario auxFuncionario = new Funcionario();
                    auxFuncionario.setNome(br.readLine());
                    auxFuncionario.setCargo(br.readLine());
                    auxFuncionario.setIdade(Integer.parseInt(br.readLine()));

                    //adicionando o funcinario no array
                    funcionariosEncontradosNoArquivo.add(auxFuncionario);


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

        return funcionariosEncontradosNoArquivo;

    }
}
