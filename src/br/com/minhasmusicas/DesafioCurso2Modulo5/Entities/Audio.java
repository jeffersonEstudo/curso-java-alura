package br.com.minhasmusicas.DesafioCurso2Modulo5.Entities;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private int curtida;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtida() {
        return curtida;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
     this.curtida ++;
    }

    public void reproduzir(){
        totalDeReproducao ++;
    }
}
