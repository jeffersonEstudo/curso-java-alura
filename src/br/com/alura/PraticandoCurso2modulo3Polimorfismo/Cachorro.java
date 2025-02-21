package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class Cachorro extends Animal {

    @Override
    public String getEmitirSom() {
        System.out.println("Cachorro late com som de: Rau");
        return emitirSom;
    }
}
