package PraticandoCurso2Modulo3Polimorfismo;

import br.com.alura.PraticandoCurso2modulo3Polimorfismo.Carro;

public class AplicationPrincipal {
    public static void main(String[] args) {

        Carro objetoCarro = new Carro();
        objetoCarro.setPreco(10000);
        objetoCarro.precoMedioAno(2020);
        objetoCarro.setNome("Fashiback");
        objetoCarro.setModelo("Impetos T200");
        objetoCarro.mostra();


    }
}
