package br.com.alura.PraticandoCurso3Modulo4.Entities;

import java.util.Collection;
import java.util.Collections;

public class NumeroInteiros implements Comparable<NumeroInteiros> {
  private int number1 ;


    public NumeroInteiros(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    @Override
    public String toString() {
        return "Numero: " + this.getNumber1();
    }

    @Override
    public int compareTo(NumeroInteiros outroNumeros) {
        return this.getNumber1();
    }
}
