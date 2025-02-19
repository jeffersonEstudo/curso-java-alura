package PraticandoCurso2;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao ;
    int numAvaliacoes;
    double mediaAvaliacao;

    void mostra(){
        System.out.println("Total de Pontos de Avaliação: " + avaliacao +
                " Numero de avaliaçõe: " + numAvaliacoes +
                " Media de avaliação: " + mediaAvaliacao);
    }

    void avalia(int nota){
    avaliacao += nota;
    numAvaliacoes++;
    mediaAvaliacao = avaliacao/numAvaliacoes;
 }



}