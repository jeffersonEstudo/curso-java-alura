import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner leitura =  new Scanner(System.in);
        System.out.println("""
                Fatorial
                Digite um número:
                """);
        int numero = leitura.nextInt();
        int i;
        for( i = 0; i < numero ; i++){
          int total = numero * i;
         i++;
            System.out.println(total);

        }

    }
}
