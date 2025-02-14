import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Tabuada
                Digite um número de 1 a 10:
                """);
        int numero = leitura.nextInt();
        int i = 1;
        while (i <= 10){
            int i1 = numero*i;
            System.out.println(numero + "x" + i + " = " + i1);
            i++;
        }

    }
}
