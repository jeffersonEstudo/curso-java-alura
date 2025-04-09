package br.com.alura.PraticandoCurso3Modulo4.main;

import br.com.alura.PraticandoCurso3Modulo4.Entities.NumeroInteiros;
import br.com.alura.PraticandoCurso3Modulo4.Entities.Titulo;

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


        Titulo refeObjTitulo = new Titulo("Bora bora");
        Titulo refeObjTitulo2 = new Titulo("Aora aora");

        List<Titulo> listTitulo = new ArrayList<>();
        listTitulo.add(refeObjTitulo);
        listTitulo.add(refeObjTitulo2);

        System.out.println(listTitulo);
        System.out.println("Agora em Ordem alfabetica:");
        Collections.sort(listTitulo);
        System.out.println(listTitulo);

        List<String> listTitulo2;
        listTitulo2 = new ArrayList<>();
        listTitulo2.add("Testando Obj");
        listTitulo2.add("Ab");

        System.out.println(listTitulo2);
        System.out.println("Agora em Ordem alfabetica:");
        Collections.sort(listTitulo2);
        System.out.println(listTitulo2);


    }
}
