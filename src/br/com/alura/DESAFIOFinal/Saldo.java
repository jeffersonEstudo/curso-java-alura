package br.com.alura.DESAFIOFinal;

public class Saldo {
    private double saldo;
    private String produto;
    private double valorCompra;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "*****************" + "\n" +
                "Saldo: " + getSaldo() +
               "\n" + "*****************";
    }
}
