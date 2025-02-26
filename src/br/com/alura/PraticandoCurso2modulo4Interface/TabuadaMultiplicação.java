package br.com.alura.PraticandoCurso2modulo4Interface;

public class TabuadaMultiplicação implements Tabuada{
    protected int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    @Override
    public int getmostrarTabuada() {

        return valor;
    }
}
