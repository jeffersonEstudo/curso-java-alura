package br.com.alura.PraticandoCursoTresModulo3.Entities;

public class Produto {
    private String nome;
    private double preco;


    public Produto(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {

        return "" + preco ;
    }
}
