package br.com.alura.PraticandoCurso2modulo4Interface;

public class MostraConversao {


    public void mostra(ConversorTemperatura conversorTemperatura){

        System.out.println("Celsius para Fahrenheit: " + conversorTemperatura.getcelsiusParaFahrenheit());
        System.out.println("Fahrenheit para Celsius: " + conversorTemperatura.getfahrenheitParaCelsius());

    }
}
