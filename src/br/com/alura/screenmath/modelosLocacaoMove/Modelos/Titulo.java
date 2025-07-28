package br.com.alura.screenmath.modelosLocacaoMove.Modelos;


import br.com.alura.screenmath.modelosLocacaoMove.Exception2.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String name;
    private int anoDeLacamento;
    private boolean incluidoNoPlano;
    private int totalNota;
    private double duracaoEmMinutos;
    private double somaNota;



    public Titulo(String name, int anoDeLacamento) {
        this.name = name;
        this.anoDeLacamento = anoDeLacamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {

        this.name = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4){
           throw new ErroDeConversaoDeAnoException("Erro na conversão de ano. " +
          "O ano possui mais de 4 (quatro) caracteres.");
     }
        this.anoDeLacamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

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

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + anoDeLacamento);
        System.out.println("Duração: " + duracaoEmMinutos);
        System.out.println("Media nota: " + mediaNota() + " Notas totais: " + totalNota );

    }

    public void avaliacao( double nota){
        somaNota += nota;
        totalNota++;
    }

    public double mediaNota(){
        return somaNota / totalNota;

    }

    @Override
    public int compareTo(Titulo outroTitulo) {

        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", AnoDeLacamento=" + anoDeLacamento +
                ", Duração: " + duracaoEmMinutos;
    }
}
