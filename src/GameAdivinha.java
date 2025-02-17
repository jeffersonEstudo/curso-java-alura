import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GameAdivinha {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);
        System.out.println(numeroAleatorio);
        System.out.println("GAME DE ADIVINHAÇÂO");
        System.out.println("Digite um número:");
        System.out.println();
        int numero = leitura.nextInt();
        int tentativas = 5;


        for (int i = 0; i <= tentativas ; i++){


            if(numero != numeroAleatorio){
                System.out.println("Você errou. Número correto é: " + numeroAleatorio);
                break;
            }else {
                System.out.println("Você ACERTOU! " + numero);
                break;
            }

        }
    }
}
