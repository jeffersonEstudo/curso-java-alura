package LocaçãoMove;

import br.com.alura.screenmath.modelosLocacaoMove.Filme;
import br.com.alura.screenmath.modelosLocacaoMove.Serie;

public class AplicationPrincipal {
    public static void main(String[] args){
//      Filme objetoDaClasseFilme = new Filme();
//      objetoDaClasseFilme.setName("O poderoso chefão"); ;
//      objetoDaClasseFilme.setAnoDeLacamento(1979);
//      objetoDaClasseFilme.setDuracaoEmMinutos(180);
//
//
//      objetoDaClasseFilme.avaliacao(8);
//      objetoDaClasseFilme.avaliacao(5);
//      objetoDaClasseFilme.avaliacao(10);
//
//      objetoDaClasseFilme.exibeFichaTecnica();
//
//        //Antes de adicionar o private no atributo totalNota funcionava:
//        //System.out.println("Notas totais: " + objetoDaClasseFilme.totalNota);
//        //Agora com o private só funciona depois que adicionei o atributo em um (int e depois get) get:
//        if (objetoDaClasseFilme.getTotalNota()>1) {
//            System.out.println("Notas totais: " + objetoDaClasseFilme.getTotalNota());
//        }else {System.out.println("Nota total: " + objetoDaClasseFilme.getTotalNota());
//        }
//
        Serie objetoSerieLost = new Serie();

        objetoSerieLost.setName("Lost");
        objetoSerieLost.setAnoDeLacamento(2003);
        objetoSerieLost.exibeFichaTecnica();
        objetoSerieLost.setTemporadas(10);
        objetoSerieLost.setEpisodiosPorTemporada(10);
        objetoSerieLost.setMinutosPorEpisodio(50);
        System.out.println("Duração total da Série: " + objetoSerieLost.getDuracaoEmMinutos() );

    }
}
