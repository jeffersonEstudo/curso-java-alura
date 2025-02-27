package br.com.alura.PraticandoCurso2modulo4Interface;

public class ResultadoProduto extends ResultadoLivro{

    public void mostra(Calculavel calculavel2){

        System.out.println("Valor total do produto: " + calculavel2.getcalcularPrecoFinal());


    }
}
