package br.com.alura.PraticandoCursoTresModulo2.Entities;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, int preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return"Nome: " + getNome() + " Preço: " + getPreco() + " Quantidade: " + getQuantidade() + " Validade: " + getDataValidade();
    }
}
