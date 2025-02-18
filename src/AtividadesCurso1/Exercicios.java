package AtividadesCurso1;

public class Exercicios {

    public static void main(String[] args){
//Ativ 1
        System.out.println("Ativ 1:");
        int nota1 = 10;
        int nota2 = 45;
        double total = (nota1+nota2)/2;
        String mensagem = String.format("Média é %.2f", total);
        System.out.println(mensagem);

        //Ativ2
        System.out.println("Ativ 2:");
        int vari1 = 10;
        double vari2 = 5.1;
        int total2 = vari1 + (int)(vari2) ;
        String mensagem2 = String.format("Converteu a vari2(%.2f) para inteiro, e somou com a vari1(%d). Total = %d",vari2,vari1,total2 );
        System.out.println(mensagem2);
        System.out.println();

        //Ativ3
        System.out.println("Ativ 3:");
        char caracter1 = 'A';
        char caracter2 = 'O';
        char genero = 'H';
        String palavra = "PREZAD" ;
        String porMH;
        if (genero == 'M'){
            System.out.println(palavra+caracter1);
        }else {System.out.println(palavra+caracter2);}

        //Ativ4
        System.out.println("Ativ 4:");
        double precoProduto = 10.0 ;
        int quantidade = 6;
        int total4 = (int)(precoProduto) * quantidade;
        String mensagem4 = String.format("Total da multiplicação %d",total4);
        System.out.println(mensagem4);


        //Ativ5
        System.out.println("Ativ 5:");
        double valorEmDolares = 1;
        double valorEmReais = 4.94;
        int valorConversao = (int)(valorEmDolares * valorEmReais);
        String mensagem5 = String.format("Valor em dolar %.2f, Conversão do real para inteiro e multiplicando com dolar %d",valorEmDolares,valorConversao);
        System.out.println(mensagem5);

        //Ativ6
        System.out.println("Ativ 6:");
        double precoOriginal = 100;
        double percentualDesconto = 0.3;
        int totalComDesconto = (int)(precoOriginal) - (int)(precoOriginal * percentualDesconto) ;
        String mensagem6 = String.format("De R$%.2f por R$%d",precoOriginal,totalComDesconto);
        System.out.println(mensagem6);



    }
}
