package br.com.alura.PraticandoCurso3ArrayList.AplicationPrincipal;

import br.com.alura.PraticandoCurso3ArrayList.Entities.Pessoas;

import java.util.ArrayList;

public class AplicationPrincipal {
    public static void main(String[] args) {

        Pessoas objPessoas = new Pessoas();
        Pessoas objPessoas2 = new Pessoas();
        Pessoas objPessoas3 = new Pessoas();
        objPessoas.setNome("Jefferson");
        objPessoas2.setNome("Israel");
        objPessoas3.setNome("Oto");
        objPessoas.setIdade(27);
        objPessoas2.setIdade(22);
        objPessoas3.setIdade(30);

        ArrayList<Pessoas> listaPessoas = new ArrayList<>();
         listaPessoas.add(objPessoas);
         listaPessoas.add(objPessoas2);
         listaPessoas.add(objPessoas3);
        System.out.println("Tamanho da lista: " + listaPessoas.size());
        System.out.println("Primeira pessoa: " + listaPessoas.get(0).getNome());
        System.out.println(listaPessoas);


    }
}
