package br.com.alura.PraticandoCurso2modulo4Interface;

public class ProdutoFisico implements Calculavel{
    protected int quantidadeProduto;
    protected double valor;

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getcalcularPrecoFinal() {
        return quantidadeProduto * valor;
    }
}
