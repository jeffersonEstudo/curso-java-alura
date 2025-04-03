package br.com.alura.PraticandoCurso3Modulo4.Entities;

public class NumeroInteiros {
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
}
