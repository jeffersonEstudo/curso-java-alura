package br.com.alura.PraticandoCursoTresModulo3.Main;

import br.com.alura.PraticandoCursoTresModulo3.Entities.Produto;

import java.util.ArrayList;

public class AplationPrincipalProdutos {
    public static void main(String[] args) {

        Produto objProduto1 = new Produto(4);
        Produto objProduto2 = new Produto(5);
        Produto objProduto3 = new Produto(6);

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(objProduto1);
        lista.add(objProduto2);
        lista.add(objProduto3);


        double total = 0;
        for (Produto produto: lista){
            System.out.println("Mostrando cada valor: " + produto.getPreco());
           total += produto.getPreco();
            System.out.println("Total: " + total);
        }
        double media = (objProduto1.getPreco() + objProduto2.getPreco() + objProduto3.getPreco()) / lista.size();
        for (var i=-1 ; i <= lista.size();i++){
            System.out.println("Mostrando cada referencia de objeto " + lista.get(0));
        //System.out.println("Média de preços: " + media );
            System.out.println("Loping " + i);
            System.out.println("Quantos restam: " + lista.size());
            lista.remove(0);
        }



    }
}
