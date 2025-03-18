package br.com.alura.PraticandoCurso3ArrayList.Entities;

public class Pessoas {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome +
                ", idade=" + idade +
                '}';
    }
}
