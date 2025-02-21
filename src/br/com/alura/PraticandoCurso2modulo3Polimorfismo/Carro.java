package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class Carro {
  protected double preco;
  protected int anoAtual = 2025;
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void precoMedioAno(int ano){

          if(ano < anoAtual){
          int total = anoAtual - ano;
          total *= 1000;
           preco-= total;
              System.out.println(preco);
              System.out.println("Preço do ano de " + ano + " R$" + preco);
          }


    }


}
