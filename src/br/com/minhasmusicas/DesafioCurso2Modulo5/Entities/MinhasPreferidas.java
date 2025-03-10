package br.com.minhasmusicas.DesafioCurso2Modulo5.Entities;

public class MinhasPreferidas {

    public void inclue(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto, e preferido por todos.");
        }else {
            System.out.println(audio.getTitulo() + " Também é um dos que todo mundo está curtindo.");
        }


    }


}
