package PraticandoCurso2modulo2;

public class Aluno {
    private String nome;
    private double notas;
    private int totalNotas;

    public void mostra(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Total de notas: " + notas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        totalNotas++;
    }

    public void calcularMedia(){
       notas /= totalNotas;
        System.out.println("media " + notas);
    }
}
