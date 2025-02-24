package br.com.alura.screenmath.modelosLocacaoMove.calculos;

import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Titulo;

public class CalculadoraDeTempo {
 private int tempoTotal;


    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){

        this.tempoTotal += t.getDuracaoEmMinutos() ;
    }
}
