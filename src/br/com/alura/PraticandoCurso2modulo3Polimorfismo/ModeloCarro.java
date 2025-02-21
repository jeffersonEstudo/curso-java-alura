package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class ModeloCarro {
    protected String nome;
    protected String modelo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostra(){
        System.out.println("Nome do carro: " + nome);
        System.out.println("Modelo: " + modelo);
    }
}
