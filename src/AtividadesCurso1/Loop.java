package AtividadesCurso1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args){

        double mediaAvaliacao = 0;
        System.out.println("Digite a quantidade de notas: ");
        Scanner repet = new Scanner(System.in);
       int i = repet.nextInt();
        for ( i=0;i<3; i++){
            Scanner entradaNota = new Scanner(System.in);
            System.out.println("Digite a nota do filme: ");
            double nota= entradaNota.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao/i);
    }
}
