package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class ContaCorrente {

    protected double descontaContaCorrente;
    protected boolean cobrancaAtiva;
    protected double saldoAtualizado;



    public boolean isCobrancaAtiva() {
        return cobrancaAtiva;
    }

    public void setCobrancaAtiva(boolean cobrancaAtiva) {
        this.cobrancaAtiva = cobrancaAtiva;
    }

    public double getDescontaContaCorrente() {
        return descontaContaCorrente;
    }

    public void setDescontaContaCorrente(double descontaContaCorrente) {
        this.descontaContaCorrente = descontaContaCorrente;
    }
//Baseando na "calculadora de Tempo" metodo "inclui"
    public void desconta(ContaBancaria c){
        System.out.println("Foi descontado: " + descontaContaCorrente + " do seu saldo. Saldo atual: " + (c.getSaldo() - descontaContaCorrente));
        this.saldoAtualizado = (c.getSaldo() - descontaContaCorrente);

    }

}
