package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class ContaBancaria {
    protected double consultarSaldo;
    protected double depositar;
    protected double sacar;

    public double getConsultarSaldo() {
        return consultarSaldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
}
