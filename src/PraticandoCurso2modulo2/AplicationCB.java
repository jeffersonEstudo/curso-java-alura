package PraticandoCurso2modulo2;

import br.com.alura.PraticandoCurso2modulo2.ContaBancaria;

public class AplicationCB {
    public static void main(String[] args){

      ContaBancaria objetoContaBancaria = new ContaBancaria();

      objetoContaBancaria.setTitular("Raimunda");
      objetoContaBancaria.getTitular();


      int senha = 123;
      if ( senha == 123) {
          objetoContaBancaria.setLogou(true);
          objetoContaBancaria.setNumeroConta(10000);
          objetoContaBancaria.setSaldo(50000);
          objetoContaBancaria.getNumeroConta();

      }else {
          objetoContaBancaria.setLogou(false);
          objetoContaBancaria.getNumeroConta();
      }

    }
}
