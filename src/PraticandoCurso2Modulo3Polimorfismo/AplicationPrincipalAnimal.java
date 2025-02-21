package PraticandoCurso2Modulo3Polimorfismo;

import br.com.alura.PraticandoCurso2modulo3Polimorfismo.Cachorro;
import br.com.alura.PraticandoCurso2modulo3Polimorfismo.Gato;

public class AplicationPrincipalAnimal {
    public static void main(String[] args){

        Cachorro objetoCachorro = new Cachorro();

        objetoCachorro.getEmitirSom();

        Gato objetoGato = new Gato();

        objetoGato.getEmitirSom();


    }

}
