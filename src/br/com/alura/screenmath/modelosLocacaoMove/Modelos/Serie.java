package br.com.alura.screenmath.modelosLocacaoMove.Modelos;

public class Serie extends Titulo{
private  int temporadas;
private int episodiosPorTemporada;
private int minutosPorEpisodio;
private boolean ativa;

    public Serie(String name, int anoDeLacamento) {
        super(name, anoDeLacamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public double getDuracaoEmMinutos() {

        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome da série: " + this.getName());
        System.out.println("Ano de lançamento: " + this.getAnoDeLacamento());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Minutos por episódio: " + getMinutosPorEpisodio());

    }

    @Override
    public String toString() {
        return "Série: " + this.getName() + " Ano de lançamento: " + this.getAnoDeLacamento();
    }
}
