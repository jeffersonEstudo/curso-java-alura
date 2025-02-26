package br.com.alura.PraticandoCurso2modulo4Interface;

public class ConversorMoeda implements ConversorFinanceira{
    protected double valor;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getconverterDolarParaReal() {
        valor = valor * 5.78;
        System.out.println(valor);
        return valor;
    }
}
