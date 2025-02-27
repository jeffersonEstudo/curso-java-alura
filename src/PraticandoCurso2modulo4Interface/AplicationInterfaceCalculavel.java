package PraticandoCurso2modulo4Interface;

import br.com.alura.PraticandoCurso2modulo4Interface.LivroInterface;
import br.com.alura.PraticandoCurso2modulo4Interface.ProdutoFisico;
import br.com.alura.PraticandoCurso2modulo4Interface.ResultadoLivro;
import br.com.alura.PraticandoCurso2modulo4Interface.ResultadoProduto;

public class AplicationInterfaceCalculavel {
    public static void main(String[] args) {

        LivroInterface objlivroInterface = new LivroInterface();
        objlivroInterface.setDigital(false);
        objlivroInterface.setQuantidadeLivro(2);
        objlivroInterface.setValor(5);


        ProdutoFisico objProdFisi = new ProdutoFisico();

        objProdFisi.setQuantidadeProduto(3);
        objProdFisi.setValor(5);


        ResultadoLivro objResultado = new ResultadoLivro();
        objResultado.mostra(objlivroInterface);

        ResultadoProduto objprod = new ResultadoProduto();
        objprod.mostra(objProdFisi);




    }
}
