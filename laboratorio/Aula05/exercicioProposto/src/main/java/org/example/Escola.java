package org.example;

public class Escola {
    //atributos explicitos

    String nome;
    String email;
    int numTelefone;
    String endereco;

    //atritubo implicito da escola
    Estudante[] estudantes = new Estudante[310];


    //métodos
    void addEstudante(Estudante e){
        for (int i = 0; i < estudantes.length; i++) {//percorrendo array
            if (estudantes[i]== null)//verificando se a posição i está vazia
                estudantes[i]=e;//adicionando estudante na posição i
             break;
        }
    }
    void mostrarInfos(){
        System.out.println("INFORMAÇÕES DA ESCOLA");
        System.out.println("Nome" + nome);
        System.out.println("Email" + email);
        System.out.println("Telefone" + numTelefone);
        System.out.println("Endereço" + endereco);

        //percorrendo array
        for (int i = 0; i < estudantes.length ; i++) {
            //verifica se ta preenchido
            if (estudantes[i]!=null){
                estudantes[i].mostrarInfos();
            }
        }
    }

    void qtdAlunosPorAno(){
        int alunosPrimeiro = 0;
        int alunosSegundo = 0;
        int alunosTerceiro = 0;

        for (int i = 0; i < estudantes.length; i++) {
            //verifica se está preenchido
            if (estudantes[i] != null){
                if (estudantes[i].anoLetivo.equalsIgnoreCase("Primeiro"))
                    alunosPrimeiro++;
                else if (estudantes[i].anoLetivo.equalsIgnoreCase("segundo")) {
                    alunosSegundo++;

                }else alunosTerceiro++;
            }
        }
        System.out.println("Alunos por Ano");
        System.out.println("Alunos do Primeiro ano: "+alunosPrimeiro);
        System.out.println("Alunos do Segundo ano: "+alunosSegundo);
        System.out.println("Alunos do terceiro ano: "+alunosTerceiro);
    }

}
