package br.com.alura.PraticandoCurso4Modulo2;

import com.google.gson.Gson;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        String json = """
                   {
                   "nome": "jefferson",
                   "idade": "27",
                   "cidade": "Salvador"
                   }
                """;


        System.out.println(json);
        Gson gson = new Gson();

       Pessoa refePessoa = gson.fromJson(json,Pessoa.class) ;
        System.out.println(refePessoa.nome());
        System.out.println(refePessoa.idade());
        System.out.println(refePessoa.cidade());
    }
}
