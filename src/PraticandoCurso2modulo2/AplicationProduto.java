package PraticandoCurso2modulo2;

import br.com.alura.PraticandoCurso2modulo2.Produto;

public class AplicationProduto {
    public static void main(String[] args){
      Produto objetoProduto = new Produto();

      objetoProduto.setNome("Amaciante");
      objetoProduto.setPreco(10);
      objetoProduto.desconto();

    }
}
