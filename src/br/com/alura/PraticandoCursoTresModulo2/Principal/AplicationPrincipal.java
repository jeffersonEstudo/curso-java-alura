package br.com.alura.PraticandoCursoTresModulo2.Principal;

import br.com.alura.PraticandoCursoTresModulo2.Entities.Produto;
import br.com.alura.PraticandoCursoTresModulo2.Entities.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;

public class AplicationPrincipal {
    public static void main(String[] args) {

        Produto objProduto = new Produto("Sabão", 10,5);
        Produto obj2Produto = new Produto("Creme",15,10);
        Produto obj3Produto = new Produto("Escova",20, 15);

        ProdutoPerecivel objPerecivel = new ProdutoPerecivel("Leite", 4,3, "04/01/2025");

        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(objProduto);
        listaProduto.add(obj2Produto);
        listaProduto.add(obj3Produto);
        listaProduto.add(objPerecivel);
        System.out.println("Quantidade de produto: " + listaProduto.size());
        System.out.println("Produto pelo indice: " + listaProduto.get(3).toString());


    }
}
