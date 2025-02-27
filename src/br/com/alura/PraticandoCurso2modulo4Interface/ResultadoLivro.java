package br.com.alura.PraticandoCurso2modulo4Interface;

import br.com.alura.PraticandoCurso2modulo3Polimorfismo.VerificadorPrimo;

public class ResultadoLivro extends LivroInterface {
    protected double livro;



    public void mostra(Calculavel calculavel){
        livro = calculavel.getcalcularPrecoFinal();
        System.out.println("Todo livro on-line tem desconto de 30%");

        System.out.println("Valor total do Livro: " + livro);


    }

}
