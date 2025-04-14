package br.com.alura.PraticandoCurso4Modulo2.Main;

import br.com.alura.PraticandoCurso4Modulo2.Entities.Pessoa;
import com.google.gson.Gson;

public class Aplication {
    public static void main(String[] args) {

        String json = """
                   {
                   "nome": "jefferson",
                   "idade": "27",
                   "cidade": "Salvador",
                   "altura": 1.77
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
