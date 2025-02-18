package LocaçãoMove;

import com.sun.management.UnixOperatingSystemMXBean;

public class Filme {
    String name;
    int ano;
    int totalNota;
    double mediaNota;
    double duracao;
    double somaNota;

    void descricao(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Duração: " + duracao);
    }

    void avaliacao(){
       somaNota += nota;
       totalNota++;
    }

}
