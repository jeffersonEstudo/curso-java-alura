package br.com.alura.PraticandoCurso2modulo3Polimorfismo;

import java.util.Random;

public class GeradorPrimo extends NumerosPrimos{
    int numeroAleatorio;



    public int gerarProximoPrimo() {
        Random random = new Random();
        int numero;

        do {
            numero = random.nextInt(10) ; // Gera números entre 1 e 100
        } while (!verificarPrimalidade(numero)); // Continua até encontrar um primo

        System.out.println("Número primo aleatório gerado: " + numero);
        return numero;
    }

}
