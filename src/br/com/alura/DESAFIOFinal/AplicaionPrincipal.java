package br.com.alura.DESAFIOFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicaionPrincipal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Saldo> listSaldo = new ArrayList<>();
        System.out.println("Digite seu saldo: ");
        var recebe = entrada.nextDouble();

        Saldo refObjSaldo =new Saldo(recebe);
        listSaldo.add(refObjSaldo);
        for (Saldo teste: listSaldo) {
            System.out.println(teste.toString());
        }
    }
}
