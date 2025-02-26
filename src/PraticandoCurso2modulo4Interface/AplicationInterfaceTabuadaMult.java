package PraticandoCurso2modulo4Interface;

import br.com.alura.PraticandoCurso2modulo4Interface.CalculadoraSalaRetangular;
import br.com.alura.PraticandoCurso2modulo4Interface.ResultadoCalculo;

public class AplicationInterfaceTabuadaMult {
    public static void main(String[] args) {

        CalculadoraSalaRetangular objSala = new CalculadoraSalaRetangular();
        objSala.setBase(10);
        objSala.setAltura(20);

        ResultadoCalculo objResultado = new ResultadoCalculo();
        objResultado.mostra(objSala);

    }
}
