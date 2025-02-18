package AtividadesCurso1;

import java.util.Scanner;

public class NumerosPositivosNegativos {
    public static void main(String[] args){
        //Atividade Prática 1 modulo 3 penúltima aula
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Mostra se o número é positivo ou negativo
                Digite um número:""");
        int digitado = leitura.nextInt();

        if (digitado >= 0) {

            System.out.println("Número " + digitado + " é positivo");
        }else {
            System.out.println("Número " + digitado + " é negativo");
        }
    }
}
