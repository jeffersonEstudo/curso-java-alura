package br.com.alura.PraticandoCurso4Modulo2.Main;

import br.com.alura.PraticandoCurso4Modulo2.Entities.Livro;
import com.google.gson.Gson;

public class AplicationLivraria {
    public static void main(String[] args) {

        String json = """
                {
                "titulo":"Código Limpo",
                "autor":"Jefferson",
                "editora":{
                "nome":"JeffersonWork",
                "cidade":"Salvador"
               }
                
                }
                """;

        Gson gson =  new Gson();
        //Livro refeLivro = gson.fromJson(json, Livro.class);
        Livro refeLivro = gson.fromJson(json, Livro.class);
        System.out.println(refeLivro);

    }
}
