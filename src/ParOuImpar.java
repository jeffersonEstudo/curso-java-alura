import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número:");
        System.out.println();
        int numero = leitura.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("O número " + numero + " é Par.");
        }else {
            System.out.println("O número " + numero + " é impar.");
        }
    }
}
