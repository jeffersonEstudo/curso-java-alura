package PraticandoCurso2modulo2;

public class ContaBancaria {
    private int numeroConta;
    private double saldo ;
    public String titular ;
    private boolean logou ;



    public String getTitular(){
        System.out.println("Nome: ");
        System.out.println(titular);
        return titular;
    }
    public String setTitular(String titular){
        return this.titular = titular;
    }

  public int setNumeroConta(int numeroConta){
      return this.numeroConta = numeroConta ;
  }

  public double setSaldo(double saldo){
        return this.saldo = saldo;
  }
   public int getNumeroConta(){
       if(logou) {
           System.out.println("Número da conta: " );
           System.out.println(numeroConta);
           System.out.println();
           System.out.println("Saldo:");
           System.out.println("R$" + saldo);
           return  numeroConta;
       }else {
           System.out.println("Número da conta: ");
           System.out.println("********");
           System.out.println("Saldo:");
           System.out.println("********");
           return 0;
       }
   }

    public void setLogou(boolean logou) {
        this.logou = logou;
    }


}
