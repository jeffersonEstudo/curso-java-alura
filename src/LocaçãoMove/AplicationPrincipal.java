package LocaçãoMove;

import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Episodio;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Filme;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Serie;
import br.com.alura.screenmath.modelosLocacaoMove.calculos.CalculadoraDeTempo;
import br.com.alura.screenmath.modelosLocacaoMove.calculos.FiltroRecomendacao;

public class AplicationPrincipal {
    public static void main(String[] args){
      Filme objetoDaClasseFilme = new Filme();
      objetoDaClasseFilme.setName("O poderoso chefão"); ;
      objetoDaClasseFilme.setAnoDeLacamento(1979);
      objetoDaClasseFilme.setDuracaoEmMinutos(180);


      objetoDaClasseFilme.avaliacao(8);
      objetoDaClasseFilme.avaliacao(5);
      objetoDaClasseFilme.avaliacao(10);

      objetoDaClasseFilme.exibeFichaTecnica();

        //Antes de adicionar o private no atributo totalNota funcionava:
        //System.out.println("Notas totais: " + objetoDaClasseFilme.totalNota);
        //Agora com o private só funciona depois que adicionei o atributo em um (int e depois get) get:
        if (objetoDaClasseFilme.getTotalNota()>1) {

            System.out.println("Notas totais: " + objetoDaClasseFilme.getTotalNota());

        }else {
            System.out.println("Nota total: " + objetoDaClasseFilme.getTotalNota());
        }

        System.out.println();

        Serie objetoSerieLost = new Serie();

        objetoSerieLost.setName("Lost");
        objetoSerieLost.setAnoDeLacamento(2003);
        objetoSerieLost.setTemporadas(10);
        objetoSerieLost.setEpisodiosPorTemporada(10);
        objetoSerieLost.setMinutosPorEpisodio(50);
        objetoSerieLost.exibeFichaTecnica();
        System.out.println("Duração total da Série: " + objetoSerieLost.getDuracaoEmMinutos() + " min" );


        CalculadoraDeTempo objetoCalculadora = new CalculadoraDeTempo();


        objetoCalculadora.inclui(objetoDaClasseFilme);
        objetoCalculadora.inclui(objetoSerieLost);
        System.out.println(objetoCalculadora.getTempoTotal());


      FiltroRecomendacao filtro = new FiltroRecomendacao();
      filtro.filtra(objetoDaClasseFilme);


      Episodio episodio = new Episodio();
      episodio.setNumero(1);
      episodio.setSerie(objetoSerieLost);
      episodio.setTotalVisualizacoes(300);

      filtro.filtra(episodio);

    }
}
