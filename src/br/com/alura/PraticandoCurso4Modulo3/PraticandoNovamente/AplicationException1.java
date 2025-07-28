package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente;

import java.util.Scanner;

public class AplicationException1 {
    public static void main(String[] args) {
        try{
            System.out.println("Digite o número que deseja dividir:");
            Scanner entrada = new Scanner(System.in);
            int primeiraEntrada = entrada.nextInt();
            System.out.println("Dividido por:");
            int segundaEntrada = entrada.nextInt();

            var resultado = primeiraEntrada / segundaEntrada;
            System.out.println(primeiraEntrada + " dividido por " + segundaEntrada + " é = " + resultado);
        }
        catch (ArithmeticException e){
            System.out.println("Erro na divisão: ");
            System.out.println(e.getMessage());
        }
        System.out.println("Codigo finalizado.");
    }
}
