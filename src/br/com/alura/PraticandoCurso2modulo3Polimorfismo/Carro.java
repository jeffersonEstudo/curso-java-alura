package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

public class Carro extends ModeloCarro {
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
            int totalAnosPercorridos = anoAtual - ano;
            totalAnosPercorridos *= 1000;
            preco-= totalAnosPercorridos;

              System.out.println("Preço do ano de " + ano + " R$" + preco);


          }


    }


}
