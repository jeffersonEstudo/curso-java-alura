package br.com.alura.PraticandoCurso4Modulo3;

import java.util.Scanner;

public class AplicationExceptionZero {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um número:");
            int numero1 = entrada.nextInt();
            System.out.println("Digite um segundo número:");
            int numero2 = entrada.nextInt();

            System.out.println((numero1/numero2));
        }catch(ArithmeticException e){
            System.out.println("Não é possível dividir o zero por ele mesmo.");
        }




    }
}
