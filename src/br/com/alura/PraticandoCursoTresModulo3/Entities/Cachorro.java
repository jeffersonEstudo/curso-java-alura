package br.com.alura.PraticandoCursoTresModulo3.Entities;

public class Cachorro  extends Animal{
private String latido;


    public Cachorro(String latido, String corDoPelo ) {
        this.latido = latido;
        this.setCorDoPelo(corDoPelo);
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    @Override
    public String toString() {
        return getLatido();
    }
}
