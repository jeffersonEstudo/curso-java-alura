package br.com.alura.PraticandoCurso2modulo4Interface;

public class TotalMultiplica extends TabuadaMultiplicação{

    public void mostra(Tabuada tabuada){

        System.out.println("Tabuada de " + tabuada.getmostrarTabuada());

        for (int i = 0 ; i < tabuada.getmostrarTabuada() ; i++){
            int total = tabuada.getmostrarTabuada() * i;

            System.out.println( tabuada.getmostrarTabuada() + " * " + i + " = " + total);

        }

    }
}
