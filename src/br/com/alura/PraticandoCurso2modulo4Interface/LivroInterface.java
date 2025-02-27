package br.com.alura.PraticandoCurso2modulo4Interface;

public class LivroInterface implements Calculavel{
    protected int quantidadeLivro;
    protected double valor;
    protected boolean digital;


    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(int quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }


    @Override
    public double getcalcularPrecoFinal() {
        if (digital) {
            return quantidadeLivro * valor - ((quantidadeLivro * valor) * 0.3) ;
        }
        return quantidadeLivro * valor;
    }
}
