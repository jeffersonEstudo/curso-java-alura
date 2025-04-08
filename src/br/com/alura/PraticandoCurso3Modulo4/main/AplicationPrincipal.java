package br.com.alura.PraticandoCurso3Modulo4.main;

import br.com.alura.PraticandoCurso3Modulo4.Entities.NumeroInteiros;
import br.com.alura.screenmath.modelosLocacaoMove.Modelos.Titulo;

import java.util.*;

public class AplicationPrincipal {
    public static void main(String[] args) {

        NumeroInteiros refeDoObjNumero = new NumeroInteiros(2);
        NumeroInteiros refeDoObjNumero2 = new NumeroInteiros(1);
        NumeroInteiros refeDoObjNumero3 = new NumeroInteiros(3);

        List<NumeroInteiros> lista = new LinkedList<>();
        lista.add(refeDoObjNumero);
        lista.add(refeDoObjNumero2);


        System.out.println(lista.toString());
        Collections.sort(lista);
        System.out.println("Ordenando:");
        lista.sort(Comparator.comparing(NumeroInteiros::getNumber1));
        System.out.println(lista);
    }
}
