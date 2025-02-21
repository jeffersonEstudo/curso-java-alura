package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class Gato extends Animal{

    @Override
    public String getEmitirSom() {
        System.out.println("Gato mia com som de: Miau");
        return emitirSom;
    }
}
