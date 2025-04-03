package br.com.alura.PraticandoCurso3Modulo4.main;

import br.com.alura.PraticandoCurso3Modulo4.Entities.NumeroInteiros;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AplicationPrincipal {
    public static void main(String[] args) {

        NumeroInteiros refeDoObjNumero = new NumeroInteiros(1);
        NumeroInteiros refeDoObjNumero2 = new NumeroInteiros(2);
        NumeroInteiros refeDoObjNumero3 = new NumeroInteiros(3);

        List<NumeroInteiros> lista = new LinkedList<>();
        lista.add(refeDoObjNumero);
        lista.add(refeDoObjNumero2);


        System.out.println(lista.get(0));
        Collections.sort(lista);
        System.out.println();
    }
}
