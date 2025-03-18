package br.com.alura.PraticandoCurso3ArrayList.AplicationPrincipal;

import br.com.alura.PraticandoCurso3ArrayList.Entities.Pessoas;

import java.util.ArrayList;

public class AplicationPrincipal {
    public static void main(String[] args) {

        Pessoas objPessoas = new Pessoas();
        objPessoas.setNome("Jefferson");
        objPessoas.setIdade(33);

        ArrayList<Pessoas> listaPessoas = new ArrayList<>();
         listaPessoas.add(objPessoas);
        System.out.println(listaPessoas.get(0).toString());

    }
}
