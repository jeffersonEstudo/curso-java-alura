package PraticandoCurso2modulo2;

public class ContaBancaria {
    private int numeroConta;
    private double saldo ;
    public String titular ;
    private boolean logou ;

  public int setNumeroConta(int numeroConta){
      return this.numeroConta = numeroConta;
  }

   public int getNumeroConta(){
       if(logou) {
           System.out.println("""
                   Número da conta:
                    """ + numeroConta);
           System.out.println();
           return  numeroConta;
       }else {
           System.out.println("""
                   Número da conta:
                   ********
                    """);
           return 0;
       }
   }

    public void setLogou(boolean logou) {
        this.logou = logou;
    }
}
