package PraticandoCurso2Modulo3Polimorfismo;

import br.com.alura.PraticandoCurso2modulo3Polimorfismo.ContaBancaria;
import br.com.alura.PraticandoCurso2modulo3Polimorfismo.ContaCorrente;

public class AplicationPrincipalContaBancaria {
    public static void main(String[] args) {
     //Atividade 3


        ContaBancaria objetoContaBancaria = new ContaBancaria();

        objetoContaBancaria.setDepositar(3000);
        objetoContaBancaria.setSaldo(5000);
        objetoContaBancaria.deposita();



        ContaCorrente objetoContaCorrente = new ContaCorrente();

        objetoContaCorrente.setCobrancaAtiva(true);
        objetoContaCorrente.setDescontaContaCorrente(1000);
        objetoContaCorrente.setMesesTotais(3);
        objetoContaCorrente.desconta(objetoContaBancaria);
        objetoContaBancaria.descontaCorrente(objetoContaCorrente);
    }
}
