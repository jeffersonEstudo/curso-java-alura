package br.com.alura.PraticandoCursoTresModulo3.Main;

import br.com.alura.PraticandoCursoTresModulo3.Entities.Percorre;

import java.util.ArrayList;

public class AplicationPrincipal {
    public static void main(String[] args) {

        Percorre objPercorre = new Percorre("Oba");
        Percorre objPercorre2 = new Percorre("Oba2");
        Percorre objPercorre3 = new Percorre("Oba3");

        ArrayList<Percorre> lista = new ArrayList<>();
        lista.add(objPercorre);
        lista.add(objPercorre2);
        lista.add(objPercorre3);


        for (Percorre itens: lista){
            System.out.println(itens.getAleatorio());
        }

    }
}
