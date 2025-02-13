import java.util.Scanner;

public class ComparandoOsCaracteres {
    public static void main (String[] args){
        //Atividade Prática 2 modulo 3 penúltima aula
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        String leitura = scanner.next();
        int numero1 = Character.getNumericValue(leitura.charAt(0));
        int numero2 = Character.getNumericValue(leitura.charAt(1));

        if (numero1 == numero2){

            System.out.println("Números iguais.");

        }
        if (numero1 > numero2){

            System.out.println("Primeiro dígito maior que o segundo.");

        }
        if(numero1 < numero2) {

            System.out.println("Segundo dígito maior que o primmeiro.");

        }
        if (numero1 != numero2){

            System.out.println("Números diferentes.");

        }
    }
}
