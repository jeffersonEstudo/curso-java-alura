package br.com.alura.PraticandoCurso2modulo2;

public class IdadePessoa {
    private String name;
    private int idade;


    public void mostra(){
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        }else {
            System.out.println("Você é menor de idade.");
        }
    }
}
