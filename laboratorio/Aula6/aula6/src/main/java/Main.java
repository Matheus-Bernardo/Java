import br.inatel.predio6.aula6.Teste;

public class Main {
    public static void main(String[] args) {
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        Teste t3 = new Teste();

        System.out.println("quantidade de objetos criados: " + Teste.cont);

        //criando objetos de funcionario
        Funcionario f1 = new Funcionario("Gabriel");
        f1.setCpf("111.111.111-81");

        Funcionario f2 = new Funcionario("Matheus");
        f2.mostrarInfos();
        f1.mostrarInfos();

        System.out.println("qtde funcionarios:" + Funcionario.getCont());

    }
}
