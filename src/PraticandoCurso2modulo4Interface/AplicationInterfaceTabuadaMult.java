package PraticandoCurso2modulo4Interface;

import br.com.alura.PraticandoCurso2modulo4Interface.TabuadaMultiplicação;
import br.com.alura.PraticandoCurso2modulo4Interface.TotalMultiplica;

public class AplicationInterfaceTabuadaMult {

    public static void main(String[] args) {

        TabuadaMultiplicação objTabuada = new TabuadaMultiplicação();
        objTabuada.setValor(5);


        TotalMultiplica objTotal = new TotalMultiplica();
        objTotal.mostra(objTabuada);

    }
}
