package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente;

import br.com.alura.DESAFIOFinal.Entities.Saldo;
import br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente.Entities.SenhaInvalidaException;


import java.util.Scanner;

public class AplicationSenha {
    public static void main(String[] args) {

        System.out.println("Digite sua senha:");
        Scanner entrada = new Scanner(System.in);
        var senha = entrada.next();

        try {
           if (senha.length() > 8 || senha.length() < 8) {
               throw new SenhaInvalidaException("AAAAAAA");
           }else{
               System.out.println("Senha correta.");
           }
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro na senha:");
            System.out.println(e.getMessage());
        }
        System.out.println("o programa finalizou");
    }
}


