package br.com.alura.DESAFIOFinal.Main;

import br.com.alura.DESAFIOFinal.Entities.CartaoDeCredito;
import br.com.alura.DESAFIOFinal.Entities.Compra;
import br.com.alura.DESAFIOFinal.Entities.Saldo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AplicationCorrecao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Saldo> listSaldo = new ArrayList<>();
        System.out.println("Digite seu limite: ");
        double limite = entrada.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

                Scanner optRep = new Scanner(System.in);
                int repOpt = 1;

                while (repOpt == 1) {

                    System.out.println("Digite a descrição da compra:");
                    String descricao = entrada.next();

                    System.out.println("Digite o valor da compra:");
                    double valor = entrada.nextDouble();

                    Compra compra = new Compra(descricao, valor);
                    boolean compraRealizada = cartao.lancaCompra(compra);

                    if (compraRealizada){
                        System.out.println("Compra realizada!");
                        System.out.println("Digite 0 para sair ou 1 para continuar:");
                        repOpt = optRep.nextInt() ;
                    }else {
                        System.out.println("Saldo insuficiente!");
                        repOpt = 0;
                    }

                }
                 System.out.println("***********************");
                 System.out.println("COMPRAS REALIZADAS:\n");
                 Collections.sort(cartao.getCompras());
                 for (Compra c : cartao.getCompras()) {
                 System.out.println(c.getDescricao() + " - " +c.getValor());
                 }
                 System.out.println("\n***********************");
                 System.out.println("\nSaldo do cartão: " +cartao.getSaldo());

            }
        }
