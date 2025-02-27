package br.com.alura.PraticandoCurso2modulo4Interface;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
     protected double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    @Override
    public double getcelsiusParaFahrenheit() {
        return (numero * 9/5) + 32;
    }

    @Override
    public double getfahrenheitParaCelsius() {
       return (numero - 32) * 5/9;
    }
}
