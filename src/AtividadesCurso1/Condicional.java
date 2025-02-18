package AtividadesCurso1;

public class Condicional {
    public static void main (String[] args){
        int anoDeLancamento = 2022;
        String plano = "Plus";
        boolean incluidNoPlano = true;
        double notaDoFilme = 8.1;

       if (anoDeLancamento >= 2022 && notaDoFilme >=8){
           System.out.printf("Filme mais novo e com avaliação boa!");
           System.out.println();
       }else {
           System.out.println("Filme antigo com avaliação mediana!");
           System.out.println();
       }

       if (incluidNoPlano || plano.equals("Plus")){
           System.out.println("Disponível para assistir.");
           System.out.println();
       }else {
           System.out.println("Contrate o plano Plus ou esteja incluso no Plano.");
           System.out.println();
       }
    }
}
