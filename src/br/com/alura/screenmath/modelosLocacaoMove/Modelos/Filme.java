package br.com.alura.screenmath.modelosLocacaoMove.Modelos;


import br.com.alura.screenmath.modelosLocacaoMove.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
  private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaNota() / 2;
    }
}
