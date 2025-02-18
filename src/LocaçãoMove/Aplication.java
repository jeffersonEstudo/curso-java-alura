package LocaçãoMove;

public class Aplication {
    public static void main(String[] args){
      Filme mostraFilme = new Filme();
      mostraFilme.name = "O poderoso chefão";
      mostraFilme.ano = 1979;
      mostraFilme.duracao = 180;


      mostraFilme.avaliacao();
      mostraFilme.descricao();
    }
}
