package br.inatel.predio6.aulaHeranca;

public class Main {
    public static void main(String[] args) {
        //Criando os objetos normalmente
       // Engenheiro eng = new Engenheiro("Matheus","13",21,2144.50,"tecnico");
        //Arquiteto arq = new Arquiteto("lucas","12",27,2684.50,"engenheiro");

        //criando os objetos upCasting
        Funcionario eng = new Engenheiro("Matheus","13",21,2144.50,"tecnico");
        Funcionario arq = new Arquiteto("lucas","12",27,2684.50,"engenheiro");

        arq.tirarFerias();
        double salarioArq = arq.calcularSalarioAnual();
        System.out.println(salarioArq);
        eng.tirarFerias();

    }
}
