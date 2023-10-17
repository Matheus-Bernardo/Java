package br.inatel.predio6.aula.Modelos;

import br.inatel.predio6.aula.SemSaldoException;

public class Conta {

    private float saldo;
    private String nome;

    public Conta(float saldo,String nome) {
        this.saldo = saldo;
    }

    public void sacar(float valorSaque) throws SemSaldoException {
        try{
            if(valorSaque >  saldo){
                throw new SemSaldoException("Sem saldo na conta",valorSaque);

            }else {
                saldo = saldo - valorSaque;
                System.out.println("Valor após o saque:" + saldo);
            }
        }catch (SemSaldoException semSaldoException){
            System.out.println("");
        }





    }
}
