package br.com.alura.DESAFIOFinal.Entities;

public class Saldo {
    private double saldo;
    private String produto;
    private double valorCompra;


    public Saldo(double saldo, String produto, double valorCompra) {
        this.saldo = saldo;
        this.produto = produto;
        this.valorCompra = valorCompra;
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
                "Produto: " + getProduto() +"\n"+
                "Valor: " + getValorCompra() +"\n"+
                 "Saldo atual: " + (getSaldo() - getValorCompra()) +
               "\n" + "*****************";
    }
}
