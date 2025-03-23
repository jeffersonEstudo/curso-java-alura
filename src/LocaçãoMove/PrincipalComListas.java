package LocaçãoMove;

import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Filme;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Serie;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme objetoDaClasseFilme = new Filme("O poderoso chefão",1979);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        Filme outroObjtFilme = new Filme("Outro filme",2025 );
        Serie objetoSerieLost = new Serie("Lost",2003 );

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoPaulo);
        lista.add(objetoDaClasseFilme);
        lista.add(outroObjtFilme);
        lista.add(objetoSerieLost);

        for (Titulo item: lista){
            System.out.println(item.getName());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());
        }
    }
}
