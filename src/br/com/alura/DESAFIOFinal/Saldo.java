package br.com.alura.DESAFIOFinal;

public class Saldo {
    private double saldo;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Saldo: " + getSaldo() ;
    }
}
