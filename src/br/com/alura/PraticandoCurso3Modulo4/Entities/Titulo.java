package br.com.alura.PraticandoCurso3Modulo4.Entities;

public class Titulo implements Comparable<Titulo> {
    private String nome;


    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Titulo: " + nome ;
    }

    @Override
    public int compareTo(Titulo referencia) {
        return this.getNome().compareTo(referencia.getNome());
    }
}
