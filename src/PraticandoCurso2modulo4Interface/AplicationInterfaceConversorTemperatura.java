package PraticandoCurso2modulo4Interface;

import br.com.alura.PraticandoCurso2modulo4Interface.ConversorTemperaturaPadrao;
import br.com.alura.PraticandoCurso2modulo4Interface.MostraConversao;

public class AplicationInterfaceConversorTemperatura {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao objConvPadrao = new ConversorTemperaturaPadrao();
        objConvPadrao.setNumero(30);


        MostraConversao objMostra = new MostraConversao();
        objMostra.mostra(objConvPadrao);


    }
}
