import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){

        int mediaAvaliacao = 0;
        double nota = 0;
        int repeticoe = (int)nota;

        while (repeticoe != -1){
            System.out.println("Digite a sua avaliação: ");
            Scanner notaDitada = new Scanner(System.in);
            nota = notaDitada.nextDouble();


            mediaAvaliacao += nota;
            repeticoe += nota  ;
            repeticoe ++;
        }

        System.out.println("Média final: " + mediaAvaliacao / repeticoe);

    }
}
