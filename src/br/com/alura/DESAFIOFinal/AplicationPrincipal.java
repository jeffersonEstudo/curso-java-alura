package br.com.alura.DESAFIOFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicationPrincipal {
    public static void main(String[] args) {



        Scanner entrada = new Scanner(System.in);
        List<Saldo> listSaldo = new ArrayList<>();

        System.out.println("Digite seu saldo: ");
        double entradaSaldo = entrada.nextDouble();

        System.out.println("Digite a descrição da compra:");
        String entradaProduto = entrada.next();

        System.out.println("Digite o valor da compra:");
        double entradaValor = entrada.nextDouble();

       Saldo refObjSaldo =new Saldo(entradaSaldo,entradaProduto,entradaValor);
        listSaldo.add(refObjSaldo);


            for (Saldo teste: listSaldo) {
            System.out.println(teste.toString());
        }




    }
}
