package LocaçãoMove;



public class Filme {
    String name;
    int ano;
    private int totalNota;
    double duracao;
    private double somaNota;

    int getTotalNota(){
      return totalNota;
    }

    void descricao(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Duração: " + duracao);
        System.out.println("Media nota: %.2f" + mediaNota() + " Notas totais: " + totalNota );

    }

    void avaliacao( double nota){
       somaNota += nota;
       totalNota++;
    }

    double mediaNota(){
        return somaNota / totalNota;

    }
}
