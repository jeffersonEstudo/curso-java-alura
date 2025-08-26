package br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente;

import br.com.alura.DESAFIOFinal.Entities.Saldo;
import br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente.Entities.Senha;
import br.com.alura.PraticandoCurso4Modulo3.PraticandoNovamente.Entities.SenhaInvalidaException;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class AplicationSenha {
    public static void main(String[] args) {

        System.out.println("Digite sua senha:");

        Senha objetoSenha = new Senha();
        //String pegaObje6 = objetoSenha;
        Scanner entrada = new Scanner(System.in);
        String senha = entrada.next();
          // pegaObje6 = senha;



            System.out.println("o programa finalizou");
        }
    }


