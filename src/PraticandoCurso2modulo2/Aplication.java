package PraticandoCurso2modulo2;

public class Aplication {
    public static void main(String[] args){

      ContaBancaria objetoContaBancaria = new ContaBancaria();

        int senha = 123;
      if ( senha == 123) {
          objetoContaBancaria.setLogou(true);
          objetoContaBancaria.setNumeroConta(2003);
          objetoContaBancaria.getNumeroConta();

      }else {
          objetoContaBancaria.setLogou(false);
          objetoContaBancaria.getNumeroConta();
      }

    }
}
