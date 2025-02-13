import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.util.Scanner;

public class GameAdivinha {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        System.out.println("GAME DE ADIVINHAÇÂO");
        System.out.println("Digite um número");
        int numero = leitura.nextInt();
        int tentativas = 5;
        Random random = new Random();
        int numeroAleatorio = random.nextInt();

        for (int i = 0; i <= tentativas ; i++){

            new Random(numeroAleatorio).nextInt(100);
            if(numero != numeroAleatorio){
                System.out.println("Você errou. O número correto é: " + numeroAleatorio);
                break;
            }else {
                System.out.println("Você ACERTOU!" + numero);
                break;
            }

        }
    }
}
