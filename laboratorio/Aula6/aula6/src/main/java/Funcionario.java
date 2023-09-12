public class Funcionario {

    //atributos da classe
    private static int cont = 0;
    //atributos do objeto
    public int id;
    public String nome;
    private String cpf;


    public Funcionario(String nome) {
        //incrementar contador
        cont++;
        //atribui o valor ao id
        id = cont;

        this.nome = nome;
    }

    public void mostrarInfos(){
        System.out.println("nome: "+nome);
        System.out.println("id:"+id);
        System.out.println("cpf:" +cpf);
    }

    //encapsulamento - modificadores de acesso

    public static int getCont() {
        return cont;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
