package AtividadesCurso1;

import java.util.Scanner;

public class TwoOpctions {
    public static void main (String[] args){
        //Atividade Prática 3 modulo 3 penúltima aula
        Scanner leitura = new Scanner(System.in);
        System.out.println("Aperte 1 para Calcular área do quadrado ou 2 para a calcular área do círculo");
        int optSelect = leitura.nextInt();

        if(optSelect == 1){
            System.out.println("""
                    Calcular a área do quadrado
                    Qual o valor da base?
                    """);
            double base = leitura.nextDouble();
            System.out.println("Qual a altura?");
            System.out.println();
            double altura = leitura.nextDouble() ;
            double total = base * altura ;
            System.out.println("Área do quadrado: " + total);
        }else {
            System.out.println("""
                    Calcular a área do círculo
                    Digite o raio:
                    """);
            double raio = leitura.nextDouble();
            double total = Math.PI * Math.pow(raio, 2);
            System.out.printf("A área do circulo é: %.2f",total);
        }

    }
}
