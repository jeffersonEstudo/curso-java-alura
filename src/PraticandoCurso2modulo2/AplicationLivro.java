package PraticandoCurso2modulo2;

import br.com.alura.PraticandoCurso2modulo2.Livro;

public class AplicationLivro {
    public static void main(String[] args){

        Livro objetoLivro = new Livro();

        objetoLivro.setTitulo("Lipica");
        objetoLivro.setAutor("Tommy");
        objetoLivro.exibirDetalhes();

        Livro objetoLivro2 = new Livro();

        objetoLivro2.setTitulo("Zeca");
        objetoLivro2.setAutor("Pagordin");
        objetoLivro2.exibirDetalhes();

    }
}
