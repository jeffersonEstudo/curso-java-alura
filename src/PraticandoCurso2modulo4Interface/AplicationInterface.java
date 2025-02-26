package PraticandoCurso2modulo4Interface;

import br.com.alura.PraticandoCurso2modulo4Interface.ConversorMoeda;
import br.com.alura.PraticandoCurso2modulo4Interface.ValorConvertido;

public class AplicationInterface {
    public static void main(String[] args) {

        ConversorMoeda objConvMoeda = new ConversorMoeda();
        objConvMoeda.setValor(10);
        objConvMoeda.converterDolarParaReal();

        ValorConvertido objValorConvertido = new ValorConvertido();
        objValorConvertido.mostrar(objConvMoeda);

    }
}
