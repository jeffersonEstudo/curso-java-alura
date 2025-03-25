package br.com.alura.PraticandoCursoTresModulo3.Entities;

public class Quadrado implements Forma{
private double base;
private double altura;


    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getNumero() {
        return base;
    }

    public void setNumero(double numero) {
        this.base = numero;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "" + base;
    }
}
