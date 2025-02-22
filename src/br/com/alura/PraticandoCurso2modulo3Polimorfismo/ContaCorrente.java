package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class ContaCorrente {

    protected double descontaContaCorrente;
    protected boolean valorDeMesesACobrar;
    protected int mesesRestantes;
    protected int mesAtual;
    protected int mesesTotais;



    public boolean isValorDeMesesACobrar() {
        return valorDeMesesACobrar;
    }

    public void setValorDeMesesACobrar(boolean valorDeMesesACobrar) {
        this.valorDeMesesACobrar = valorDeMesesACobrar;
    }

    public double getDescontaContaCorrente() {
        return descontaContaCorrente;
    }

    public void setDescontaContaCorrente(double descontaContaCorrente) {
        this.descontaContaCorrente = descontaContaCorrente;
    }
//Baseando na "calculadora de Tempo" metodo "inclui"
    public void desconta(ContaBancaria c){
        System.out.println(c.getSaldo());
        this.descontaContaCorrente -= c.getSaldo();
//        while(valorDeMesesACobrar) {
//             descontaContaCorrente -= c.getSaldo();
//            System.out.println("Foi descontado: " + descontaContaCorrente + " da seu saldo. Saldo atual: " + c.getSaldo());
//            System.out.println("Meses totais: " + mesesTotais);
//            mesesTotais++;
//        }
        descontaContaCorrente -= c.getSaldo();
        System.out.println("Foi descontado: " + descontaContaCorrente + " do seu saldo. Saldo atual: " + c.getSaldo());

    }

}
