import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        System.out.println("Nome do filme:");
        String nmeFilme = leitura.nextLine();

        System.out.println("Ano de Lançamento:");
        String anoLaça = leitura.nextLine();

        System.out.println("Nota do Filme:");
        double notaFilme = leitura.nextDouble();

        System.out.println("Descrições digitadas:");
        System.out.println(nmeFilme);
        System.out.println(anoLaça);
        System.out.println(notaFilme);

    }
}
