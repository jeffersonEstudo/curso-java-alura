package StreamerMove;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(9);
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalDeAvaliacao);
    }
}
