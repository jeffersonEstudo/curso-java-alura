package LocaçãoMove;

import br.com.alura.screenmath.modelosLocacaoMove.Filme;

public class AplicationPrincipal {
    public static void main(String[] args){
      Filme objetoDaClasseFilme = new Filme();
      objetoDaClasseFilme.name = "O poderoso chefão";
      objetoDaClasseFilme.ano = 1979;
      objetoDaClasseFilme.duracao = 180;


      objetoDaClasseFilme.avaliacao(8);
      objetoDaClasseFilme.avaliacao(5);
      objetoDaClasseFilme.avaliacao(10);

      objetoDaClasseFilme.descricao();

        //Antes de adicionar o private no atributo totalNota funcionava:
        //System.out.println("Notas totais: " + objetoDaClasseFilme.totalNota);
        //Agora com o private só funciona depois que adicionei o atributo em um (int e depois get) get:
        if (objetoDaClasseFilme.getTotalNota()>1) {
            System.out.println("Notas totais: " + objetoDaClasseFilme.getTotalNota());
        }else {System.out.println("Nota total: " + objetoDaClasseFilme.getTotalNota());
        }
    }
}
