package br.com.alura.screenmath.modelosLocacaoMove;



public class Filme {

    public String name;
    public int ano;
    private int totalNota;
    public double duracao;
    private double somaNota;

   public int getTotalNota(){
      return totalNota;
    }

    public void descricao(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Duração: " + duracao);
        System.out.println("Media nota: %.2f" + mediaNota() + " Notas totais: " + totalNota );

    }

    public void avaliacao( double nota){
       somaNota += nota;
       totalNota++;
    }

    public double mediaNota(){
        return somaNota / totalNota;

    }
}
