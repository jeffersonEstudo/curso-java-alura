package br.com.alura.screenmath.modelosLocacaoMove;

public class Serie {
private  int temporadas;
private int episodiosPorProgramas;
private int minutosPorEpisodio;
private boolean ativa;


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorProgramas() {
        return episodiosPorProgramas;
    }

    public void setEpisodiosPorProgramas(int episodiosPorProgramas) {
        this.episodiosPorProgramas = episodiosPorProgramas;
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
}
