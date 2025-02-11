import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int mediaAvaliacao = 0;
        double nota = 0;
        double totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Digite a sua avaliação ou -1 para encerrar: ");
             nota = leitura.nextDouble();

             if(nota != -1) {
                 mediaAvaliacao += nota;
                 totalDeNotas++;
             }
        }

        System.out.println("Média final: " + mediaAvaliacao / totalDeNotas);

    }
}
