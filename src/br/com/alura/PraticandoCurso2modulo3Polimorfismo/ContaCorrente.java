package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class ContaCorrente {

    protected double descontaContaCorrente;
    protected boolean cobrancaAtiva;
    protected double saldoAtualizado;
    protected int mesesTotais;


    public int getMesesTotais() {
        return mesesTotais;
    }

    public void setMesesTotais(int mesesTotais) {
        this.mesesTotais = mesesTotais;
    }

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
        if (cobrancaAtiva == false){
            System.out.println("Foi descontado: " + descontaContaCorrente + " do seu saldo. Saldo atual: " + (c.getSaldo() - descontaContaCorrente));
        }else {
            for (int i = 0; i < mesesTotais; i++) {
                System.out.println("Foi descontado: " + descontaContaCorrente + " do seu saldo. Saldo atual: " + (c.getSaldo() - descontaContaCorrente));
                descontaContaCorrente += descontaContaCorrente;
            }
        }
        this.saldoAtualizado = (c.getSaldo() - descontaContaCorrente);

    }

}
