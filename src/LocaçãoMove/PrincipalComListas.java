package LocaçãoMove;

import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Filme;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Serie;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {



        Filme objetoDaClasseFilme = new Filme("O poderoso chefão",1979);
        objetoDaClasseFilme.avaliacao(9);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avaliacao(3);
        Filme outroObjtFilme = new Filme("Outro filme",2025 );
        outroObjtFilme.avaliacao(5);
        Serie objetoSerieLost = new Serie("Lost",2003 );
        objetoSerieLost.avaliacao(4);

       List<Titulo> lista = new LinkedList<>();

        lista.add(filmeDoPaulo);
        lista.add(objetoDaClasseFilme);
        lista.add(outroObjtFilme);
        lista.add(objetoSerieLost);

        for (Titulo item: lista){
            System.out.println(item.getName());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
            System.out.println("Classificação: " + filme.getClassificacao());
              }
        }


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");


        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação.");
        System.out.println(buscaPorArtista);


        System.out.println("Com ordenação de título:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLacamento));
        System.out.println("Ordenando por ano:");
        System.out.println(lista);
    }
}
