package br.com.alura.PraticandoCursoTresModulo3.Main;

import br.com.alura.PraticandoCursoTresModulo3.Entities.ContaBancaria;

import java.util.ArrayList;



public class AplicationContaBan {
    public static void main(String[] args) {

        ContaBancaria refeObjContaBanc1 = new ContaBancaria(123, 50);
        ContaBancaria refeObjContaBanc2 = new ContaBancaria(321, 60);
        ContaBancaria refeObjContaBanc3 = new ContaBancaria(555, 70);

        ArrayList<ContaBancaria> refeLista = new ArrayList<>();
        refeLista.add(refeObjContaBanc1);
        refeLista.add(refeObjContaBanc2);
        refeLista.add(refeObjContaBanc3);



        ContaBancaria contaMaiorValor = (ContaBancaria) refeLista.get(1);

        for (ContaBancaria contaBancLista: refeLista){

             if (contaBancLista.getSaldo() > contaMaiorValor.getSaldo()) {
                 contaMaiorValor = contaBancLista;
                 System.out.println("Conta com maior saldo é: " + contaMaiorValor);
             }
        }

    }
}
