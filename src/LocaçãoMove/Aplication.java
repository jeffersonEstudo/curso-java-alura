package LocaçãoMove;

public class Aplication {
    public static void main(String[] args){
      Filme objetoDaClasseFilme = new Filme();
      objetoDaClasseFilme.name = "O poderoso chefão";
      objetoDaClasseFilme.ano = 1979;
      objetoDaClasseFilme.duracao = 180;


      objetoDaClasseFilme.avaliacao(8);
      objetoDaClasseFilme.avaliacao(5);
      objetoDaClasseFilme.avaliacao(10);

      objetoDaClasseFilme.descricao();
    }
}
