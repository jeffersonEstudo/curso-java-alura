package br.com.alura.PraticandoCurso2modulo4Interface;

public class ResultadoCalculo {

    public void mostra(CalculoGeometrico calculoGeometrico){

        System.out.println("Área do retângulo: " + calculoGeometrico.getcalcularArea());
        System.out.println("Perímetro do retângulo: " + calculoGeometrico.getcalcularPerimetro());
    }

}
