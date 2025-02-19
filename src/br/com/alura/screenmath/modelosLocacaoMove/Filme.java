package br.com.alura.screenmath.modelosLocacaoMove;



public class Filme {

    private String name;
    private int anoDeLacamento;
    private int totalNota;
    private double duracaoEmMinutos;
    private double somaNota;
    private boolean incluidoNoPlano;


    public void setName(String name) {
        this.name = name;
    }

    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento = anoDeLacamento;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalNota(){
      return totalNota;
    }

    public int getAnoDeLacamento() {
        return anoDeLacamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void descricao(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + anoDeLacamento);
        System.out.println("Duração: " + duracaoEmMinutos);
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
