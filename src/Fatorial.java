import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner leitura =  new Scanner(System.in);
        System.out.println("""
                Fatorial
                Digite um número:
                """);

        int numero = leitura.nextInt();
        int i = 2;
        int total;
       while(i < numero){

          total = numero * (numero - 1) ;

         numero--;
         System.out.println(total);

       }

    }
}
