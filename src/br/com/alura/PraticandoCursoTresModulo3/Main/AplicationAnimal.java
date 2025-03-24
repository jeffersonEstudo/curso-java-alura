package br.com.alura.PraticandoCursoTresModulo3.Main;

import br.com.alura.PraticandoCursoTresModulo3.Entities.Animal;
import br.com.alura.PraticandoCursoTresModulo3.Entities.Cachorro;

import java.util.ArrayList;

public class AplicationAnimal {
    public static void main(String[] args) {

        Cachorro objCachorro = new Cachorro("Au au", "Marrom");

        System.out.println(objCachorro.getLatido());



        ArrayList<Cachorro> lista = new ArrayList<>();
        lista.add(objCachorro);
        System.out.println(lista.toString());


            for (Cachorro item : lista) {

            }
    }
}
